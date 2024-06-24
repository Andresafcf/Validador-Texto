package com.proyecto.clases;

public class SalidaTexto {
    private String fraseModificada;
    private boolean numeroDePalabras;

    public SalidaTexto(String fraseModificada, boolean numeroDePalabras) {
        this.fraseModificada = fraseModificada;
        this.numeroDePalabras = numeroDePalabras;
    }

    public SalidaTexto() {
		// TODO Auto-generated constructor stub
	}

	public String getFraseModificada() {
        return fraseModificada;
    }

    public void setFraseModificada(String fraseModificada) {
        this.fraseModificada = fraseModificada;
    }

    public boolean isNumeroDePalabras() {
        return numeroDePalabras;
    }

    public void setNumeroDePalabras(boolean numeroDePalabras) {
        this.numeroDePalabras = numeroDePalabras;
    }
}