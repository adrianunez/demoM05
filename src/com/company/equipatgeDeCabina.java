package com.company;

import java.util.Scanner;

public class equipatgeDeCabina {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float weight = 0, height = 0, width = 0, depth = 0;
        System.out.println("Cheking, Introdueix les dades de la maleta de ma: ");
        System.out.println("Pes: ");
        weight = llegirFloat("a", 0 ,200);
        System.out.println("Alçada: "); //Altura
        height = input.nextFloat();
        System.out.println("Amplada "); //Ancho
        width = input.nextFloat();
        System.out.println("Fondaria "); //Fondo
        depth = input.nextFloat();
        checkingCabinBag(weight,height,width,depth);
    }



    public static  float llegirFloat(String missatge, int minValue, int maxValue){
        Scanner input = new Scanner(System.in);
        boolean correcte = false;
        float numero = 0;
        while (!correcte){
        if (input.hasNextFloat()){
            numero = input.nextFloat();
            if (numero > minValue && numero < maxValue){
                correcte = true;
            }else{
                System.out.println("Tiene que estar entre 0 y 200");
            }
        }else{
            System.out.println("Tienes que introducir un numero");
        }
        input.nextLine();
        }
        return numero;
    }

    public static void checkingCabinBag(float weight, float height, float width, float depth) {
        final float MAX_WEIGHT = 10.0f; //kg
        final float MAX_HEIGHT = 55.0f; //cm
        final float MAX_WIDTH = 40.0f; //cm
        final float MAX_DEPTH = 20.0f; //cm

        boolean isCabinBag = weight <= MAX_WEIGHT && height <= MAX_HEIGHT && width <= MAX_WIDTH && depth <= MAX_DEPTH;
        if (isCabinBag) {
            System.out.println("Ok, it is a cabin bag.");
        } else {
            System.out.println("Sorry, it is not a cabin bag.");
            System.out.println("It is necessary to check it.");
        }
    }
}