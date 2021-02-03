package com.sergiojavierre;

import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lector lector = new LectorTXT();
        String texto = lector.lee("el_quijote.txt");
        String [] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
