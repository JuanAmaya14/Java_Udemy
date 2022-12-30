package Estudiante;

import Materias.Enum.Grados;
import Materias.*;
import Materias.Excepcion.Excepcion;
import Materias.Resultado.Resultado;

public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private Grados grado;
    private static int contadorId;
    private Espanol espanol;
    private Ingles ingles;
    private Matematicas matematicas;
    private Sociales sociales;

    private Estudiante() {
        this.id = ++Estudiante.contadorId;
    }

    private Resultado resultado;

    public Estudiante(String nombre, String apellido, Grados grado, Espanol espanol, Ingles ingles,
                      Matematicas matematicas, Sociales sociales) throws Excepcion {

        if(nombre == "" || nombre == null){

            throw new Excepcion("Falta el nombre del estudiante");

        }else if (apellido == "" || apellido == null){

            throw new Excepcion("Falta el apellido del estudiante");

        }else if (grado == null){

            throw new Excepcion("Falta el grado en el que esta el estudiante");

        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.espanol = espanol;
        this.ingles = ingles;
        this.matematicas = matematicas;
        this.sociales = sociales;
        this.resultado = new Resultado(espanol, ingles, matematicas, sociales);


    }

    public Estudiante(String nombre, String apellido, Grados grado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Grados getGrado() {
        return grado;
    }

    public void setGrado(Grados grado) {
        this.grado = grado;
    }

    public Espanol getEspanol() {
        return espanol;
    }

    public void setEspanol(Espanol espanol) {
        this.espanol = espanol;
    }

    public Ingles getIngles() {
        return ingles;
    }

    public void setIngles(Ingles ingles) {
        this.ingles = ingles;
    }

    public Matematicas getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(Matematicas matematicas) {
        this.matematicas = matematicas;
    }

    public Sociales getSociales() {
        return sociales;
    }

    public void setSociales(Sociales sociales) {
        this.sociales = sociales;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nEstudiante " + id + " {");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", grado=").append(grado);
        sb.append('}');
        sb.append("\nAsignaturas {");
        sb.append(espanol);
        sb.append(ingles);
        sb.append(matematicas);
        sb.append(sociales);
        sb.append(resultado);
        sb.append("\n}");
        return sb.toString();
    }



}
