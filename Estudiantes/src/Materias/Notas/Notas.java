package Materias.Notas;

import Materias.Excepcion.Excepcion;

public class Notas {

    private int nota1, nota2, nota3, nota4, nota5;

    public Notas(int nota1, int nota2, int nota3, int nota4, int nota5) throws Excepcion {

        if (nota1 < 1 || nota2 < 1 || nota3 < 1 || nota4 < 1 || nota5 < 1){

            throw new Excepcion("hay una o varias notas menores que 1; no puede ser menor que 1");

        } else if (nota1 > 5 || nota2 > 5 || nota3 > 5 || nota4 > 5 || nota5 > 5) {

            throw new Excepcion("hay una o varias notas mayores que 5; no puede ser mayor que 5");

        }

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getNota5() {
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
