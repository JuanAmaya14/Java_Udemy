package Materias;

import Materias.Enum.Materias;
import Materias.Excepcion.Excepcion;
import Materias.Notas.Notas;

public class Ingles extends Notas {

    private final Materias materia = Materias.INGLES;
    private final double total;

    public Ingles(int nota1, int nota2, int nota3, int nota4, int nota5) throws Excepcion {
        super(nota1, nota2, nota3, nota4, nota5);
        this.total = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

    }

    public Materias getMateria() {
        return materia;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "\n" + materia + "{ "
                + "\nPofesor/a encargado/a = " + materia.getProfesores()
                + "\n" + super.toString()
                + "\nTotal: " + total
                + "\n }";
    }
}
