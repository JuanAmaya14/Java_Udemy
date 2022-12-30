package padres;

public class Almacenamiento {

    private int numeroAlmacenamiento;
    private String unidadAlmacenamiento;

    public Almacenamiento(int numeroAlmacenamiento, String unidadAlmacenamiento) {
        this.numeroAlmacenamiento = numeroAlmacenamiento;
        this.unidadAlmacenamiento = unidadAlmacenamiento;
    }

    public int getNumeroAlmacenamiento() {
        return numeroAlmacenamiento;
    }

    public void setNumeroAlmacenamiento(int numeroAlmacenamiento) {
        this.numeroAlmacenamiento = numeroAlmacenamiento;
    }

    public String getUnidadAlmacenamiento() {
        return unidadAlmacenamiento;
    }

    public void setUnidadAlmacenamiento(String unidadAlmacenamiento) {
        this.unidadAlmacenamiento = unidadAlmacenamiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append("Cantidad y unidad de almacenamiento = '").append(numeroAlmacenamiento).append(" ")
                .append(unidadAlmacenamiento).append('\'');
        return sb.toString();
    }
}
