package com.arquitecturajava.rest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/reactivo")
public class ControladorReactivoHola {

    @Autowired
    HolaReactivoService reactivoService;

    @GetMapping(value = "/hola")
    public Mono<String> hola() {
        return reactivoService.hola();
    }

    @GetMapping(value = "/hola2")
    public Mono<String> hola2() {
        return reactivoService.hola2();
    }

    @GetMapping(value = "/holas")
    public Flux<String> holas() {

        long t1= System.currentTimeMillis();

        // Ejecucion de los 3 metodos de forma reactiva
        Flux<String> texto  = Flux.merge(reactivoService.hola(), reactivoService.hola2(), reactivoService.hola3());

        long t3= System.currentTimeMillis();
        System.out.println(t3-t1);
        
        return texto;
    }

}
