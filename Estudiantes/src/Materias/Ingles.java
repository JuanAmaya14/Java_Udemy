package Materias;

import Materias.Enum.Materias;
import Materias.Excepcion.MiExcepcion;
import Materias.Notas.Notas;

public class Ingles extends Notas {

    private final Materias materia = Materias.INGLES;
    private final double total;

    public Ingles(double nota1, double nota2, double nota3, double nota4, double nota5) throws MiExcepcion {
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
        return "\n" + materia + "{ " + "\nPofesor/a encargado/a = " + materia.getProfesores() + "\n" + super.toString() + "\nTotal: " + total + "\n }";
    }
}
