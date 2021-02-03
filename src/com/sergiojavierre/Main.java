package com.sergiojavierre;

import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GestorTexto gestorTexto = new GestorTexto();
        // write your code here
        Lector lector = new LectorTXT();
        String texto = lector.lee("el_quijote.txt");
        gestorTexto.separarPalabras(texto);
    }
}
