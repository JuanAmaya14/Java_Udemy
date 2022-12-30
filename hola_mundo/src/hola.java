import java.util.Scanner;

public class hola {

    public static void main(String[] args) {

        String nombre;
        int id;
        double precio;
        boolean envioGratuito;

        Scanner sc = new Scanner(System.in);


        System.out.println("Proporciona el nombre:");
        nombre = sc.nextLine();

        System.out.println("Proporciona el id:");
        id = sc.nextInt();

        System.out.println("Proporciona el precio:");
        precio = sc.nextDouble();

        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = sc.nextBoolean();


        System.out.println(nombre + " #" + id + "\nprecio: $" + precio + "\nEnvio Gratuito: " + envioGratuito);



    }

}
