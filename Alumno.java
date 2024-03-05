public class Alumno {

    private Persona infoPersonal;
    private String[] asignaturas;
    private String horario;
    private String aula;

    //constructor vacio
    public Alumno() {
        this.infoPersonal = infoPersonal;
        this.asignaturas = asignaturas;
        this.horario = horario;
        this.aula = aula;
    }

    //constructor con parametros
    public Alumno(Persona infoPersonal, String[] asignaturas, String horario, String aula) {
        this.infoPersonal = infoPersonal;
        this.asignaturas = asignaturas;
        this.horario = horario;
        this.aula = aula;
    }

    //metodos get y set
    public Persona getInfoPersonal() {
        return infoPersonal;
    }

    public void setInfoPersonal(Persona infoPersonal) {
        this.infoPersonal = infoPersonal;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setCurso(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Alumno{" + "infoPersonal=" + infoPersonal + ", asignaturas=" + asignaturas + ", horario=" + horario + ", aula=" + aula + '}';
    }

    // metodo para saber si un alumno tiene la misma aula que un profesor
    public static boolean tutelar(Alumno a, Profesor p) {
        return a.getAula().equals(p.getAula());
    }

    //metodo para ver las asignaturas de un alumno
    public static void verAsignaturas(Alumno a) {
        for (int i = 0; i < a.getAsignaturas().length; i++) {
            System.out.println(a.getAsignaturas()[i]);
        }
    }

    //metodo para ver si un profesor da alguna asignatura a un alumno
    public static boolean darClase(Alumno a, Profesor p) {
        for (int i = 0; i < a.getAsignaturas().length; i++) {
            if (a.getAsignaturas()[i].equals(p.getMateria())) {
                return true;
            }
        }
        return false;
    }



}
