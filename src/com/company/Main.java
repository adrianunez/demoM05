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
        }

    }
    public  static boolean esParell(int number){
        return number % 2 == 0; //% significa que hacemos la division y el resto es 0
    }
}

