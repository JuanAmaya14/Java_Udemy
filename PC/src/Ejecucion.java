import Caracteristicas.*;
import Computadora.Computadora;

public class Ejecucion {

    public static void main(String[] args) {


        Procesador procesador1 = new Procesador("intel", "core i7", 3.90);
        TarjetaVideo tarjetaVideo1 = new TarjetaVideo("Nvidia", "940MX");
        Ram ram1 = new Ram(16, "GB", "Samsung");
        Rom rom1 = new Rom(1, "T", "Estado Solido", "Kingstone");

        Computadora computadora1 = new Computadora(procesador1, tarjetaVideo1, ram1, rom1);

        computadora1.Imprimir();

    }

}
