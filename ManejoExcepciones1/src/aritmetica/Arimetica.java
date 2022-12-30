package aritmetica;

import Excepciones.OperacionExcepcion;

import java.sql.ResultSet;

public class Arimetica {

    public static double division(double numerador, double denominador)
    throws OperacionExcepcion{

        if (numerador == 0 || denominador == 0){

            throw new OperacionExcepcion("Division entre cero");

        } else {

            return numerador / denominador;

        }

    }

}
