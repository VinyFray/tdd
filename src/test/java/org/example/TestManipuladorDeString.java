package org.example;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestManipuladorDeString extends TestCase {

    public TestManipuladorDeString(String name) {
        super(name);
    }

    public void testCasoDeConverterStringParaMaiusculoSempreQueAPalavraConteraLetraM(){
        ManipuladorDeString manipulador = new ManipuladorDeString();

        String resultado = manipulador.converterPalaraParaManiscula("Maria");

        Assert.assertEquals("MARIA", resultado);
    }

    public void testCasoDeConverterStringParaMinusculaQuandoNaoTemosMNaPalavra(){
        ManipuladorDeString manipulador = new ManipuladorDeString();

        String resultado = manipulador.converterPalaraParaManiscula("AVIÃO");

        Assert.assertEquals("avião", resultado);
    }

    public void testCasoStringTenhaEspacoTranformarEmCamelCase(){
        ManipuladorDeString manipulador = new ManipuladorDeString();

        String resultado = manipulador.converterPalaraParaManiscula("O Rato Roeu");

        Assert.assertEquals("ORatoRoeu", resultado);
    }

}
