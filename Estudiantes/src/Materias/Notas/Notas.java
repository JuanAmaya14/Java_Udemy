package Materias.Notas;

import Materias.Excepcion.MiExcepcion;

public class Notas {

    private double nota1, nota2, nota3, nota4, nota5;

    public Notas(double nota1, double nota2, double nota3, double nota4, double nota5) throws MiExcepcion {

        if (nota1 < 1 || nota2 < 1 || nota3 < 1 || nota4 < 1 || nota5 < 1) {

            throw new MiExcepcion("Hay una o varias notas menores que 1; no puede ser menor que 1");

        } else if (nota1 > 5 || nota2 > 5 || nota3 > 5 || nota4 > 5 || nota5 > 5) {

            throw new MiExcepcion("Hay una o varias notas mayores que 5; no puede ser mayor que 5");

        }

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(int nota5) {
        this.nota5 = nota5;
    }

    @Override
    public String toString() {
        return "nota1= " + nota1 +
                "\nnota2= " + nota2 +
                "\nnota3= " + nota3 +
                "\nnota4= " + nota4 +
                "\nnota5= " + nota5;
    }

}
