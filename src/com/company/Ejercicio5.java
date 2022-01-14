package com.company;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float gradosTemperatura = llegirFloat("Escribe los grados de temperatura", -457 , 2000);
        System.out.println("Los grados son Celsius[C] o Fahrenheit[F]");
        String magnitud = input.nextLine();
        if (magnitud.equalsIgnoreCase("c")){
            float grausFarenheit = CelciusaFahrenheit(gradosTemperatura);
            System.out.println("La temperatura en Farhenheit es de :" + grausFarenheit + " ºF");

        }else if (magnitud.equalsIgnoreCase("f")){
            float grausCelsius = CelciusaFahrenheit(gradosTemperatura);
            System.out.println("La temperatura en Celsius es de: " + grausCelsius + "ºC");
        }else{
            System.out.println("Opcion incorrecta");
        }
    }
        public static float CelciusaFahrenheit (float grausCelsius){
        float grausFarenheit = 0;
        grausFarenheit = (9.0f / 5)* grausCelsius + 32;
        return grausFarenheit;
    }

        public static float FahrenheitaCelsius (float grausFahrenheit){
        float grausCelsius = 0;
        grausCelsius = (5.0f / 9) * (grausFahrenheit-32);
        return grausCelsius;
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
}
