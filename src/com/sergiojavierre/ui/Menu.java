package com.sergiojavierre.ui;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1- Escoge un atajo\nOpcion: ");
            String opcion = sc.nextLine();
            if (opcion.equals("1")){
                System.out.println("A) Numero de palabras\nB) Palabras relacionadas\nC) Salir\nOpcion: ");
                String opcion2 = sc.nextLine();
                opcion2 = opcion2.toUpperCase(Locale.ROOT);
                if (opcion2.equals("A")){

                }
                else if (opcion2.equals("B")){
                }

                else if (opcion2.equals("C")){
                    break;
                }
            }
        }
    }
}
