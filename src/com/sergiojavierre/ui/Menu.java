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

                System.out.println("A) Numero de palabras\nB) Palabras relacionadas\nC) Salir\nOpcion: ");
                String opcion2 = sc.nextLine();
                opcion2 = opcion2.toUpperCase(Locale.ROOT);
                if (opcion2.equals("A")){
                    gestorTexto.contarTodasPalabras();

                }
                else if (opcion2.equals("B")){
                    System.out.print("Elije una palabra a buscar\nOpcion:");
                    String palabra = sc.nextLine();
                    gestorTexto.buscarpalabra(palabra);
                }
                else if (opcion2.equals("C")){
                    break;
                }
            }
        }
}
