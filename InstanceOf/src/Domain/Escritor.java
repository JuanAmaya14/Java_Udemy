package Domain;

public class Escritor extends Empleado{

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String ObtenerDetalles(){


    return super.ObtenerDetalles() + ", tipo escritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "tipoEscritura=" + tipoEscritura +
                "} " + " " +super.toString();
    }
}
