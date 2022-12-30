package Test;

import Estudiante.Estudiante;
import Materias.Enum.Grados;
import Materias.*;
import Materias.Excepcion.Excepcion;

public class Test {

    public static void main(String[] args) throws Excepcion {

            Espanol espanol = new Espanol(1, 1, 1, 1, 1);
            Ingles ingles = new Ingles(1, 1, 1 ,1 ,1);
            Matematicas matematicas = new Matematicas(1, 1, 1, 1, 1);
            Sociales sociales = new Sociales(5, 4, 3, 2, 4);


            Estudiante estudiante = new Estudiante("Juan", "Amaya", Grados.ONCE, espanol,
                    ingles, matematicas, sociales);

            System.out.println(estudiante);



    }
}
