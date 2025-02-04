package usuarios;

public class ProfesorTitular extends Profesor {
    private int experiencia;

    // Constructor
    public ProfesorTitular(String id, String nombre, String apellidos, String materia, int experiencia) {
        super(nombre, apellidos, materia);
        this.experiencia = experiencia;
    }

    // Métodos
    public void dirigirTesis() {}

    public void setId(String id) {
        this.id = id;
    }
}