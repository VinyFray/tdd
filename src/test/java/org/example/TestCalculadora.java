package org.example;


import junit.framework.Assert;
import junit.framework.TestCase;

public class TestCalculadora extends TestCase {

    public TestCalculadora(String testName) {
        super(testName);
    }

    public void testSomaEmCasoDeDoisNumeroPositivos(){
        Calculdora calculadora = new Calculdora();

        int resultado = calculadora.soma(2, 2);

        Assert.assertEquals(4, resultado);
    }

    public void testSomaCasoDeUmNumeroPositivoEOutroNegativo(){
        Calculdora calculadora = new Calculdora();

        int resultado = calculadora.soma(2, -1);

        Assert.assertEquals(1, resultado);
    }

    public void testCasoDoisNumeroNegativos(){
        Calculdora calculadora = new Calculdora();

        int resultado = calculadora.soma(-1, -1);

        Assert.assertEquals(-2, resultado);
    }
}
