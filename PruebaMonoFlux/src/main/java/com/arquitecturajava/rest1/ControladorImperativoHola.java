package com.arquitecturajava.rest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/imperativo")
public class ControladorImperativoHola {

    @Autowired
    HolaImperativoService imperativoServicio;

    @RequestMapping("/hola")
    public String hola() {

        return imperativoServicio.hola();
    }

    @RequestMapping("/hola2")
    public String hola2() {

        return imperativoServicio.hola2();
    }

    /**
     * Al llamar a los 3 metodos, se ejecutan de forma sincrona, hay que esperar a que finalice el primero,
     * para ejecutar el segundo, y esperar que el segundo termine para ejecutar el tercero.
     * Esto hace que la aplicacion demore un tiempo total de 11 segundos
     */
    @RequestMapping("/holas")
    public String holas() {

        long t1= System.currentTimeMillis();

        // Ejecucion de los 3 metodos de forma imperativa
        String texto = imperativoServicio.hola() + imperativoServicio.hola2() + imperativoServicio.hola3();

        long t3= System.currentTimeMillis();
        System.out.println(t3-t1);

        return texto;

    }

}
