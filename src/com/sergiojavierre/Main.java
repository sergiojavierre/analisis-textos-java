package com.sergiojavierre;

import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Lector lector = new LectorTXT();
        String texto = lector.lee("el_quijote.txt");
        List<String> caracteres = new ArrayList<>(List.of(".",",",";",":","-","?","¿","!","¡","(",")"));
        for (String caracter:caracteres){
            texto = texto.replace(caracter,"");
        }
        String[] separar = texto.split(" ");
        for (int i = 0; i < separar.length; i++) {
            System.out.println(separar[i]);
        }
    }
}
