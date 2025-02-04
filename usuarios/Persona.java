package usuarios;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Métodos
    private void mostrarInfo() {}
    public void hablar(){}
    public void crecer(){
        edad++;
    }
    public static void recibirMensaje(){

    }
}
