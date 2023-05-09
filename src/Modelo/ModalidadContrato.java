
package Modelo;

import java.util.Date;

public class ModalidadContrato {
    private int id;
    private int empleado;
    private String modalidad;
    private Date fecInicio;
    private Date fecFin;

    public ModalidadContrato(int id, int empleado, String modalidad, Date fecInicio, Date fecFin) {
        this.id = id;
        this.empleado = empleado;
        this.modalidad = modalidad;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
    }

    public ModalidadContrato(int id, int empleado, String modalidad) {
        this.id = id;
        this.empleado = empleado;
        this.modalidad = modalidad;
    }

    public ModalidadContrato() {
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

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }
    
    
}
