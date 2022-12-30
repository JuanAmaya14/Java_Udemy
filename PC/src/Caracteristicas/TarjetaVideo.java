package Caracteristicas;

import padres.Marca;

public class TarjetaVideo extends Marca{
    private String modelo;

    public TarjetaVideo(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" TarjetaVideo{");
        sb.append(super.toString());
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
