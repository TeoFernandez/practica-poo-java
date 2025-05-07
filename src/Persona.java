public class Persona {

    //Atributo. "Características de un objeto".
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    //Metodos (Funciones)
    public String darNombreCompleto(){
        return getApellido() + ", " + getNombre();
    }

    public String enviarSaludo(String saludo) {
        if(edad >40) return "Buenos días, querido " + saludo;
        return "Hola, ¿Cómo estás " + saludo + "?";
    }

    //Getters (Devuelven) and Setters (fijan - CARGAN EL DATO)
    public String getNombre(){
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido.toUpperCase();
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
