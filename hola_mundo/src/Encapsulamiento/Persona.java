package Encapsulamiento;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminados){

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminados;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String isEliminado() {

        if (eliminado){

            return "Esta eliminado";

        }else{

            return "No esta eliminado";

        }
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String toString(){

        return "Persona [ nombre : " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", " + isEliminado() + " ]";

    }
}
