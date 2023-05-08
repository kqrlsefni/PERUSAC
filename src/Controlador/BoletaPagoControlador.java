/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.BoletaPagoView;
import Vista.Empleado_EditarView;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import modelo.Empleado;
import modelo.EmpleadoConsultas;

public class BoletaPagoControlador {
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    BoletaPagoView boletaPago = new BoletaPagoView();
    public BoletaPagoControlador(BoletaPagoView boletaPago){
        this.boletaPago = boletaPago;
    }
    
    public void genrerarBoleta(){
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");//ruta de acceso de usurairo
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/BoletaPago_Empleado.pdf"));//donde lo va aguardar, y nombre
            documento.open();

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("CLIENTE");//CLIENTE", "PAQUETE", "PAGO", "PAGO 2", "FECHA", "OBSERVACION
            tabla.addCell("PAQUETE");
            tabla.addCell("PAGO");
            tabla.addCell("FECHA");
            tabla.addCell("ESTADO");
            
                        tabla.addCell("ClienteNombre");
                        tabla.addCell("paqNombre");
                        tabla.addCell("resPago");
                        tabla.addCell("resFecha");
                        tabla.addCell("estadoRes");
                        documento.add(tabla);
            documento.close();
            
        } catch (DocumentException | FileNotFoundException e) {
            
        }
    }
    
    public void llenarCampos(int id){
        Empleado emp = objEmpleadoConsultas.buscar(id);
        boletaPago.txtDni.setText(emp.getEmpDni());
        boletaPago.txtEmpleado.setText(emp.getEmpNombre()+ " " + emp.getEmpApellidoPat() + " " + emp.getEmpApellidoMat());
        
    }
}
