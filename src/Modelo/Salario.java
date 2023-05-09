
package Modelo;

public class Salario {
    private int idSalario;
    private int empleado;
    private Float salario;

    public Salario() {
    }

    
    public Salario(int idSalario, int empleado, Float salario) {
        this.idSalario = idSalario;
        this.empleado = empleado;
        this.salario = salario;
    }

    public int getIdSalario() {
        return idSalario;
    }

    public void setIdSalario(int idSalario) {
        this.idSalario = idSalario;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
    
    
}
