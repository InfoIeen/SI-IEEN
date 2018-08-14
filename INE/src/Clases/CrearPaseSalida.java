/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
package Clases;
import Clases.Conexion; 
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

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Vector;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class CrearPaseSalida {
    
    private File directorio;
    private File archivo;
    private String path, archivo_nombre;
  //  private infoTicket info;

    public CrearPaseSalida(){
    //    obtener_productos = new ObtenerProductos();
        path = "C:\\SIIEEN\\pases/";
        directorio = new File(path);
    //    info = new infoTicket();
            
        
        if (directorio.exists()) {
            archivo_nombre = "pase_" + ".pdf";
            archivo = new File(directorio, archivo_nombre);
        } else {
            directorio.mkdirs();
            if (directorio.exists()) {
                archivo_nombre = "pase_" +".pdf";
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
    
    private static Font elements2 = new Font(Font.FontFamily.HELVETICA, 8,
            Font.NORMAL);
    private static Font elements3 = new Font(Font.FontFamily.HELVETICA, 8,
            Font.BOLD);
    private static Font subFontF = new Font(Font.FontFamily.HELVETICA, 8,
            Font.NORMAL);
    
    
    
    
    
    public void createTicket(int res,String folio,String numero,String nombreem,String puesto,String area,String fecha,String horaes,String horall,String horas,String tipohorario,String tipoasunto,String asunto,String responsable)throws DocumentException {
        
        Rectangle pagesize = new Rectangle(250, 14400);
        Document doc = new Document(pagesize);
        PdfWriter docWriter = null;
        String pdfFilename=folio+"-"+numero+"-"+fecha;
        
        String[] separar=fecha.split("-");
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
        String fechacompleta=separar[0]+" de "+mes+" del "+separar[2];

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

            PdfPCell LogoCell = new PdfPCell(image, false);
            LogoCell.setBorderColor(BaseColor.WHITE);
          

            Head.addCell(LogoCell);
            
            PdfPCell Titulo = new PdfPCell(new Phrase("INSTITUTO ESTATAL ELECTORAL DE NAYARIT\nSECRETARÍA GENERAL", Mex));
            
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
            
            
            
            PdfPTable fechat = new PdfPTable(2);
            fechat.setWidthPercentage(100f);
            PdfPCell fechaCell,fechaCell2;
           // String[] fechaDes = fecha.split("/");         
            
           
            PdfPTable nombre = new PdfPTable(1);
            nombre.setWidthPercentage(100f);
            PdfPCell nombreCell;
            
            nombreCell = new PdfPCell(new Phrase("FOLIO: "+folio+"-"+numero, elements3));
            nombreCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            nombreCell.setBorderColor(BaseColor.WHITE);
            nombre.addCell(nombreCell);
            
            
            // ENCABEZADOS
            PdfPTable encabezados = new PdfPTable(3);
            encabezados.setWidthPercentage(100f);
            float[] medidaCeldasEncabezados = {2.25f,0.30f, 2.25f};
            encabezados.setWidths(medidaCeldasEncabezados);
            PdfPCell encabezadosCell,encabezadosCell2,encabezadosCell3;
            
            encabezadosCell = new PdfPCell(new Phrase("Por Horario", elements3));
            encabezadosCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosCell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            encabezadosCell2 = new PdfPCell(new Phrase("", elements2));
            
            encabezadosCell2.setBorder(0);
            
            encabezadosCell3 = new PdfPCell(new Phrase("Por Asunto", elements3));
            encabezadosCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosCell3.setBackgroundColor(BaseColor.LIGHT_GRAY);

            encabezados.addCell(encabezadosCell);
            encabezados.addCell(encabezadosCell2);
            encabezados.addCell(encabezadosCell3);
            
            
            
            // CONTENIDO
            PdfPTable contenido = new PdfPTable(7);
            contenido.setWidthPercentage(100f);
            float[] contenidomedidas = {2.25f,2.25f,2.25f,0.90f, 2.25f,2.25f,2.25f};
            contenido.setWidths(contenidomedidas);
            PdfPCell contenido1,contenido2,contenido3,contenido4,contenido5,contenido6,contenido7;
            
            contenido1 = new PdfPCell(new Phrase("De Entrada", elements2));
            contenido1.setHorizontalAlignment(Element.ALIGN_CENTER);
            if(tipohorario.equals("De Entrada")){
                contenido1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            }
            
            contenido2 = new PdfPCell(new Phrase("Intermedio", elements2));
            contenido2.setHorizontalAlignment(Element.ALIGN_CENTER);
            if(tipohorario.equals("Intermedio")){
                contenido2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            }
            
            contenido3 = new PdfPCell(new Phrase("De Salida", elements2));
            contenido3.setHorizontalAlignment(Element.ALIGN_CENTER);
            if(tipohorario.equals("De Salida")){
                contenido3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            }
            
            contenido4 = new PdfPCell(new Phrase("", elements3));
            contenido4.setBorder(0);
            contenido5 = new PdfPCell(new Phrase("Particular", elements2));
            contenido5.setHorizontalAlignment(Element.ALIGN_CENTER);
            if(tipoasunto.equals("Particular")){
                contenido5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            }
            
            contenido6 = new PdfPCell(new Phrase("Oficial", elements2));
            contenido6.setHorizontalAlignment(Element.ALIGN_CENTER);
            if(tipoasunto.equals("Oficial")){
                contenido6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            }
            
            contenido7 = new PdfPCell(new Phrase("Médico", elements2));
            contenido7.setHorizontalAlignment(Element.ALIGN_CENTER);
            if(tipoasunto.equals("Médico")){
                contenido7.setBackgroundColor(BaseColor.LIGHT_GRAY);
            }

            contenido.addCell(contenido1);
            contenido.addCell(contenido2);
            contenido.addCell(contenido3);
            contenido.addCell(contenido4);
            contenido.addCell(contenido5);
            contenido.addCell(contenido6);
            contenido.addCell(contenido7);
            
            PdfPTable tableLineas = new PdfPTable(2);
            tableLineas.setWidthPercentage(100f);
            PdfPCell lineas1,lineas2;
            float[] medidaLineas = {0.50f, 2.25f};
            tableLineas.setWidths(medidaLineas);
            
            
            lineas1 = new PdfPCell(new Phrase("Tepic, Nayarit a:", elements3));
            lineas1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas1.setBorder(0);
            // Contenido de la linea
            
            //lineas2 = new PdfPCell(new Phrase("ESTE ES UN EJEMPLO DE UNA FECHA "+"de 2018.", elements2));
            lineas2 = new PdfPCell(new Phrase(fechacompleta, elements2));
            lineas2.setBorderWidthTop(0);
            lineas2.setBorderWidthLeft(0);
            lineas2.setBorderWidthRight(0);
            lineas2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            tableLineas.addCell(lineas1);
            tableLineas.addCell(lineas2);
            
            
            
            PdfPTable tableLineas2 = new PdfPTable(2);
            tableLineas2.setWidthPercentage(100f);
            PdfPCell lineas12,lineas22;
            tableLineas2.setWidths(medidaLineas);
            
            lineas12 = new PdfPCell(new Phrase("Nombre:", elements3));
            lineas12.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas12.setBorder(0);
            // Contenido de la linea
            //lineas22 = new PdfPCell(new Phrase("ESTE ES UN EJEMPLO DE UN NOMBRE", elements2));
            lineas22 = new PdfPCell(new Phrase(nombreem, elements2));
            lineas22.setBorderWidthTop(0);
            lineas22.setBorderWidthLeft(0);
            lineas22.setBorderWidthRight(0);
            lineas22.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            tableLineas2.addCell(lineas12);
            tableLineas2.addCell(lineas22);
            
            
            
            PdfPTable tableLineas3 = new PdfPTable(2);
            tableLineas3.setWidthPercentage(100f);
            PdfPCell lineas13,lineas23;
            tableLineas3.setWidths(medidaLineas);
            
            lineas13 = new PdfPCell(new Phrase("Puesto y/o Cargo:", elements3));
            lineas13.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas13.setBorder(0);
            // Contenido de la linea
            //lineas23 = new PdfPCell(new Phrase("ESTE ES UN EJEMPLO DE UN PUESTO y/o Cargo", elements2));
            lineas23 = new PdfPCell(new Phrase(puesto, elements2));
            lineas23.setBorderWidthTop(0);
            lineas23.setBorderWidthLeft(0);
            lineas23.setBorderWidthRight(0);
            lineas23.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            tableLineas3.addCell(lineas13);
            tableLineas3.addCell(lineas23);
            
            
            
            PdfPTable tableLineas4 = new PdfPTable(2);
            tableLineas4.setWidthPercentage(100f);
            PdfPCell lineas14,lineas24;
            tableLineas4.setWidths(medidaLineas);
            
            lineas14 = new PdfPCell(new Phrase("Dirección/Área:", elements3));
            lineas14.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas14.setBorder(0);
            // Contenido de la linea
            //lineas24 = new PdfPCell(new Phrase("ESTE ES UN EJEMPLO DE UNA Dirección/Área", elements2));
            lineas24 = new PdfPCell(new Phrase(area, elements2));
            lineas24.setBorderWidthTop(0);
            lineas24.setBorderWidthLeft(0);
            lineas24.setBorderWidthRight(0);
            lineas24.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            tableLineas4.addCell(lineas14);
            tableLineas4.addCell(lineas24);
            
            
            
            PdfPTable tableLineas5 = new PdfPTable(6);
            tableLineas5.setWidthPercentage(100f);
            float[] contenidomedidash = {2.45f,2.50f,2.10f,2.50f,1.70f,2.50f};
            tableLineas5.setWidths(contenidomedidash);
            PdfPCell lineas15,lineas25,lineas151,lineas251,lineas152,lineas252;
            //tableLineas5.setWidths(medidaLineas);
            
            lineas15 = new PdfPCell(new Phrase("Hora de E/S:", elements3));
            lineas15.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas15.setBorder(0);
            // Contenido de la linea
            //lineas25 = new PdfPCell(new Phrase("123 "+"Hora de regreso: "+"123123"+" Horas: "+"222hrs", elements2));
            lineas25 = new PdfPCell(new Phrase(horaes, elements2));
            lineas25.setBorderWidthTop(0);
            lineas25.setBorderWidthLeft(0);
            lineas25.setBorderWidthRight(0);
            lineas25.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            //puntohorall
            
            lineas151 = new PdfPCell(new Phrase("Hora de llegada:", elements3));
            lineas151.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas151.setBorder(0);
            // Contenido de la linea
            //lineas25 = new PdfPCell(new Phrase("123 "+"Hora de regreso: "+"123123"+" Horas: "+"222hrs", elements2));
            lineas251 = new PdfPCell(new Phrase(horall, elements2));
            lineas251.setBorderWidthTop(0);
            lineas251.setBorderWidthLeft(0);
            lineas251.setBorderWidthRight(0);
            lineas251.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            //puntohoras
            lineas152 = new PdfPCell(new Phrase("Horas:", elements3));
            lineas152.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas152.setBorder(0);
            // Contenido de la linea
            //lineas25 = new PdfPCell(new Phrase("123 "+"Hora de regreso: "+"123123"+" Horas: "+"222hrs", elements2));
            lineas252 = new PdfPCell(new Phrase(horas, elements2));
            lineas252.setBorderWidthTop(0);
            lineas252.setBorderWidthLeft(0);
            lineas252.setBorderWidthRight(0);
            lineas252.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            tableLineas5.addCell(lineas15);
            tableLineas5.addCell(lineas25);
            tableLineas5.addCell(lineas151);
            tableLineas5.addCell(lineas251);
            tableLineas5.addCell(lineas152);
            tableLineas5.addCell(lineas252);
                        
            //lineasasunto
            
            PdfPTable tableLineas6 = new PdfPTable(2);
            tableLineas6.setWidthPercentage(100f);
            PdfPCell lineas16,lineas26;
            tableLineas6.setWidths(medidaLineas);
            
            lineas16 = new PdfPCell(new Phrase("Asunto:",elements3));
            lineas16.setHorizontalAlignment(Element.ALIGN_RIGHT);
            lineas16.setBorder(0);
            // Contenido de la linea
            lineas26 = new PdfPCell(new Phrase(asunto, elements2));
            lineas26.setBorderWidthTop(0);
            lineas26.setBorderWidthLeft(0);
            lineas26.setBorderWidthRight(0);
            lineas26.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            
            tableLineas6.addCell(lineas16);
            tableLineas6.addCell(lineas26);

            PdfPCell cell = new PdfPCell(new Phrase("--------------------------------------------------------------------------------", estilo));
            
            PdfPTable midLane = new PdfPTable(1);
           //LINEA A LA MITAD
            midLane.setWidthPercentage(110f);
           
            cell.setBorderColor(BaseColor.WHITE);
            midLane.addCell(cell);

            // AREA DE FIRMAS
            
             // ENCABEZADOS
            PdfPTable firmas = new PdfPTable(3);
            firmas.setWidthPercentage(100f);
            float[] medidaCeldasfirmas = {2.25f,0.30f, 2.25f};
            firmas.setWidths(medidaCeldasEncabezados);
            PdfPCell encabezadosfirmasCell,encabezadosfirmasCell2,encabezadosfirmasCell3;
            
            encabezadosfirmasCell = new PdfPCell(new Phrase(nombreem, elements2));
            encabezadosfirmasCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCell.setBackgroundColor(BaseColor.WHITE);
            
            encabezadosfirmasCell2 = new PdfPCell(new Phrase("", elements2));
            
            encabezadosfirmasCell2.setBorder(0);
            
            encabezadosfirmasCell3 = new PdfPCell(new Phrase(responsable, elements2));
            encabezadosfirmasCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            encabezadosfirmasCell3.setBorderColor(BaseColor.WHITE);
            encabezadosfirmasCell3.setBackgroundColor(BaseColor.WHITE);

            firmas.addCell(encabezadosfirmasCell);
            firmas.addCell(encabezadosfirmasCell2);
            firmas.addCell(encabezadosfirmasCell3);
            
            
            
            // CONTENIDO
            PdfPTable contenidofirmas = new PdfPTable(7);
            contenidofirmas.setWidthPercentage(100f);
            float[] contenidomedidasfirmas = {1.85f,2.10f,1.85f,1.70f, 1.85f,2.10f,1.85f};
            contenidofirmas.setWidths(contenidomedidasfirmas);
            PdfPCell contenidofirmas1,contenidofirmas2,contenidofirmas3,contenidofirmas4,contenidofirmas5,contenidofirmas6,contenidofirmas7;
            
            contenidofirmas1 = new PdfPCell(new Phrase("", elements2));
            contenidofirmas1.setHorizontalAlignment(Element.ALIGN_CENTER);
            //contenidofirmas1.setBorderWidthTop(0);
            contenidofirmas1.setBorderWidthLeft(0);
            contenidofirmas1.setBorderWidthRight(0);
            contenidofirmas1.setBorderWidthBottom(0);
            //contenidofirmas1.setBorderColor(BaseColor.WHITE);
            
            contenidofirmas2 = new PdfPCell(new Phrase("Nombre y Firma\nSolicitante", elements3));
            contenidofirmas2.setHorizontalAlignment(Element.ALIGN_CENTER);
            //contenidofirmas1.setBorderWidthTop(0);
            contenidofirmas2.setBorderWidthLeft(0);
            contenidofirmas2.setBorderWidthRight(0);
            contenidofirmas2.setBorderWidthBottom(0);
            //contenidofirmas2.setBorderColor(BaseColor.WHITE);
            
            contenidofirmas3 = new PdfPCell(new Phrase("", elements2));
            contenidofirmas3.setHorizontalAlignment(Element.ALIGN_CENTER);
            //contenidofirmas1.setBorderWidthTop(0);
            contenidofirmas3.setBorderWidthLeft(0);
            contenidofirmas3.setBorderWidthRight(0);
            contenidofirmas3.setBorderWidthBottom(0);
            //contenidofirmas3.setBorderColor(BaseColor.WHITE);
            
            contenidofirmas4 = new PdfPCell(new Phrase("", elements3));
            contenidofirmas4.setBorder(0);
            
            contenidofirmas5 = new PdfPCell(new Phrase("", elements2));
            contenidofirmas5.setHorizontalAlignment(Element.ALIGN_CENTER);
            //contenidofirmas1.setBorderWidthTop(0);
            contenidofirmas5.setBorderWidthLeft(0);
            contenidofirmas5.setBorderWidthRight(0);
            contenidofirmas5.setBorderWidthBottom(0);
            //contenidofirmas5.setBorderColor(BaseColor.WHITE);
            
            contenidofirmas6 = new PdfPCell(new Phrase("Nombre y Firma\nResponsable del Área", elements3));
            contenidofirmas6.setHorizontalAlignment(Element.ALIGN_CENTER);
            //contenidofirmas1.setBorderWidthTop(0);
            contenidofirmas6.setBorderWidthLeft(0);
            contenidofirmas6.setBorderWidthRight(0);
            contenidofirmas6.setBorderWidthBottom(0);
            //contenidofirmas6.setBorderColor(BaseColor.WHITE);
            
            contenidofirmas7 = new PdfPCell(new Phrase("", elements2));
            contenidofirmas7.setHorizontalAlignment(Element.ALIGN_CENTER);
            //contenidofirmas1.setBorderWidthTop(0);
            contenidofirmas7.setBorderWidthLeft(0);
            contenidofirmas7.setBorderWidthRight(0);
            contenidofirmas7.setBorderWidthBottom(0);
            //contenidofirmas7.setBorderColor(BaseColor.WHITE);

            contenidofirmas.addCell(contenidofirmas1);
            contenidofirmas.addCell(contenidofirmas2);
            contenidofirmas.addCell(contenidofirmas3);
            contenidofirmas.addCell(contenidofirmas4);
            contenidofirmas.addCell(contenidofirmas5);
            contenidofirmas.addCell(contenidofirmas6);
            contenidofirmas.addCell(contenidofirmas7);
            
            /*PdfPTable firma = new PdfPTable(2);
            PdfPCell firmaCell,firmaCell1,firmaCell2;
            
            firmaCell1 = new PdfPCell(new Phrase(nombreem, subFontF));
            firmaCell1.setBorderColor(BaseColor.WHITE);
            firmaCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
            firmaCell = new PdfPCell(new Phrase("_______________________________\n"+"Nombre y Firma\nSolicitante", subFontF));
            firmaCell.setBorderColor(BaseColor.WHITE);
            firmaCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            firmaCell2 = new PdfPCell(new Phrase("_______________________________\nNombre y Firma\nResponsable del Área", subFontF));
            firmaCell2.setBorderColor(BaseColor.WHITE);
            firmaCell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            firma.addCell(firmaCell);
            firma.addCell(firmaCell1);
            firma.addCell(firmaCell2);*/
            
            
            //AGREGAR AL DOCUMENTO ----------------------------------------------------------------

            //Encabezado   Logo | Instituto estatal ....
            doc.add(Head); 
            //nombre
            doc.add(nombre);
            //Espacio en blanco
            doc.add(BLANCO);
            //Encabezados
            doc.add(encabezados);
            doc.add(contenido);
            //Espacio en blanco
            doc.add(BLANCO);
            // Lineas
            doc.add(tableLineas);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas2);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas3);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas4);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas5);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas6);
            //Espacio en blanco
            doc.add(BLANCO);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(firmas);
            doc.add(contenidofirmas);
            //linea
            doc.add(midLane);
            //COPIAAAA               ----------------------------------------------------------------

            //Encabezado   Logo | Instituto estatal ....
            doc.add(Head); 
            //nombre
            doc.add(nombre);
            //Espacio en blanco
            doc.add(BLANCO);
            //Encabezados
            doc.add(encabezados);
            doc.add(contenido);
            //Espacio en blanco
            doc.add(BLANCO);
            // Lineas
            doc.add(tableLineas);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas2);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas3);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas4);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas5);
            //Espacio en blanco
            doc.add(BLANCO);
            doc.add(tableLineas6);
            //Espacio en blanco
            doc.add(BLANCO);
            //Espacio en blanco
            doc.add(BLANCO);
            //Espacio en blanco
            //doc.add(BLANCO);
            doc.add(firmas);
            doc.add(contenidofirmas);
            //linea
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
        File fileToPrint = new File("C:\\SIIEEN\\pases/"+archivo_nombre+".pdf");
		Desktop.getDesktop().open(fileToPrint);
    }
    
    private static void addEmptyLine(Paragraph paragraph, float number) {
        for (float i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

}