import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona un valer entre 0 y 10:");
        int numero = sc.nextInt();

        if (numero >= 9 && numero <= 10) {

            System.out.println("A");

        } else if (numero >= 8 && numero < 9) {

            System.out.println("B");

        } else if (numero >= 7 && numero < 8) {

            System.out.println("C");

        } else if (numero >= 6 && numero < 7) {

            System.out.println("D");

        } else if (numero >= 0 && numero < 6) {

            System.out.println("F");

        } else {
            System.out.println("Valor desconocido");


        }
    }

}