public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Carlos","Gardel",23);

        persona1.setNombre("Ricardo");
        persona1.setApellido("Darín");
        persona1.setEdad(60);

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años.");

    }
}