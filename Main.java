public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");


        // Crear un objeto de tipo Persona
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Maria", 15);

        // Crear un objeto de tipo Alumno
        Alumno a1 = new Alumno(p2, new String[]{"Matematicas", "Fisica"}, "Mañana", "Aula 101");

        // Crear un objeto de tipo Profesor
        Profesor profe1 = new Profesor(p1, "Matematicas", "Mañana", "Aula 101");

        System.out.println("El alumno " + a1.getInfoPersonal().getNombre() + " tiene " + a1.getAsignaturas().length + " asignaturas");
        System.out.println("El profesor " + profe1.getInfoPersonal().getNombre() + " da la materia de " + profe1.getMateria());

        System.out.println("¿El profesor " + profe1.getInfoPersonal().getNombre() + " le da clase a " + a1.getInfoPersonal().getNombre() + ": " + a1.tutelar(a1, profe1));


        System.out.println("Asignaturas de " + a1.getInfoPersonal().getNombre());
        a1.verAsignaturas(a1);

        System.out.println("¿El profesor " + profe1.getInfoPersonal().getNombre() + " le da clase a " + a1.getInfoPersonal().getNombre() + ": " + a1.darClase(a1, profe1));

        rombo(5);

    }

    public static void rombo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
