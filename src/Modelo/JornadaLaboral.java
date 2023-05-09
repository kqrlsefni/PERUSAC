
package Modelo;

public class JornadaLaboral {
    private int id;
    private int empleado;
    private String jornada;

    public JornadaLaboral() {
    }

    
    public JornadaLaboral(int id, int empleado, String jornada) {
        this.id = id;
        this.empleado = empleado;
        this.jornada = jornada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    
    
}
