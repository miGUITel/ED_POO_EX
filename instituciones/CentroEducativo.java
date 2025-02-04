package instituciones;

import usuarios.Estudiante;
import usuarios.Profesor;

public class CentroEducativo {
    Estudiante[] estudiantes;
    private Profesor[] profesores;
    private int numEstudiantes;
    private int numProfesores;

    // Constructor
    public CentroEducativo(int capacidadEstudiantes, int capacidadProfesores) {
        this.estudiantes = new Estudiante[capacidadEstudiantes];
        this.profesores = new Profesor[capacidadProfesores];
        this.numEstudiantes = 0;
        this.numProfesores = 0;
    }

    // Métodos
    public void matricularEstudiante(Estudiante e) {}
    public void contratarProfesor(Profesor p) {}
    public void mostrarDatos() {}
}