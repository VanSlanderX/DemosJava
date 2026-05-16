package com.arquitecturajava.rest1;

import java.time.Duration;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HolaReactivoService {

    public Mono<String> hola() {

        return Mono.just("hola asincrono\n").delayElement(Duration.ofSeconds(3));
    }

    public Mono<String> hola2() {

        return Mono.just("hola asincrono 2\n").delayElement(Duration.ofSeconds(3));
    }

    public Mono<String> hola3() {

        return Mono.just("hola asincrono 3\n").delayElement(Duration.ofSeconds(5));
    }

}
