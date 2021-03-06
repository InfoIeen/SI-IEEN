/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import static com.itextpdf.text.Element.ALIGN_CENTER;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Vector;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.border.Border;
/**
 *
 * @author GuillermoR
 */
public class CrearReporteActividades {
    private File directorio;
    private File archivo;
    private String path, archivo_nombre;
  //  private infoTicket info;
    

    public CrearReporteActividades(String folio){
    //    obtener_productos = new ObtenerProductos();
        path = "C:\\SIIEEN\\oficiosreporteactividades\\";
        directorio = new File(path);
    //    info = new infoTicket();
            
        
        if (directorio.exists()) {
            archivo_nombre = "oficio_" +folio+".pdf";
            archivo = new File(directorio, archivo_nombre);
        } else {
            directorio.mkdirs();
            if (directorio.exists()) {
                archivo_nombre = "oficio_" +folio+".pdf";
                archivo = new File(directorio, archivo_nombre);
            } else {
                System.out.println("No se pudo crear el directorio");
            }//ifelse
        }//if else
        
    }//constructor
    
   

   
    private static Font numero = new Font(Font.FontFamily.HELVETICA, 40,
            Font.BOLD);

    private static Font estilo = new Font(Font.FontFamily.HELVETICA, 22,
            Font.BOLD);
    private static Font Mex = new Font(Font.FontFamily.HELVETICA, 12,
            Font.BOLD);

    private static Font codigo = new Font(Font.FontFamily.COURIER, 12,
            Font.NORMAL);
    
