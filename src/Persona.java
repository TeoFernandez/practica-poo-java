public class Persona {

    //Atributo. "Características de un objeto".
    String nombre;
    String apellido;
    int edad;

    //Metodos (Funciones)
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludo) {
        if(edad >40) return "Buenos días, querido " + saludo;
        return "Hola, ¿Cómo estás " + saludo + "?";
    }
}
