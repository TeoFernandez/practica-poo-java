public class Main {
    public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.nombre="Teo";
    persona1.apellido="Fernández";
    persona1.edad=21;

    Carrera carrera1 = new Carrera();
    carrera1.nombre = "Ingeniería en Sistemas";
    carrera1.duracion = 5;
    carrera1.estaEnCurso = false;

    persona1.carrera = carrera1;

    System.out.println("La persona 1 es: " + persona1.darNombreCompleto() + " de " + persona1.edad+" años." + "Y no está cursando la carrera de " + carrera1.nombre);

    Persona persona2 = new Persona();
    persona2.nombre = "Lara";
    persona2.apellido = "Fernández";
    persona2.edad = 19;

    Carrera carrera2 = new Carrera();
    carrera2.nombre = "Educación Inicial";
    carrera2.duracion = 5;
    carrera2.estaEnCurso = false;

    persona2.carrera = carrera2;

    System.out.println("La persona 2 es: " + persona2.darNombreCompleto() + " de " + persona2.edad+" años." + "Y está cursando la carrera de " + carrera2.nombre);

    String saludo = "Noelia";
    System.out.println(persona1.enviarSaludo(saludo));
    System.out.println(persona2.enviarSaludo("Ezequiel"));

    }
}