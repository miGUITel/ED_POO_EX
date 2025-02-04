package instituciones;

import usuarios.Estudiante;
import usuarios.EstudianteUniversitario;
import usuarios.Profesor;

public class Universidad extends CentroEducativo {
    private int numEdificios;

    // Constructor
    public Universidad(int numEdificios, int capacidadEstudiantes, int capacidadProfesores) {
        super(capacidadEstudiantes, capacidadProfesores);
        this.numEdificios = numEdificios;
    }

    // Métodos
    public void ampliar() {}

    public void contratarProf() {
        Profesor profesor1 = new Profesor();
    }

    public void asignarTesis(){
        Profesor profesor2 = new Profesor("Juan","Pérez", "Matemáticas");
        profesor2.dirigirTesis();
    }

    public void matricularEstudiante(EstudianteUniversitario est){
        est.estudiar(est.curso);
        est.estudiar();
    }
}
