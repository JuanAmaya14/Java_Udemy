package Caracteristicas;

import padres.Almacenamiento;

public class Ram extends Almacenamiento {

    private String marca;

    public Ram(int numeroAlmacenamiento, String unidadAlmacenamiento, String marca) {
        super(numeroAlmacenamiento, unidadAlmacenamiento);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Ram{");
        sb.append(super.toString());
        sb.append(" marca ='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
