package Test;

import java.util.Scanner;

public class TestArreglos {

    public static void main(String[] args) {

        int edades[] = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < edades.length; i++){

            edades[i] = scanner.nextInt();

        }

        for (int i = 0; i < edades.length; i++){

            System.out.println(edades[i]);
        }

        
    }

}
