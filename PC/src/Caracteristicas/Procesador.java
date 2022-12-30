package Caracteristicas;

import padres.Marca;

public class Procesador extends Marca{

    private String modelo;
    private double velocidad;

    public Procesador(String marca, String modelo, double velocidad) {
        super(marca);
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Procesador{");
        sb.append(super.toString());
        sb.append(" modelo='").append(modelo).append('\'');
        sb.append(", velocidad=").append(velocidad).append(" GHz ");
        sb.append('}');
        return sb.toString();
    }
}
