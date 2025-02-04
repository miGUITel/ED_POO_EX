package instituciones;

import usuarios.Persona;
import usuarios.Profesor;

public class Guardería {
    Persona padre = new Persona("Juan", "Pérez");

    public void atender(){
        padre.hablar();
        padre.mostrarInfo();
    }

    public void educar(){
        padre.crecer();
    }

    public void enviarMensajeAProfesores(){
        Profesor.recibirMensaje();
    }


}
