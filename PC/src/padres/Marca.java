package padres;

public class Marca {

    private String marca;

    public Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Marca = '");
        sb.append(marca).append('\'');
        return sb.toString();
    }
}
