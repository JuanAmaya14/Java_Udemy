import java.util.Scanner;

public class rectangulo {

    public static void main(String[] args) {


        Scanner cs = new Scanner(System.in);

        System.out.println("Proporciona el alto:");
        int alto = cs.nextInt();

        System.out.println("Proporciona el ancho:");
        int ancho = cs.nextInt();

        int area = alto * ancho;

        int perimetro = (alto + ancho) * 2;

        System.out.println("Area: " + area + "\nperimetro: " + perimetro);


    }

}
