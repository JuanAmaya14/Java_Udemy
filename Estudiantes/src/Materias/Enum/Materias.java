package Materias.Enum;

public enum Materias {

    SOCIALES("Luis Enrique"),
    MATEMATICAS("Martha Gonzales"),
    ESPANOL("Diana Hernandez"),
    INGLES("Luz Marina Osorio");

    private final String profesores;

    Materias(String profesores) {
        this.profesores = profesores;
    }

    public String getProfesores() {
        return profesores;
    }


}
