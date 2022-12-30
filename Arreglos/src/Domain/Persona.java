package Domain;

public class Persona {

    private String nombre;
    private int idPersona;
    private static int contadorPersona;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.idPersona = ++Persona.contadorPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona " + idPersona + " {");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
