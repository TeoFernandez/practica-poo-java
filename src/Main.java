public class Main {
    public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.nombre="Teo";
    persona1.apellido="Fernández";
    persona1.edad=21;

    System.out.println("La persona 1 es: " + persona1.apellido + " " + persona1.nombre + " de " + persona1.edad+" años.");

    Persona persona2 = new Persona();
    persona2.nombre = "Lara";
    persona2.apellido = "Fernández";
    persona2.edad = 19;

    System.out.println("La persona 2 es: " + persona2.apellido + " " + persona2.nombre + " de " + persona2.edad+" años.");
    }
}