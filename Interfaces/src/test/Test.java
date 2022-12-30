package test;

import accesodatos.*;

public class Test {

    public static void main(String[] args) {

        IAccesoDatos datos = new ImplementacionMySQL();

        datos.insertar();

    }

}
