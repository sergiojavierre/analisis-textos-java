package com.sergiojavierre;

import java.util.*;

public class GestorTexto {
    private String texto;
    LinkedHashMap<String, Integer> mapaPalabras = new LinkedHashMap<>();
    String[] palabras = new String[]{};


    public GestorTexto(String texto) {
        this.texto = texto;
        separarPalabras();
    }

    private void separarPalabras(){
        texto = texto.toLowerCase(Locale.ROOT);
        List<String> caracteres = new ArrayList<>(List.of(".",",",";",":","–","?","¿","!","¡","(",")","\n","{","}","-","»","«"));
        for (String caracter:caracteres){
            texto = texto.replace(caracter,"");
        }
        palabras = texto.split(" ");
        contarTodasPalabras();
        buscarpalabra();
    }

    public void contarTodasPalabras(){

        for (int i = 0; i < palabras.length; i++) {
            //System.out.println(separar[i]);
            if (mapaPalabras.containsKey(palabras[i])){
                mapaPalabras.put(palabras[i], mapaPalabras.get(palabras[i]) + 1);

            }else {
                mapaPalabras.put(palabras[i],1);
            }
        }
/*
        for (Object key:mapaPalabras.keySet()){
            System.out.println(key+" "+mapaPalabras.get(key));
        }

 */
    }

    public void buscarpalabra(){
        String palabra = "d";
        if (mapaPalabras.containsKey(palabra)){
            System.out.println(palabra+" "+mapaPalabras.get(palabra));
        }
    }

}
