package com.example.demo;

import lombok.Data;

@Data
public class Anuncio {

    private String nome;
    private String tipo;
    private String relevancia;
    private double preco;

    public Anuncio(String nome, String tipo, String relevancia, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.relevancia = relevancia;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", relevancia='" + relevancia + '\'' +
                ", preco=" + preco +
                '}';
    }
}
