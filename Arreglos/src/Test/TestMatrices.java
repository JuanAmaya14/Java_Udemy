package Test;

import Domain.Persona;

import java.util.Random;
import java.util.Scanner;

public class TestMatrices {

    public static void main(String[] args) {

        int edades[][] = new int[3][2];

        Random random = new Random();

        for (int f = 0; f < edades.length; f++) {

            for (int c = 0; c < edades[f].length; c++) {

                edades[f][c] = random.nextInt(1 + 100);

            }

        }

        for (int f = 0; f < edades.length; f++){

            for (int c = 0; c < edades[f].length; c++){

                System.out.print ("|" + edades[f][c] + "\t");

            }
            System.out.println("|");
        }

        //---PERSONAS---

//
//        Persona personas[][] = new Persona[2][3];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int f = 0; f < personas.length; f++) {
//
//            for (int c = 0; c < personas[f].length; c++) {
//
//                personas[f][c] = new Persona(scanner.nextLine());
//
//            }
//
//        }
//
//        imprimir(personas);


    }

    public static void imprimir(Object matriz[][]){

        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[f].length; c++) {

                System.out.print ("|" + matriz[f][c] + "\t");

            }

            System.out.println("|");

        }

    }

}

