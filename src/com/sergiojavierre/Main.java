package com.sergiojavierre;

import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lector lector = new LectorTXT();
        String texto = lector.lee("recurso.txt");
        System.out.println(texto);
    }
}
