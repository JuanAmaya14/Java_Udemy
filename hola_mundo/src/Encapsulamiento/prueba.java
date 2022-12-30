package Encapsulamiento;

public class prueba {

    public static void main(String[] args) {

        Persona pe = new Persona("Juan", 5000.00, false);

        System.out.println("Persona 1 : " + pe.toString());

        pe.setNombre("Carlos");
        pe.setSueldo(100.5);
        pe.setEliminado(true);

        System.out.println("Persona 1 : " + pe.toString());


    }

}
