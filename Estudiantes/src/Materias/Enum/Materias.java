package Materias.Enum;

public enum Materias {

    SOCIALES("Luis"),
    MATEMATICAS("Martha"),
    ESPANOL("Diana"),
    INGLES("Marina");

    private final String profesores;

    Materias(String profesores) {
        this.profesores = profesores;
    }

    public String getProfesores() {
        return profesores;
    }


}
