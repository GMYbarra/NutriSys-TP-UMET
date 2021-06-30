package modelo;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class ConexionBD {
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; //Datos para conectar a la Base de Datos
	private static final String BD = "bd_nutrisys";
	private static final String USER = "root";
	private static final String PASSWORD = "gonza123";
	private static final String URL = "jdbc:mysql://localhost:3306/"+BD+"";
	

	
	public Connection conectar() {
		
		Connection conexion = null;	
		
		try {
			
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Todo OK"); //Conexion correcta
			
		} catch (ClassNotFoundException e) {	//Mensajes que se muestran también en consola, para verificar errores como desarrollador
			JOptionPane.showMessageDialog(null, "ERROR: No se puede cargar el controlador - Instale MYSQL");
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR: No se puede conectar a la Base de Datos - INSTALE MYSQL");
			e.printStackTrace();
		}
		
		return conexion;
		
	}
	
}
