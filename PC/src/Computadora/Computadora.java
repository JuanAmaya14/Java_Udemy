package Computadora;

import Caracteristicas.*;

public class Computadora{

    private final int idComputadora;
    private Procesador procesador;
    private TarjetaVideo tarjetaVideo;
    private Ram ram;
    private Rom rom;
    private static int contadorComputadora;

    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(Procesador procesador, TarjetaVideo tarjetaVideo, Ram ram, Rom rom) {
        this();
        this.procesador = procesador;
        this.tarjetaVideo = tarjetaVideo;
        this.ram = ram;
        this.rom = rom;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public TarjetaVideo getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public void Imprimir(){

        System.out.println("Computador "+ idComputadora + " = " + procesador.toString() + tarjetaVideo.toString() +
                ram.toString() + rom.toString());

    }


}
