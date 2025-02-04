package usuarios;

public class Estudiante extends Persona {
    private String curso;

    // Constructor
    public Estudiante(String nombre, String apellidos, String curso) {
        super(nombre, apellidos);
        this.curso = curso;
    }

    // Métodos
    public void inscribirse() {}
    public abstract void estudiar();
}