     private static Font catFont = new Font(Font.FontFamily.HELVETICA, 12,
            Font.BOLD);
    private static Font elements = new Font(Font.FontFamily.COURIER, 10,
            Font.NORMAL);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 14,
            Font.NORMAL);
    private static Font subFont2 = new Font(Font.FontFamily.HELVETICA, 10,
            Font.NORMAL);
    private static Font subFont3 = new Font(Font.FontFamily.HELVETICA, 8,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 8,
            Font.BOLD);
    private static Font smallBold0 = new Font(Font.FontFamily.TIMES_ROMAN, 8,
            Font.NORMAL);
    private static Font smallBold3 = new Font(Font.FontFamily.TIMES_ROMAN, 10,
            Font.NORMAL);

    private static Font smallBold2 = new Font(Font.FontFamily.COURIER, 12,
            Font.BOLD);
    
    private static Font elements2 = new Font(Font.FontFamily.HELVETICA, 9,
            Font.NORMAL);
    private static Font elements2c = new Font(Font.FontFamily.HELVETICA,8,Font.NORMAL,BaseColor.LIGHT_GRAY);
    private static Font elements3 = new Font(Font.FontFamily.HELVETICA, 9,
            Font.BOLD);
    private static Font elements3c = new Font(Font.FontFamily.HELVETICA, 8,
            Font.BOLD);
    private static Font subFontF = new Font(Font.FontFamily.HELVETICA, 8,
            Font.NORMAL);
    
    
    
    
    
    public void createTicket(int res,String folioComision,String lugarSalida,String actividad,String observaciones,String empleado,String puesto_trabajo,List<Gastos_Comprobar> gc)throws DocumentException {
        
        Rectangle pagesize = new Rectangle(250, 14400);
        Document doc = new Document(pagesize);
        PdfWriter docWriter = null;
        String pdfFilename="ofireporteactividades"+folioComision;
        
        /*String[] separar=fecha.split("-");
        String mes="";
        int n=Integer.parseInt(separar[1]);
        switch(n){
            case 1:
                mes="Enero";
                break;
            case 2:
                mes="Febrero";
                break;
            case 3:
                mes="Marzo";
                break;
            case 4:
                mes="Abril";
                break;
            case 5:
                mes="Mayo";
                break;
            case 6:
                mes="Junio";
                break;
            case 7:
                mes="Julio";
                break;
            case 8:
                mes="Agosto";
                break;
            case 9:
                mes="Septiembre";
                break;
            case 10:
                mes="Octubre";
                break;
            case 11:
                mes="Noviembre";
                break;
            case 12:
                mes="Diciembre";
                break;
        }
        String fechacompleta=separar[0]+" de "+mes+" del "+separar[2];*/

        try {

            //CODIGO DE BARRAS------------------------------------------------------------------------
            String path = this.path + pdfFilename + ".pdf";
            docWriter = PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.addAuthor("IEEN");
            doc.addCreationDate();
            doc.addProducer();
            doc.setPageSize(PageSize.LETTER);
            doc.open();
            

           
            //------------------------------------------------
            

            Paragraph BLANCO = new Paragraph();

            PdfPTable Head = new PdfPTable(2);
            Head.setWidthPercentage(100f);

           

            //Obtener la imagen
            com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance("print/blogin.png");
            //com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance("src/Imagenes/IEE.png");
            image.scaleAbsoluteWidth(90f);
            image.scaleAbsoluteHeight(75f);
            PdfPCell LogoCell = new PdfPCell(image, false);
            LogoCell.setBorderColor(BaseColor.WHITE);
          

            Head.addCell(LogoCell);
            
            PdfPCell Titulo = new PdfPCell(new Phrase("INSTITUTO ESTATAL ELECTORAL DE NAYARIT", Mex));
            
            Titulo.setBorderColor(BaseColor.WHITE);
            Titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            Titulo.setVerticalAlignment(Element.ALIGN_MIDDLE);
            float[] medidaCeldas = {0.55f, 2.25f};

            // ASIGNAS LAS MEDIDAS A LA TABLA (ANCHO)
            Head.setWidths(medidaCeldas);
            Head.addCell(Titulo);
        
             // ASIGNAS LAS MEDIDAS A LA TABLA (ANCHO)
            Head.setWidths(medidaCeldas);   
            
            addEmptyLine(BLANCO, (float) 1);
            
            //folio
            PdfPTable folio = new PdfPTable(1);
            folio.setWidthPercentage(100f);
            PdfPCell folioCell;
            
            folioCell = new PdfPCell(new Phrase("Oficio de Comisión: "+folioComision, elements3));
            folioCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            folioCell.setBorderColor(BaseColor.WHITE);
            folio.addCell(folioCell);
            
            //fecha
            PdfPTable fecha = new PdfPTable(2);
            fecha.setWidthPercentage(100f);
            PdfPCell lineasfe,lineasfe2;
            float[] medidaLineas2 = {0.25f,2.40f};
            float[] medidaLineas3 = {0.50f,2.25f};
            fecha.setWidths(medidaLineas2);
            
            
            lineasfe = new PdfPCell(new Phrase("Fecha:", elements3));
            lineasfe.setHorizontalAlignment(Element.ALIGN_LEFT);
            lineasfe.setBorder(0);
            // Contenido del NOMBRE
            lineasfe2 = new PdfPCell(new Phrase("11 de Septiembre del 2018", elements2));
            lineasfe2.setBorderColor(BaseColor.WHITE);
            //lineas2.setBorderWidthTop(0);
            //lineas2.setBorderWidthLeft(0);
            //lineas2.setBorderWidthRight(0);
            lineasfe2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            fecha.addCell(lineasfe);
            fecha.addCell(lineasfe2);
            //lugar
            PdfPTable lugar = new PdfPTable(2);
            lugar.setWidthPercentage(100f);
            PdfPCell lineaslu,lineaslu2;
            //float[] medidaLineas2 = {0.35f,2.40f};
            lugar.setWidths(medidaLineas3);
            
            
            lineaslu = new PdfPCell(new Phrase("Lugar de comisión:", elements3));
            lineaslu.setHorizontalAlignment(Element.ALIGN_LEFT);
            lineaslu.setBorder(0);
            // Contenido del NOMBRE
            lineaslu2 = new PdfPCell(new Phrase(lugarSalida, elements2));
            lineaslu2.setBorderColor(BaseColor.WHITE);
            //lineas2.setBorderWidthTop(0);
            //lineas2.setBorderWidthLeft(0);
            //lineas2.setBorderWidthRight(0);
            lineaslu2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            lugar.addCell(lineaslu);
            lugar.addCell(lineaslu2);
            //asuntocomision
            PdfPTable asunto = new PdfPTable(2);
            asunto.setWidthPercentage(100f);
            PdfPCell lineasasu,lineasasu2;
            //float[] medidaLineas2 = {0.35f,2.40f};
            asunto.setWidths(medidaLineas3);
            
            
            lineasasu = new PdfPCell(new Phrase("Asunto de comisión:", elements3));
            lineasasu.setHorizontalAlignment(Element.ALIGN_LEFT);
            lineasasu.setBorder(0);
            // Contenido del NOMBRE
            lineasasu2 = new PdfPCell(new Phrase(actividad, elements2));
            lineasasu2.setBorderColor(BaseColor.WHITE);
            //lineas2.setBorderWidthTop(0);
            //lineas2.setBorderWidthLeft(0);
            //lineas2.setBorderWidthRight(0);
            lineasasu2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            asunto.addCell(lineasasu);
            asunto.addCell(lineasasu2);
            
            //nombreoficio
            PdfPTable nombreofi = new PdfPTable(1);
            nombreofi.setWidthPercentage(100f);
            PdfPCell nombreCellOfi;
            
            nombreCellOfi = new PdfPCell(new Phrase("REPORTE DE ACTIVIDADES", Mex));
            nombreCellOfi.setHorizontalAlignment(Element.ALIGN_CENTER);
            nombreCellOfi.setBorderColor(BaseColor.WHITE);
            nombreofi.addCell(nombreCellOfi);
            
            //reporteactividades
            PdfPTable reporte = new PdfPTable(1);
            reporte.setWidthPercentage(85f);
            PdfPCell nombreCellre;
            
            
            nombreCellre = new PdfPCell(new Phrase(observaciones, elements2));
            nombreCellre.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            //nombreCellre.setFixedHeight(200f); 
            nombreCellre.setBorderColor(BaseColor.WHITE);
            reporte.addCell(nombreCellre); 
            
            //asuntocomision
            PdfPTable gastos = new PdfPTable(2);
            gastos.setWidthPercentage(100f);
            PdfPCell gasto1,gasto2;
            //float[] medidaLineas2 = {0.35f,2.40f};
            gastos.setWidths(medidaLineas3);
            
            
            gasto1 = new PdfPCell(new Phrase("Gastos:", elements3));
            gasto1.setHorizontalAlignment(Element.ALIGN_LEFT);
            gasto1.setBorder(0);
            // Contenido del NOMBRE
            gasto2 = new PdfPCell(new Phrase("", elements2));
            gasto2.setBorderColor(BaseColor.WHITE);
            //lineas2.setBorderWidthTop(0);
            //lineas2.setBorderWidthLeft(0);
            //lineas2.setBorderWidthRight(0);
            gasto2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            gastos.addCell(gasto1);
            gastos.addCell(gasto2);
            
            //gastos a comprobar
            PdfPTable tablagastos = new PdfPTable(3);
            tablagastos.setWidthPercentage(100f);
            PdfPCell descripcion,precio,factura;
            float[] medidaLineasfor = {0.65f,0.65f,0.65f};
            tablagastos.setWidths(medidaLineasfor);
            
            //descripcion
            descripcion = new PdfPCell(new Phrase("Descripción", elements3));
            descripcion.setHorizontalAlignment(Element.ALIGN_CENTER);
            //des.setBorder(0);
            // precio
            precio = new PdfPCell(new Phrase("Precio", elements3));
            //pre.setBorderColor(BaseColor.WHITE);
            precio.setHorizontalAlignment(Element.ALIGN_CENTER);
            //factura
            factura = new PdfPCell(new Phrase("No Factura", elements3));
            //pre.setBorderColor(BaseColor.WHITE);
            factura.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            tablagastos.addCell(descripcion);
            tablagastos.addCell(precio);
            tablagastos.addCell(factura);
            
            //for para el arraylist de los gastos 
            for(int i=0; i<gc.size(); i++){
            tablagastos.addCell(gc.get(i).getDescripcion());
            tablagastos.addCell(gc.get(i).getCosto());
            tablagastos.addCell(gc.get(i).getFactura());
                
            }
            
            //frimas
            //area de firma de autorizado
            PdfPTable firmas = new PdfPTable(3);
            firmas.setWidthPercentage(100f);
            float[] medidaCeldasfirmas = {1.10f,1.85f,1.10f};
            firmas.setWidths(medidaCeldasfirmas);
            PdfPCell encabezadosfirmasCell,encabezadosfirmasCell2,encabezadosfirmasCell3;
            
            encabezadosfirmasCell = new PdfPCell(new Phrase("", elements2));
            //encabezadosfirmasCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCell.setBackgroundColor(BaseColor.WHITE);
            
            encabezadosfirmasCell2 = new PdfPCell(new Phrase("ATENTAMENTE", elements2));
            encabezadosfirmasCell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell2.setBorderColor(BaseColor.WHITE);
            
            //encabezadosfirmasCell2.setBorder(0);
            
            encabezadosfirmasCell3 = new PdfPCell(new Phrase("", elements2));
            //encabezadosfirmasCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell3.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCell3.setBackgroundColor(BaseColor.WHITE);

            firmas.addCell(encabezadosfirmasCell);
            firmas.addCell(encabezadosfirmasCell2);
            firmas.addCell(encabezadosfirmasCell3);
            
            //area de firma
            PdfPTable firmas2 = new PdfPTable(3);
            firmas2.setWidthPercentage(100f);
            float[] medidaCeldasfirmas2 = {1.10f,1.85f,1.10f};
            firmas2.setWidths(medidaCeldasfirmas2);
            PdfPCell encabezadosfirmasCell22,encabezadosfirmasCell32,encabezadosfirmasCell42;
            
            encabezadosfirmasCell22 = new PdfPCell(new Phrase("", elements2));
            //encabezadosfirmasCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell22.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCell22.setBackgroundColor(BaseColor.WHITE);
            
            encabezadosfirmasCell32 = new PdfPCell(new Phrase(empleado, elements2));
            encabezadosfirmasCell32.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell32.setBorderWidthBottom(0);
            encabezadosfirmasCell32.setBorderWidthLeft(0);
            encabezadosfirmasCell32.setBorderWidthRight(0);
            
            //encabezadosfirmasCell2.setBorder(0);
            
            encabezadosfirmasCell42 = new PdfPCell(new Phrase("", elements2));
            //encabezadosfirmasCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell42.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCell42.setBackgroundColor(BaseColor.WHITE);

            firmas2.addCell(encabezadosfirmasCell22);
            firmas2.addCell(encabezadosfirmasCell32);
            firmas2.addCell(encabezadosfirmasCell42);

            //area de firma
            PdfPTable puesto = new PdfPTable(3);
            puesto.setWidthPercentage(100f);
            float[] medidaCeldaspuesto = {1.10f,1.85f,1.10f};
            puesto.setWidths(medidaCeldaspuesto);
            PdfPCell encabezadosfirmasCellpu,encabezadosfirmasCellpu2,encabezadosfirmasCellpu3;
            
            encabezadosfirmasCellpu = new PdfPCell(new Phrase("", elements2));
            //encabezadosfirmasCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCellpu.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCellpu.setBackgroundColor(BaseColor.WHITE);
            
            encabezadosfirmasCellpu2 = new PdfPCell(new Phrase(puesto_trabajo, elements2));
            encabezadosfirmasCellpu2.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCellpu2.setBorderColor(BaseColor.WHITE);
            
            //encabezadosfirmasCell2.setBorder(0);
            
            encabezadosfirmasCellpu3 = new PdfPCell(new Phrase("", elements2));
            //encabezadosfirmasCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCellpu3.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCellpu3.setBackgroundColor(BaseColor.WHITE);

            puesto.addCell(encabezadosfirmasCellpu);
            puesto.addCell(encabezadosfirmasCellpu2);
            puesto.addCell(encabezadosfirmasCellpu3);
            
            //AGREGAR AL DOCUMENTO ----------------------------------------------------------------

            //Encabezado   Logo | Instituto estatal ....
            doc.add(Head);
            //folio
            //doc.add(BLANCO);
            doc.add(folio);
            //nombre
            //doc.add(BLANCO);
            doc.add(fecha);
            doc.add(BLANCO);
            doc.add(lugar);
            doc.add(BLANCO);
            doc.add(asunto);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(BLANCO);
            //Encabezados
            doc.add(nombreofi);
            //reportes
            doc.add(BLANCO);
            doc.add(BLANCO);
            doc.add(reporte);
            if(gc.size()>0){
                doc.add(BLANCO);
                doc.add(gastos);
                doc.add(BLANCO);
                doc.add(tablagastos);
            }
            
            doc.add(BLANCO);
            //doc.add(BLANCO);
            doc.add(firmas);
            
            doc.add(BLANCO);
            doc.add(BLANCO);
            doc.add(firmas2);
            doc.add(puesto);

            
            archivo_nombre = pdfFilename;

            if (res == 1) {
                imprimir();
            } else {
                JOptionPane.showMessageDialog(null, "Pase creado con éxito!", "Información", INFORMATION_MESSAGE);
            }
        } catch (java.io.FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR: No hay imagen prro dist\\print\\blogin.png", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        } catch (DocumentException dex) {
            dex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (doc != null) {
                doc.close();
            }
            if (docWriter != null) {
                docWriter.close();
            }
        }
    }
    public void imprimir() throws IOException{
        File fileToPrint = new File("C:\\SIIEEN\\oficiosreporteactividades\\"+archivo_nombre+".pdf");
		Desktop.getDesktop().open(fileToPrint);
    }
    
    private static void addEmptyLine(Paragraph paragraph, float number) {
        for (float i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
    
}
