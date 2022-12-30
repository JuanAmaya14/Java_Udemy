package Test;

import Domain.*;

public class Test {

    public static void main(String[] args) {

        Empleado empleado;

        empleado = new Escritor("juan", 6000, TipoEscritura.CLASICO);

        System.out.println(empleado);


    }



}
