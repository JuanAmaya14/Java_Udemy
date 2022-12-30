package Clases;

import ClasePadre.Identidad;

public class Cliente extends Identidad {

    private int idCliente;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, int edad, char genero, String correo, String direccion, boolean vip) {
        super(nombre, edad, genero, correo, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
