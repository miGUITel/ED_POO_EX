package usuarios;

public class Profesor extends Persona {
    private String materia;
    protected final String id = "7";

    // Constructor
    public Profesor(String nombre, String apellidos, String materia) {
        super(nombre, apellidos);
        this.materia = materia;
    }

    // Métodos
    public void impartir() {}

    public String getMateria() {
        return materia;
    }
}
