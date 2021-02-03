package com.sergiojavierre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorTexto {
    String[] palabras = new String[]{};

    public void separarPalabras(String texto){
        List<String> caracteres = new ArrayList<>(List.of(".",",",";",":","–","?","¿","!","¡","(",")","{","}","«","»","'","-","\""));
        for (String caracter:caracteres){
            texto = texto.replace(caracter,"");
        }
        palabras = texto.split(" |\n");
        contarTodasPalabras();
    }

    private void contarTodasPalabras(){
        HashMap<String, Integer> mapaPalabras = new HashMap<>(palabras.length);
        for (int i = 0; i < palabras.length; i++) {
            if (mapaPalabras.containsKey(palabras[i])){
                mapaPalabras.put(palabras[i], mapaPalabras.get(palabras[i]) + 1);

            }else {
                mapaPalabras.put(palabras[i],1);
            }
        }
        System.out.println(mapaPalabras);
    }
}
