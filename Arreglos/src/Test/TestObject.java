package Test;

import Domain.Persona;

public class TestObject {

    public static void main(String[] args) {

        Persona personas[] = new Persona[2];

        personas[0] = new Persona("El pepe");
        personas[1] = new Persona("Ete sesh");


        for (int i = 0; i < personas.length; i++) {

            System.out.println(personas[i]);

        }

    }

}
