public class Persona {

    private String nombre;
    private int edad;

    // constructor vacio
    public Persona() {
        this.nombre = nombre;
        this.edad = edad;
    }

    // constructor con parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodos get y set
    public String getNombre() {
        return nombre;
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

    // metodo toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
