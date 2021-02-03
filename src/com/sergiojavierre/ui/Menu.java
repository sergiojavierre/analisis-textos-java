package com.sergiojavierre.ui;

import com.sergiojavierre.GestorTexto;
import com.sergiojavierre.lector.Lector;
import com.sergiojavierre.lector.LectorTXT;

import java.util.Scanner;

public class Menu {
    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1- Escoge un atajo ");
            String opcion = sc.nextLine();
            if (opcion.equals("1")){
                System.out.println("A) Numero de palabras");
                System.out.println("B) Palabras relacionadas");
                Lector lector = new LectorTXT();
                String texto = lector.lee("el_quijote.txt");
                GestorTexto gestorTexto = new GestorTexto(texto);
                if (opcion.equals("A")){
                    gestorTexto.contarTodasPalabras();
                }
                else if (opcion.equals("B")){
                    gestorTexto.buscarpalabra();
                }
            }
        }
    }
}
