package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {

        //Empleado empleado1 = new Empleado("juan", 5000.0);

        //System.out.println("empleado1 = " + empleado1);

        var fecha = new Date();

        Cliente cliente1 = new Cliente(fecha, true, "Camilo",'M', 18, "nose");

        System.out.println("cliente1 = " + cliente1);

        Cliente cliente2 = new Cliente(fecha, true, "Natalia",'F', 16, "si");

        System.out.println("cliente2 = " + cliente2);


    }

}
