package entidades;

public class Tarea {
    int id;
    String titulo;
    int mes;
    int dia;
    int anio;
    
    int horaInicio, minutoInicio;
    int horaFin, minutoFin;
    
    int r,g,b;
    int codEstudiante;
    
    int repeticiones;

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getCodEstudiante() {
        return codEstudiante;
    }

    public void setCodEstudiante(int codEstudiante) {
        this.codEstudiante = codEstudiante;
    }
    String descripcion;

    public Tarea() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = año;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public int getMinutoFin() {
        return minutoFin;
    }

    public void setMinutoFin(int minutoFin) {
        this.minutoFin = minutoFin;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
