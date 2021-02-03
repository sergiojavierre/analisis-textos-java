package com.sergiojavierre.ui;

import com.sergiojavierre.GestorTexto;
import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        Lector lector = new LectorTXT();
        String texto = lector.lee("el_quijote.txt");
        GestorTexto gestorTexto = new GestorTexto(texto);
        while (true){
            System.out.println("1- Escoge un atajo\nOpcion: ");
            String opcion = sc.nextLine();
            if (opcion.equals("1")){
                System.out.println("A) Numero de palabras\nB) Palabras relacionadas\nC) Salir\nOpcion: ");
                String opcion2 = sc.nextLine();
                opcion2 = opcion2.toUpperCase(Locale.ROOT);
                if (opcion2.equals("A")){
                    gestorTexto.contarTodasPalabras();

                }
                else if (opcion2.equals("B")){
                    gestorTexto.buscarpalabra();
                }
                else if (opcion2.equals("C")){
                    break;
                }
            }
        }
    }
}
