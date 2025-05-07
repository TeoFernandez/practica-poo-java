public class Persona {

    //Atributo. "Características de un objeto".
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera,int duracion,boolean estaEnCurso){
        carrera = new Carrera(nombreCarrera,duracion, estaEnCurso );
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    //Metodos (Funciones)
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludo) {
        if(edad >40) return "Buenos días, querido " + saludo;
        return "Hola, ¿Cómo estás " + saludo + "?";
    }
}
