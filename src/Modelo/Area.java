
package Modelo;

public class Area {
    private int id;
    private int empleado;
    private String area;

    public Area() {
    }

    
    public Area(int id, int empleado, String area) {
        this.id = id;
        this.empleado = empleado;
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
