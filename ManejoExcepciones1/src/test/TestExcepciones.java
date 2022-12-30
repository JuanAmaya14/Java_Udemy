package test;

import Excepciones.OperacionExcepcion;

import static aritmetica.Arimetica.division;

public class TestExcepciones {

    public static void main(String[] args) {

        double resultado = 0;

        try {

            resultado = division(0, 9);

        }catch(OperacionExcepcion e){

            System.out.println("Ocurrio un error de tipo OperacionExcepcion: ");
            e.printStackTrace(System.out);

        }catch(Exception e){

            System.out.println("Ocurrio un error de tipo Exception: ");
            e.printStackTrace(System.out);

        }
        finally {

            System.out.println("Se reviso la division entre 0");

        }

        System.out.println("resultado = " + resultado);

    }

}
