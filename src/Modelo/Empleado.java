/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Omar
 */
public class Empleado {
    private int empCodigo;
    private String empDni;
    private String empNombre;
    private String empApellidoMat;
    private String empApellidoPat;
    private String empGen;
    private String empArea;
    private String empModContrato;
    private String empJornadaLab;
    private Date empFechaNac;
    private String empFoto;
    private Float empSalario;
    private Date empFechaIngreso;
    private int empEstado;
    
    
    public Empleado(){}

    public Empleado(int empCodigo, String empDni, String empNombre, String empApellidoMat, String empApellidoPat, String empGen, String empArea, String empModContrato, String empJornadaLab, Date empFechaNac, String empFoto, Float empSalario, Date empFechaIngreso, int empEstado) {
        this.empCodigo = empCodigo;
        this.empDni = empDni;
        this.empNombre = empNombre;
        this.empApellidoMat = empApellidoMat;
        this.empApellidoPat = empApellidoPat;
        this.empGen = empGen;
        this.empArea = empArea;
        this.empModContrato = empModContrato;
        this.empJornadaLab = empJornadaLab;
        this.empFechaNac = empFechaNac;
        this.empFoto = empFoto;
        this.empSalario = empSalario;
        this.empFechaIngreso = empFechaIngreso;
        this.empEstado = empEstado;
    }

    

    

    public int getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(int empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpDni() {
        return empDni;
    }

    public void setEmpDni(String empDni) {
        this.empDni = empDni;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpApellidoMat() {
        return empApellidoMat;
    }

    public void setEmpApellidoMat(String empApellidoMat) {
        this.empApellidoMat = empApellidoMat;
    }

    public String getEmpApellidoPat() {
        return empApellidoPat;
    }

    public void setEmpApellidoPat(String empApellidoPat) {
        this.empApellidoPat = empApellidoPat;
    }

    public String getEmpGen() {
        return empGen;
    }

    public void setEmpGen(String empGen) {
        this.empGen = empGen;
    }

    public String getEmpArea() {
        return empArea;
    }

    public void setEmpArea(String empArea) {
        this.empArea = empArea;
    }

    public String getEmpModContrato() {
        return empModContrato;
    }

    public void setEmpModContrato(String empModContrat) {
        this.empModContrato = empModContrat;
    }

    

    

    public String getEmpFoto() {
        return empFoto;
    }

    public void setEmpFoto(String empFoto) {
        this.empFoto = empFoto;
    }

    public Float getEmpSalario() {
        return empSalario;
    }

    public void setEmpSalario(Float empSalario) {
        this.empSalario = empSalario;
    }

    public String getEmpJornadaLab() {
        return empJornadaLab;
    }

    public void setEmpJornadaLab(String empJornadaLab) {
        this.empJornadaLab = empJornadaLab;
    }

    public Date getEmpFechaNac() {
        return empFechaNac;
    }

    public void setEmpFechaNac(Date empFechaNac) {
        this.empFechaNac = empFechaNac;
    }

    public Date getEmpFechaIngreso() {
        return empFechaIngreso;
    }

    public void setEmpFechaIngreso(Date empFechaIngreso) {
        this.empFechaIngreso = empFechaIngreso;
    }

    public int getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(int empEstado) {
        this.empEstado = empEstado;
    }

    
    
    
    
    
    
    
}
