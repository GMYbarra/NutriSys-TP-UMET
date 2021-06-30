//Clase destinada a las consultas de la tabla "Usuario"

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlUsuarios extends ConexionBD {

public boolean validarLogin(Usuarios user) {
		
		PreparedStatement ps = null; // Variables para los statements
		ResultSet rs = null;
		Connection con = conectar(); // Conexion
		
		String sql = "SELECT IdUsuario, NombreUsuario, UserPassword, Nombre, Apellido, Matricula FROM bd_nutrisys.usuario WHERE NombreUsuario = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getNombreUsuario());
			rs = ps.executeQuery();
			
			if (rs.next()) { //Verificamos si trae algun valor
				
				if(user.getUserPassword().equals(rs.getString(3))) { // 3 es la columna "UserPassword" en orden con el SELECT
					
					user.setIdUsuario(rs.getInt(1));	//Asignamos valores restantes a la clase "Usuario", util para seguir navegando en el programa
					user.setNombre(rs.getString(4));
					user.setApellido(rs.getString(5));
					user.setMatricula(rs.getInt(6));
					
					return true;
					
				} else {
					
					return false;
				}
			}
			
			return false; //Al devolver false, si llamamos al método, podremos comparar variables y verificar Login.
			
		} catch (SQLException e) {
			
			System.err.println(e);
			e.printStackTrace();
			return false;
		}
		
	}
	
}
