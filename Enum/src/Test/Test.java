package Test;

import Enumeraciones.*;

public class Test {

    public static void main(String[] args) {

/*        System.out.println("Dia " + Dias.DOMINGO);
        indicarDiaSemana(Dias.DOMINGO);*/

        System.out.println("Continente: " + Continentes.AFRICA + "\nNumero de paises: " +
                Continentes.AFRICA.getPaises() + "\nPoblacion: " + Continentes.AFRICA.getPoblacion() + "\n");

        System.out.println("Continente: " + Continentes.AMERICA + "\nNumero de paises: " +
                Continentes.AMERICA.getPaises() + "\nPoblacion: " + Continentes.AMERICA.getPoblacion() + "\n");


    }

    private static void indicarDiaSemana(Dias dias){

        switch (dias){

            case LUNES:

                System.out.println("primer dia de la semana");
                break;

            case MARTES:
                System.out.println("segundo dia de la semana");
                break;

            case MIERCOLES:
                System.out.println("tercer dia de la semana");
                break;

            case JUEVES:
                System.out.println("cuarto dia de la semana");
                break;

            case VIERNES:
                System.out.println("quinto dia de la semana");
                break;

            case SABADO:
                System.out.println("sexto dia de la semana");
                break;

            case DOMINGO:
                System.out.println("septimo y ultimo dia de la semana");
                break;


        }


    }

}
