package org.example.postconstructdemo.business;

import jakarta.annotation.PostConstruct;
import org.example.postconstructdemo.util.ApplicationProperties;
import org.springframework.stereotype.Service;

@Service
public class MainClass {

    private final ApplicationProperties properties;

    public MainClass(ApplicationProperties properties) {
        this.properties = properties;
    }

    /** La anotacion @PostConstruct indica que el metodo debe ejecutarse automaticamente despues de la inyeccion de
        dependencias y antes de que el bean esté completamente disponible. Es ideal para inicializar recursos,
        validar configuraciones o cargar datos necesarios.
     **/
    @PostConstruct
    public void init() {
        System.out.println(
                properties.getVar1()
                .concat(" ")
                .concat(properties.getMyVar2())
                .concat(" ")
                .concat(properties.getMyVar3()));
    }
}
