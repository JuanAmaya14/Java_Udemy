package Enumeraciones;

public enum Continentes {

    AFRICA(53, "1.216 miles de millones"),
    EUROPA(46, "746.4 millones"),
    ASIA(44, "4.561 miles de millones"),
    AMERICA(34, "1.002 miles de millones"),
    OCEANIA(14, "43 millones");

    private final int paises;
    private final String poblacion;

    Continentes(int paises, String poblacion){

        this.paises = paises;
        this.poblacion = poblacion;

    }

    public int getPaises() {
        return paises;
    }

    public String getPoblacion() {
        return poblacion;
    }


}
