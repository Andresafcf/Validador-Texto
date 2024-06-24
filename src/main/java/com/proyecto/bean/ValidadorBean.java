package com.proyecto.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.proyecto.clases.SalidaTexto;

@ManagedBean(name ="validadorBean")
@ViewScoped

public class ValidadorBean {
	
	private String textoEntrada = "";
	private String mensaje = "";
    private List<SalidaTexto> textoSalidaList = new ArrayList<>();

	public void procesarTexto() {
    	String separador ="\\";
        textoSalidaList.clear(); // Limpiamos la lista anterior antes de procesar nueva entrada

        if (textoEntrada != null && !textoEntrada.isEmpty()) {
            String[] lineas = textoEntrada.split("\n");
            for (String linea : lineas) {
            	if (linea.contains(separador)) {
					String[] partes = linea.split("\\\\");
	                if (partes.length == 2) {
	                    int numero = Integer.parseInt(partes[0]);
	                    String frase = partes[1].trim();
	
	                    // Procesamiento de la frase
	                    String fraseModificada = "\n";
	                    fraseModificada += frase.replaceAll("[^a-zA-Z ]", "").toLowerCase().concat(separador);
	                    boolean numeroDePalabras = contarPalabras(frase) == numero;
	
	                    SalidaTexto salidaTexto = new SalidaTexto(fraseModificada, numeroDePalabras);
	                    textoSalidaList.add(salidaTexto);
	                }
				} else {
					textoSalidaList.clear();
					mensaje = "ERROR DE FORMATO";
					break;
				}  
            }
        }
    }

    public int contarPalabras(String frase) {
        String[] palabras = frase.split("\\s+");
        return palabras.length;
    } 
    
    public String getTextoEntrada() {
        return textoEntrada;
    }

    public void setTextoEntrada(String textoEntrada) {
        this.textoEntrada = textoEntrada;
    }

    public List<SalidaTexto> getTextoSalidaList() {
        return textoSalidaList;
    }
	
    public void setTextoSalidaList(List<SalidaTexto> textoSalidaList) {
			this.textoSalidaList = textoSalidaList;
	}
    
    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
