package Text;

import Domain.Empleado;
import Domain.Gerente;

public class Test {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Juan", 244, "no se ajajajaj");
        //System.out.println(gerente.ObtenerDetalles());
        imprimir(gerente);

        Empleado empleado = new Empleado("Pedro", 1);
        //System.out.println(empleado.ObtenerDetalles());
        imprimir(empleado);
    }

    public static void imprimir(Empleado empleado){

        System.out.println("{" + empleado + "}");

    }

}
