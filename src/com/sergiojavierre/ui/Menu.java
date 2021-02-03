package com.sergiojavierre.ui;

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
                if (opcion.equals("A")){

                }
                else if (opcion.equals("B")){
                }
            }
        }
    }
}
