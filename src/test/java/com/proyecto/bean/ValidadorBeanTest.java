//package com.proyecto.bean;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import com.proyecto.clases.SalidaTexto;
//
//import java.util.List;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ValidadorBeanTest {
//
//    private ValidadorBean validadorBean;
//
//    @BeforeEach
//    public void setUp() {
//        validadorBean = new ValidadorBean();
//        validadorBean.setTextoEntrada("");
//    }
//    
//    @Test
//    public void testProcesarTexto_ErrorDeFormato() {
//        // Caso de error de formato (separador no encontrado)
//        validadorBean.setTextoEntrada("3 Hello World\n5 This is a test");
//        validadorBean.procesarTexto();
//
//        List<SalidaTexto> textoSalidaList = validadorBean.getTextoSalidaList();
//        assertTrue(textoSalidaList.isEmpty());
//        assertEquals("ERROR DE FORMATO", validadorBean.getMensaje());
//    }
//
//    @Test
//    public void testProcesarTexto_SinTextoEntrada() {
//        // Caso sin texto de entrada
//        validadorBean.setTextoEntrada("");
//        validadorBean.procesarTexto();
//
//        List<SalidaTexto> textoSalidaList = validadorBean.getTextoSalidaList();
//        assertTrue(textoSalidaList.isEmpty());
//        assertEquals("", validadorBean.getMensaje());
//    }
//
//    @Test
//    public void testContarPalabras() {
//        // Caso de prueba para el método contarPalabras
//        int resultado = validadorBean.contarPalabras("Hello World");
//        assertEquals(2, resultado);
//    }
//    
//}