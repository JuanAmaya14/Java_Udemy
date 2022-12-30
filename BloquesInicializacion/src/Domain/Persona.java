package Domain;

public class Persona {

    private int idPersona;
    private static int contadorPersona;

    static{

        System.out.println("Inicio de bloque estatico");
        ++Persona.contadorPersona;

    }

    {

        System.out.println("Inicio de bloque dinamico");
        this.idPersona = Persona.contadorPersona++;

    }

    public Persona() {

        System.out.println("Inicio del constructor");

    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
