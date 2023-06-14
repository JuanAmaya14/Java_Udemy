package Test;

import Estudiante.Estudiante;
import Materias.Enum.Grados;
import Materias.*;
import Materias.Excepcion.MiExcepcion;
import Materias.Notas.Notas;


/**
 * @author Amaya
 * @version 1.0
 */

public class Test {

    public static void main(String[] args) throws MiExcepcion {

        Espanol espanol1 = new Espanol(1, 1, 1, 1, 1);
        Ingles ingles1 = new Ingles(1, 1, 1, 1, 1);
        Matematicas matematicas1 = new Matematicas(1, 1, 1, 1, 1);
        Sociales sociales1 = new Sociales(5, 4, 3, 2, 4);


        Estudiante estudiante1 = new Estudiante("Juan", "Amaya", Grados.ONCE, espanol1,
                ingles1, matematicas1, sociales1);

        System.out.println(estudiante1);

        /////

        Espanol espanol2 = new Espanol(4.5, 4, 3.3, 2.5, 1);
        Ingles ingles2 = new Ingles(5, 1.5, 2.3, 3.4, 5);
        Matematicas matematicas2 = new Matematicas(1.5, 2.5, 3.5, 4.5, 5);
        Sociales sociales2 = new Sociales(5, 4.2, 3.5, 2.4, 4.9);


        Estudiante estudiante2 = new Estudiante("Miguel", "Hernandez", Grados.QUINTO, espanol2,
                ingles2, matematicas2, sociales2);

        System.out.println(estudiante2);


    }
}
