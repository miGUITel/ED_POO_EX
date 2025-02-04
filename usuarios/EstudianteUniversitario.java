package usuarios;

public class EstudianteUniversitario extends Estudiante {
    private String carrera;

    // Constructor
    public EstudianteUniversitario(String nombre, String apellidos, String curso, String carrera) {
        super(nombre, apellidos, curso);
        this.carrera = carrera;
    }

    // Métodos
    public void doctorarse() {}
}
