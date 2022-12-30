import java.util.Scanner;

public class mayor {

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.println("Proporciona el numero1:");
        int numero1 = cs.nextInt();

        System.out.println("Proporciona el numero2:");
        int numero2 = cs.nextInt();

        if (numero1 > numero2) {

            System.out.println("El numero mayor es: \n" + numero1);

        }else{

            System.out.println("El numero mayor es: \n" + numero2);

        }



    }

}
