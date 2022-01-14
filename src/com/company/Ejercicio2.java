package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numerosUsuario = new int[6];
        int [] sorteo = new int [6];
        System.out.println("Introduce tus 6 numeros de la primitiva");
        for (int i =0; i < numerosUsuario.length  ;i++){
            numerosUsuario[i] = input.nextInt();
        }
        input.nextLine();

        System.out.println("Aposta usuario");
        for (int i = 0; i < numerosUsuario.length; i++) {
            System.out.print(numerosUsuario[i] + " ");
        }
        System.out.println();
        System.out.println("Sorteo: ");
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = (int) (Math.random()*50);
            System.out.print(sorteo [i] + " ");
        }
        System.out.println();
        int nombreAciertos = NumeroAcertado(numerosUsuario, sorteo);
        System.out.println("Has obtingut " + nombreAciertos + " aciertos");

    }


    public static int NumeroAcertado(int ApostaUsuario[], int ApostaGuanyadora[] ){
        int encerts = 0;
        for (int i = 0; i < ApostaUsuario.length ; i++) {
            for (int j = 0; j < ApostaGuanyadora.length ; j++) {
                if (ApostaUsuario[i] == ApostaGuanyadora[j]){
                    encerts++;
                }

            }
        }
        return encerts;
    }
}
