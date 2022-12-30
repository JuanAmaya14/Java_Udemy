package Clases;

import ClasePadre.Identidad;

public class Empleado extends Identidad {

    private String puesto;
    private double salario;
    private int idEmpleado;
    private static int contadorEmpleado;

    public Empleado(String nombre, int edad, char genero, String correo, String direccion, String puesto, double salario) {
        super(nombre, edad, genero, correo, direccion);
        this.puesto = puesto;
        this.salario = salario;
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("puesto='").append(puesto).append('\'');
        sb.append(", salario=").append(salario);
        sb.append(", idEmpleado=").append(idEmpleado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
