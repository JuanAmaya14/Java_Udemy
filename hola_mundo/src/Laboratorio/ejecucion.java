package Laboratorio;

public class ejecucion {

    public static void main(String[] args) {

        int ancho = 3;
        int alto = 2;
        int profundo = 6;

        Caja caja = new Caja(ancho, alto, profundo);

        caja.calcular();

    }

}
