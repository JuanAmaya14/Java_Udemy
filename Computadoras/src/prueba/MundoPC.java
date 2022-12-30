package prueba;

import computadora.Computadora;
import orden.Orden;
import partes.*;

public class MundoPC {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("HP", 13);
        Teclado teclado1 = new Teclado("USB", "Samsung");
        Raton raton1 = new Raton("USB", "Motorola");
        Computadora computadora1 = new Computadora("etesech", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("nose", 10);
        Teclado teclado2 = new Teclado("Bluetooth", "Colanta");
        Raton raton2 = new Raton("Bluetooth", "Nestle");
        Computadora computadora2 = new Computadora("sexo", monitor2, teclado2, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();

    }

}
