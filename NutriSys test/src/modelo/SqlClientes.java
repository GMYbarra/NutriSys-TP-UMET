//Clase creada para todas las Querys en la tabla "Clientes"

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlClientes extends ConexionBD {
	
	public boolean registrarCliente(Clientes clt) {
		
		PreparedStatement ps = null; //Variable para los statements
		Connection con = conectar(); //Conexion
		
		String sql = "insert into bd_nutrisys.cliente (DNI, Nombre, Apellido, Edad, Direccion, Telefono, Sexo, Condicion) "
				+ "values (?,?,?,?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql); //Usamos la variable "sql" para enviar la consulta
			ps.setInt(1, clt.getDNI()); //El parametro "clt" servirá de referencia para asignar todos los valores
			ps.setString(2, clt.getNombre());
			ps.setString(3, clt.getApellido());
			ps.setInt(4, clt.getEdad());
			ps.setString(5, clt.getDireccion());
			ps.setInt(6, clt.getTelefono());
			ps.setString(7, clt.getSexo());
			ps.setString(8, clt.getCondicion());
			ps.execute();
			return true;
		} catch (SQLException e) { //Control de errores
			
			System.err.println(e);
			e.printStackTrace();
			return false;
		}
		
	}
	
public int validarCliente(String cliente) { //Verificamos si el cliente ya existe, con el DNI
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = conectar();
		
		String sql = "SELECT count(DNI) FROM bd_nutrisys.cliente WHERE DNI = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cliente);
			rs = ps.executeQuery(); //Al estar bien, ejecutamos la consulta
			
			if (rs.next()){
				return rs.getInt(1); // Al estar en valor 1, si encuentra, lo devuelve
			}
			
			return 1;
			
		} catch (SQLException e) {
			
			System.err.println(e);
			e.printStackTrace();
			return 1;
		}
		
	}
	

}
