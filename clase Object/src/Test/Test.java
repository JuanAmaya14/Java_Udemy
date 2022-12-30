package Test;

import Domain.Empleado;

public class Test {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("PEPE", 5000);

        if(empleado1 == empleado2){

            System.out.println("tienen la misma referencia en memoria");

        }else{

            System.out.println("No tienene la misma referencia en memoria");

        }

        if (empleado1.equals(empleado2)){

            System.out.println("Tienen el mismo contenido");

        }else{

            System.out.println("No tienen en mismo contenido");

        }

        if (empleado1.hashCode() == empleado2.hashCode()){

            System.out.println("El valor hashcode es igual");

        }else{

            System.out.println("El valor hashcode no es igual");

        }

    }

}
