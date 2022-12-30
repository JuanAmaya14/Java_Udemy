package TestForEach;

import Domain.Persona;

public class TestForEach {

    public static void main(String[] args) {

        int edades[] = {5, 6, 10, 20};

        for(int edad: edades){

            System.out.println("edad = " + edad);

        }

        Persona personas[] = {new Persona("Juan"), new Persona("Natalia"), new Persona("<3")};

        for (Persona persona: personas) {

            System.out.println(persona);
        }
    }

}
