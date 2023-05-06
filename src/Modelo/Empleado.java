/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
    private String empModContrat;
    private int empJornadaLab;
    private String empFechaNac;
    private String empFoto;
    private Float empSalario;
    private String empFechaIngreso;
    private String empEstado;
    
    
    public Empleado(){}

    public Empleado(int empCodigo, String empDni, String empNombre, String empApellidoMat, String empApellidoPat, String empGen, String empArea, String empModContrat, int empJornadaLab, String empFechaNac, String empFoto, Float empSalario, String empFechaIngreso,String empEstado) {
        this.empCodigo = empCodigo;
        this.empDni = empDni;
        this.empNombre = empNombre;
        this.empApellidoMat = empApellidoMat;
        this.empApellidoPat = empApellidoPat;
        this.empGen = empGen;
        this.empArea = empArea;
        this.empModContrat = empModContrat;
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

    public String getEmpModContrat() {
        return empModContrat;
    }

    public void setEmpModContrat(String empModContrat) {
        this.empModContrat = empModContrat;
    }

    public int getEmpJornadaLab() {
        return empJornadaLab;
    }

    public void setEmpJornadaLab(int empJornadaLab) {
        this.empJornadaLab = empJornadaLab;
    }

    public String getEmpFechaNac() {
        return empFechaNac;
    }

    public void setEmpFechaNac(String empFechaNac) {
        this.empFechaNac = empFechaNac;
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

    public String getEmpFechaIngreso() {
        return empFechaIngreso;
    }

    public void setEmpFechaIngreso(String empFechaIngreso) {
        this.empFechaIngreso = empFechaIngreso;
    }
    
    
    
    
    
    
}
