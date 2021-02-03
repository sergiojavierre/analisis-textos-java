package com.sergiojavierre;

import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Lector lector = new LectorTXT();
        String texto = lector.lee("el_quijote.txt");
        texto = texto.toLowerCase(Locale.ROOT);
        List<String> caracteres = new ArrayList<>(List.of(".",",",";",":","–","?","¿","!","¡","(",")","\n"));
        for (String caracter:caracteres){
            texto = texto.replace(caracter,"");
        }
       // texto = texto.replaceAll("",""") //uso con expresiones

        String[] separar = texto.split(" ");
        LinkedHashMap<String, Integer> mapaPalabras = new LinkedHashMap<>();
        for (int i = 0; i < separar.length; i++) {
            //System.out.println(separar[i]);
            if (mapaPalabras.containsKey(separar[i])){
                mapaPalabras.put(separar[i], mapaPalabras.get(separar[i]) + 1);

            }else {
                mapaPalabras.put(separar[i],1);
            }
        }
        System.out.println(mapaPalabras.keySet());
/*
        for (Object key:mapaPalabras.keySet()){
            System.out.println(key);
        }
        */


    }
}
