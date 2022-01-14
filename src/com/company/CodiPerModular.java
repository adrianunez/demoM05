package com.company;

import java.util.Scanner;

public class CodiPerModular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicions = 10;
        int[] a = new int[posicions];
        int[] b = new int[posicions];
        int[] c = new int[posicions * 2];

        a=modularArray(posicions);
        b=modularArray(posicions);

        c=intercalarArrays(a,b);

        mostrarArray(a, "Els nombres que has introduït en a:");
        mostrarArray(b, "Els nombres que has introduït en b:");
        mostrarArray(c, "Els nombres que has introduït en c:");
    }

    /**
     * Converteix en array els nombres introduïts per teclayt
     * @param posicions: Quantitat de valors qjue contindrà l'array
     * @return Array de nombres amb les posicions demanades
     */

    public static int[] modularArray(int posicions) {
        int[] array = new int[posicions];
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix els "+posicions+" nombres del " +
                "segon vector seguits separats per espais:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.nextLine();
        return array;
    }

    /**
     * Mostra per consola el contingut de l'array d'enters rebut separat per spais
     * @param array: Array de valors a mostrar per consola
     * @param missatge: Missatge que es mostrara previ al array
     */
    public static void mostrarArray(int array[] , String missatge) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

    /**
     * Entrellaça els dos array rebuts per parametre y retorna un nou array.
     * <b> Aquest metode nomes funciona amb arrays amb la meteixa longitud.<b/>
     * @param array1
     * @param array2
     * @returnArray resultant amb el contingunt entrellaçat dels dos arrays
     * @throws IndexOutOfBoundsException si array1.lenght != array2.lenght
     */
    public static int[] intercalarArrays(int[] array1, int[]array2){
        int [] arrayResultat = new int [array1.length * 2];
        System.out.println("El vector intercalat es: 3");
        for (int i = 0; i < arrayResultat.length; i+=2) {
            arrayResultat[i]= array1[i/2];
            arrayResultat[i+1]= array2[i/2];
        }
        return arrayResultat ;
    }
}




