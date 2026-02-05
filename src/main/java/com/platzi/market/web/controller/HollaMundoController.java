package com.platzi.market.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HollaMundoController {

    @GetMapping("/Hola")
    public String saludar(){
        return "Hola Juanjo, Confia en ti, tú eres capaz";
    }


    @GetMapping("/Maia")
    public String saludar1(){
        return "Hola mi Maia, Te amo con todo mi corazoncito ❤️🥰 ";
    }
}
