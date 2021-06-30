package modelo;

public class Clientes {
	
	private int IdCliente; //Mismas variables que en la Base de Datos
	private int DNI;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Direccion;
	private int Telefono;
	private String Condicion;
	private String Sexo;
	
	// Getters y Setters
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dni) {
		DNI = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getCondicion() {
		return Condicion;
	}
	public void setCondicion(String condicion) {
		Condicion = condicion;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	
	

}
