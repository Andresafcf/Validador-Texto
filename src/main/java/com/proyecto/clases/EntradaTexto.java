package com.proyecto.clases;

public class EntradaTexto {
    private int numero;
    private String frase;

    public EntradaTexto(int numero, String frase) {
        this.numero = numero;
        this.frase = frase;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}