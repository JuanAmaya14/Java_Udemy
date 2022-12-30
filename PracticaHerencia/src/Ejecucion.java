import Clases.Cliente;
import Clases.Empleado;

public class Ejecucion {

    public static void main(String[] args) {

        final Empleado empleado = new Empleado("Tamayo", 40, 'M', "tamayo@gmail.com",
                "calle 45 D","Novato", 5000.0);

        System.out.println(empleado.toString());

        final Cliente cliente = new Cliente("Gustavo", 50, 'M', "tavo3434@gmail.com",
                "No se XDDDD", false);

        System.out.println(cliente.toString());

    }

}
