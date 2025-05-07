public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Pedro","Pascal",48,"Mandaloriano",20,true);

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y está recibido de " + persona1.carrera.nombre);

    }
}