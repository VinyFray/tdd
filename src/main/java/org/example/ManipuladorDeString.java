package org.example;

import java.util.Arrays;

public class ManipuladorDeString {

    public String converterPalaraParaManiscula(String text){
        if(text.contains(" ")){
            String[] strings = text.split(" ");
            StringBuilder result = new StringBuilder();
            for (String s : strings){
                result.append(s);
            }
            return result.toString();
        }
        if (text.contains("m") || text.contains("M")){
            return text.toUpperCase();
        }
        return text.toLowerCase();
    }
}
