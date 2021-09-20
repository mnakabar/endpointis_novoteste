package com.example.demo.controller;

import com.example.demo.Anuncio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicarAnuncio {

    @GetMapping("/anuncios")
    public Anuncio endPoint(){
        Anuncio anuncio = new Anuncio("PC 50", "NoteBook","p s5",5000.7);

        return anuncio;
    }


}
