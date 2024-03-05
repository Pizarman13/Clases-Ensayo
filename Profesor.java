public class Profesor extends Persona{

    private Persona infoPersonal;
    private String materia;
    private String horario;
    private String aula;

    //constructor vacio
    public Profesor() {
        this.infoPersonal = infoPersonal;
        this.materia = materia;
        this.horario = horario;
        this.aula = aula;
    }

    //constructor con parametros
    public Profesor(Persona infoPersonal, String materia, String horario, String aula) {
        this.infoPersonal = infoPersonal;
        this.materia = materia;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
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
        return "Profesor{" + "infoPersonal=" + infoPersonal + ", materia=" + materia + ", horario=" + horario + ", aula=" + aula + '}';
    }




}
