package Caracteristicas;

import padres.Almacenamiento;

public class Rom extends Almacenamiento {

    private String tipoAlmacenamiento;
    private String marca;

    public Rom(int numeroAlmacenamiento, String unidadAlmacenamiento, String tipoAlmacenamiento, String marca) {
        super(numeroAlmacenamiento, unidadAlmacenamiento);
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.marca = marca;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Rom{");
        sb.append(super.toString());
        sb.append(" tipo Almacenamiento= '").append(tipoAlmacenamiento).append('\'');
        sb.append(" Marca = '").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
