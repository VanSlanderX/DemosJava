package com.arquitecturajava.rest1;

import org.springframework.stereotype.Service;

@Service
public class HolaImperativoService {

    public String hola() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hola sincrono\n";
    }

    public String hola2() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hola sincrono 2\n";
    }

    public String hola3() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hola sincrono 3\n";
    }

}
