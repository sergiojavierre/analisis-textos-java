package com.sergiojavierre;

import java.util.*;

public class GestorTexto {
    private String texto;
    LinkedHashMap<String, Integer> mapaPalabras = new LinkedHashMap<>();
    LinkedHashMap<String, Integer> contadorPalabras = new LinkedHashMap<>();
    String[] palabras = new String[]{};


    public GestorTexto(String texto) {
        this.texto = texto;
        separarPalabras();
    }

    private void separarPalabras() {
        texto = texto.toLowerCase(Locale.ROOT);
        List<String> caracteres = new ArrayList<>(List.of(".", ",", ";", ":", "–", "?", "¿", "!", "¡", "(", ")", "\n", "{", "}", "-", "»", "«"));
        for (String caracter : caracteres) {
            texto = texto.replace(caracter, "");
        }
        palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (mapaPalabras.containsKey(palabras[i])) {
                mapaPalabras.put(palabras[i], mapaPalabras.get(palabras[i]) + 1);

            } else {
                mapaPalabras.put(palabras[i], 1);
            }
        }
    }

    public void contarTodasPalabras() {
        for (Object key : mapaPalabras.keySet()) {
            System.out.println(key + " " + mapaPalabras.get(key));
        }
    }

    public void buscarpalabra(String palabra) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)){
                String antes = null, despues = null;
                if(i > 0){
                    antes = palabras[i-1];
                }
                if(i < palabras.length-1){
                    despues = palabras[i+1];
                }

                System.out.println(antes+", "+palabra+", "+despues);

                if (antes != null) {
                    Integer veces = contadorPalabras.get(antes);
                    if(veces == null) veces = 0;
                    contadorPalabras.put(antes, veces + 1);
                }
                if (despues != null){
                    Integer veces = contadorPalabras.get(despues);
                    if(veces == null) veces = 0;
                    contadorPalabras.put(despues, veces + 1);
                }

            }
        }
    }
}
