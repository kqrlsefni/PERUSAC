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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import modelo.Empleado;
import modelo.EmpleadoConsultas;

public class BoletaPagoControlador {
    Empleado objEmpleado = new Empleado();
    EmpleadoConsultas objEmpleadoConsultas = new EmpleadoConsultas();
    BoletaPagoView boletaPago = new BoletaPagoView(0);
    public BoletaPagoControlador(BoletaPagoView boletaPago){
        this.boletaPago = boletaPago;
    }
    
    public void genrerarBoleta(int id){
        Document documento = new Document();
        Empleado emp = objEmpleadoConsultas.buscar(id);
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        SimpleDateFormat dFormato = new SimpleDateFormat("dd-MM-yyyy");
        String datestring = dFormato.format(date);
        try {
            String ruta = System.getProperty("user.home");//ruta de acceso de usurairo
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/BoletaPago_Empleado.pdf"));//donde lo va aguardar, y nombre
            documento.open();

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("CLIENTE");//CLIENTE", "PAQUETE", "PAGO", "PAGO 2", "FECHA", "OBSERVACION
            tabla.addCell("PAGO");
            tabla.addCell("FECHA");
            
                        tabla.addCell(emp.getEmpNombre() + " " + emp.getEmpApellidoPat() + " " + emp.getEmpApellidoMat());
                        tabla.addCell(String.valueOf(emp.getEmpSalario()));
                        tabla.addCell(datestring);
                        
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
