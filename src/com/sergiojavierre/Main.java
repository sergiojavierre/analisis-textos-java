package com.sergiojavierre;

import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Lector lector = new LectorTXT();
        String texto = lector.lee("el_quijote.txt");
        GestorTexto gestorTexto = new GestorTexto(texto);
        gestorTexto.separarPalabras();
    }
}
