package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Validaciones {
	private final Conexion db;
	private final int CEROS_INVENTARIO;
	private final int CEROS_VALES;
	
	public Validaciones() {
		int ceros_inventario	= 0;
		int ceros_vales			= 0;
		db = new Conexion();
		
		try (PreparedStatement ps = db.getConexion().prepareCall("{CALL `ine`.`usp_get_concatZeros`()}")) {	
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ceros_inventario	= rs.getInt(1);
				ceros_vales			= rs.getInt(2);
			}
		} catch (SQLException ex) {
			Logger.getLogger(Validaciones.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		this.CEROS_INVENTARIO	= ceros_inventario;
		this.CEROS_VALES		= ceros_vales;
	}
	
	
	
    /**
    * <h1>validateAlphanumeric</h1>
    * 
    * Verifica si la cadena es alfanúmerica, según la longitud dada
    * 
    * @param txt Cadena a validar
    * @param lenght Longitod de la cadena
    * @return TRUE si la cadena es alfanumérica, FALSE caso contrario
    */
    public static boolean validateAlphanumeric(String txt, int lenght){
        return Pattern.compile("([A-Z0-9]){" + lenght + "}").matcher(txt).matches();
    }
    
    /**
    * <h1>validateAlphanumeric</h1>
    * 
    * Verifica si la cadena es alfanumerica, según el rango dado
    * por MIN y MAX
    * 
    * @param txt Cadena a validar
    * @param MIN Rango mínimo de la cadena
    * @param MAX Rángo máximo de la cadena
    * @return TRUE si la cadena es alfanumérica, FALSE caso contrario
    */
    public static boolean validateAlphanumeric(String txt, int MIN, int MAX){
        return Pattern.compile("([A-Za-z0-9]){" + MIN + "," + MAX + "}").matcher(txt).matches();
    }

    /**
    * <h1>validateInteger</h1>
    * 
    * Verifica si la cadena es numérica
    * 
    * @param txt Cadena a validar
    * @param lenght Longitud de la cadena
    * @return TRUE si la cadena es numérica, FALSE caso contrario
    */
    public static boolean validateInteger(String txt, int lenght){
        return Pattern.compile("([0-9]){" + lenght + "}").matcher(txt).matches();
    }
    
    /**
    * <h1>validateInteger</h1>
    * 
    * Verifica si la cadena es numérica, según el rango dado
    * por MIN y MAX
    * 
    * @param txt Cadena a validar
    * @param MIN Rango mínimo de la cadena
    * @param MAX Rángo máximo de la cadena
    * @return TRUE si la cadena es alfanumérica, FALSE caso contrario
    */
    public static boolean validateInteger(String txt, int MIN, int MAX){
        return Pattern.compile("([0-9]){" + MIN + "," + MAX + "}").matcher(txt).matches();
    }
    
    /**
    * <h1>validateAlphabetical</h1>
    * 
    * Verifica si la cadena contiene solo letras, 
    * según la longitud dada
    * 
    * @param txt Cadena a validar
    * @param lenght Longitud de la cadena
    * @return TRUE si la cadena solo contiene letras del alfabeto, FALSE caso contrario
    */
    public static boolean validateAlphabetical(String txt, int lenght){
        return Pattern.compile("([A-Za-z]){" + lenght + "}").matcher(txt).matches();
    }

    /**
    * <h1>validateAlphabetical</h1>
    * 
    * Verifica si la cadena contiene solo letras, 
    * según el rango dado por MIN y MAX
    * 
    * @param txt Cadena a validar
    * @param MIN Rango mínimo de la cadena
    * @param MAX Rángo máximo de la cadena
    * @return TRUE si la cadena solo contiene letras del alfabeto, FALSE caso contrario
    */
    public static boolean validateAlphabetical(String txt, int MIN, int MAX){
        return Pattern.compile("([A-Za-z]){" + MIN + "," + MAX + "}").matcher(txt).matches();
    }
 
    /**
    * <h1>validateMayus</h1>
    * 
    * Verifica si la cadena contiene solo letras mayúsculas, 
    * según la longitud dada
    * 
    * @param txt Cadena a validar
    * @param lenght Longitud de la cadena
    * @return TRUE si la cadena solo contiene letras mayúsculas, FALSE caso contrario
    */
    public static boolean validateMayus(String txt, int lenght){
        return Pattern.compile("([A-Z]){" + lenght + "}").matcher(txt).matches();
    }

    /**
    * <h1>validateMayus</h1>
    * 
    * Verifica si la cadena contiene solo letras mayúsculas, 
    * según el rango dado por MIN y MAX
    * 
    * @param txt Cadena a validar
    * @param MIN Rango mínimo de la cadena
    * @param MAX Rángo máximo de la cadena
    * @return TRUE si la cadena solo contiene letras mayúsculas, FALSE caso contrario
    */
    public static boolean validateMayus(String txt, int MIN, int MAX){
        return Pattern.compile("([A-Z]){" + MIN + "," + MAX + "}").matcher(txt).matches();
    }
    
    /**
    * <h1>validateMinus</h1>
    * 
    * Verifica si la cadena contiene solo letras minúsculas, 
    * según la longitud dada
    * 
    * @param txt Cadena a validar
    * @param lenght Longitud de la cadena
    * @return TRUE si la cadena solo contiene letras minúsculas, FALSE caso contrario
    */
    public static boolean validateMinus(String txt, int lenght){
        return Pattern.compile("([a-z]){" + lenght + "}").matcher(txt).matches();
    }

    /**
    * <h1>validateMayus</h1>
    * 
    * Verifica si la cadena contiene solo letras minúsculas, 
    * según el rango dado por MIN y MAX
    * 
    * @param txt Cadena a validar
    * @param MIN Rango mínimo de la cadena
    * @param MAX Rángo máximo de la cadena
    * @return TRUE si la cadena solo contiene letras minúsculas, FALSE caso contrario
    */
    public static boolean validateMinus(String txt, int MIN, int MAX){
        return Pattern.compile("([a-z]){" + MIN + "," + MAX + "}").matcher(txt).matches();
    }
    
    
    /**
    * <h1>validateClaveInventario</h1>
    * 
    * Verifica si la cadena contiene el formato para 
    * el ID del inventario normal, el cual consiste en 
    * todas las cadenas que empiecen con CMP seguidas
    * de 8 números
    * 
    * @param txt Cadena a validar
    * @return TRUE si la cadena solo contiene el formato especificado, FALSE caso contrario
    */
    public static boolean validateClaveInventario(String txt){
        return Pattern.compile( "CMP([0-9]{8})").matcher(txt).matches();
    }
    /**
    * <h1>validateClaveInventarioGranel</h1>
    * 
    * Verifica si la cadena contiene el formato para 
    * el ID del inventario normal, el cual consiste en 
    * todas las cadenas que empiecen con CMP seguidas
    * de 8 números
    * 
    * @param txt Cadena a validar
    * @return TRUE si la cadena solo contiene el formato especificado, FALSE caso contrario
    */
    public static boolean validateClaveInventarioGranel(String txt){
        return Pattern.compile( "GMP([0-9]{8})").matcher(txt).matches();
    }
    
    /**
    * <h1>validateNoSerieInventario</h1>
    * 
    * Verifica si la cadena contiene el formato para 
    * el número de serie con el formato especificado
    * que son 10 caracteres alfanuméricos
    * 
    * @param txt Cadena a validar
    * @return TRUE si la cadena solo contiene el formato especificado, FALSE caso contrario
    */
    public static boolean validateNoSerieInventario(String txt){
        return Pattern.compile("([A-Z0-9]){10}").matcher(txt).matches();
    }
    
    public static boolean validarNombres_añadirUsuario(String txt){
        return Pattern.compile("[A-Z]([a-z]{1,9})\u0020[A-Z]([a-z]{1,9})|[A-Z]([a-z]{1,19})").matcher(txt).matches();
    }
    
    /**
    * <h1>validateAlphanumericWithSpacing</h1>
    * 
    * Verifica si la cadena contiene el formato para 
    * el número de serie con el formato especificado
    * que son n caracteres alfanuméricos incluyendo espacio
    * 
    * @param txt Cadena a validar
    * @param MIN Rango mínimo de la cadena
    * @param MAX Rángo máximo de la cadena
    * @return TRUE si la cadena solo contiene el formato especificado, FALSE caso contrario
    */
    public static boolean validateAlphanumericWithSpacing(String txt,int MIN, int MAX){
        return Pattern.compile("([a-zA-Z0-9]|\u0020){" + MIN + "," + MAX + "}").matcher(txt).matches();
    }
	
	public String constructValesFormatID(String ID){
		
		StringBuilder sb = new StringBuilder();

		String[] arr	= ID.split("-");
		
		sb.append(arr[0]);
		sb.append("-");
		
		int int_lenght = arr[1].replaceAll("[A-C]", "").length();
		
		if (int_lenght < this.CEROS_VALES){ 
			for (int i = int_lenght; i < this.CEROS_VALES; i++)
				sb.append("0");
		}
		
		sb.append(arr[1]);
		sb.append("-");
		sb.append(arr[2]);
				
		return sb.toString();
	}
	
	public static String deconstructValesFormatID(String ID){
		StringBuilder sb = new StringBuilder();
		
		String[] array = ID.split("-");
		
		sb.append(array[0]);
		sb.append("-");
		sb.append(array[1].replaceFirst("^0+(?!$)", ""));
		sb.append("-");
		sb.append(array[2]);
		
		return sb.toString();
	}
	
	public String constructFormatID(String ID){

		StringBuilder sb = new StringBuilder();

		String[] arr	= ID.split("-");
		
		sb.append(arr[0]);
		sb.append("-");
		sb.append(arr[1]);
		sb.append("-");
		
		int int_lenght = arr[2].replaceAll("[A-C]", "").length();
		
		if (int_lenght < this.CEROS_INVENTARIO){ 
			for (int i = int_lenght; i < this.CEROS_INVENTARIO; i++)
				sb.append("0");
		}

		sb.append(arr[2]);
				
		return sb.toString();
	}
	
	public static String deconstructFormatID(String ID){
		StringBuilder sb = new StringBuilder();
		
		String[] array = ID.split("-");
		
		sb.append(array[0]);
		sb.append("-");
		sb.append(array[1]);
		sb.append("-");
		sb.append(array[2].replaceFirst("^0+(?!$)", ""));
		
		return sb.toString();
	}
}
