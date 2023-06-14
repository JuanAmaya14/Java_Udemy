package Materias.Resultado;

import Materias.*;

public class Resultado {

    private int contador;

    public Resultado(Espanol espanol, Ingles ingles, Matematicas matematicas, Sociales sociales) {

        if (espanol.getTotal() < 3){

            contador += 1;

        }

        if (ingles.getTotal() < 3){

            contador += 1;

        }

        if (matematicas.getTotal() < 3){

            contador += 1;

        }

        if (sociales.getTotal() < 3){

            contador += 1;

        }

    }

    public int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nEl estudiante a perdido ");
        sb.append(contador).append(" asignaturas");

        if (contador == 0){

            sb.append("\nAh ganado, felicidades");

        } else if (contador == 1 || contador == 2) {

            sb.append("\nEn la siguiente semana debe recuperar");

        } else if (contador > 2) {

            sb.append("\nDesafortunadamente perdio");

        }

        return sb.toString();
    }
}
