//Esta clase se encarga de gestionar las transiciones entre las ventanas

package controlador;

import vista.MenuFrame;
import vista.LoginFrame;
import vista.ClienteAgregar;
import vista.ClienteFrame;

public class Coordinador {

	MenuFrame ventana_menu;
	LoginFrame ventana_login;
	ClienteFrame ventana_cliente;
	ClienteAgregar ventana_agregar_cliente;
	
	//Getters y setters
	
	public MenuFrame getVentana_menu() {
		return ventana_menu;
	}
	public void setVentana_menu(MenuFrame ventana_menu) {
		this.ventana_menu = ventana_menu;
	}
	public LoginFrame getVentana_login() {
		return ventana_login;
	}
	public void setVentana_login(LoginFrame ventana_login) {
		this.ventana_login = ventana_login;
	}
	public ClienteFrame getVentana_cliente() {
		return ventana_cliente;
	}
	public void setVentana_cliente(ClienteFrame ventana_cliente) {
		this.ventana_cliente = ventana_cliente;
	}
	public ClienteAgregar getVentana_agregar_cliente() {
		return ventana_agregar_cliente;
	}
	public void setVentana_agregar_cliente(ClienteAgregar ventana_agregar_cliente) {
		this.ventana_agregar_cliente = ventana_agregar_cliente;
	}
	
	//Metodos - Login
	
	public void mostrarVentanaMenu() {
		ventana_menu.setVisible(true);
		ventana_login.dispose();
	}
	
	//Metodos - Menu Principal
	
	public void mostrarVentanaCliente() {
		ventana_cliente.setVisible(true);
		ventana_menu.dispose();
	}
	
	public void VolverMenu() {
		ventana_menu.setVisible(true);
		ventana_cliente.dispose();
	}
	
	// Metodos - Sección Cliente
	
	public void mostrarAgregarCliente() {
		ventana_agregar_cliente.setVisible(true);
		ventana_cliente.dispose();
	}
	
	public void VolverCliente() {
		ventana_cliente.setVisible(true);
		ventana_agregar_cliente.dispose();
	}
	
}
