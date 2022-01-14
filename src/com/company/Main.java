package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean sortir = false;
        while (true) {
            System.out.println("Introduce un numero");
            int numero = input.nextInt();
            if (esParell(numero)) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
            System.out.println("buenos dias makina");
            System.out.println("Son las 10:20");
            System.out.print("Es hora de levantarse");
        }

    }
    public  static boolean esParell(int number){
        return number % 2 == 0; //% significa que hacemos la division y el resto es 0
    }
}


