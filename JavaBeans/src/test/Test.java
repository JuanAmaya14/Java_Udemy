package test;

import domain.Persona;

public class Test {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Amaya");

        System.out.println(persona);

    }

}
