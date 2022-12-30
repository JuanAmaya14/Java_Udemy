package Ventas.Test;

import Ventas.*;

public class VentasTest {

    public static void main(String[] args) {

        Producto producto1 = new Producto("camisa", 50.0);
        Producto producto2 = new Producto("pantalon", 100.0);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();


    }

}


