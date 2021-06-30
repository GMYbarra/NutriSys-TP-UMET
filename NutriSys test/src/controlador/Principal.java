package controlador;

import vista.ClienteFrame;
import vista.LoginFrame;
import vista.MenuFrame;
import vista.ClienteAgregar;

public class Principal {
	
	MenuFrame ventana_menu;
	LoginFrame ventana_login;
	ClienteFrame ventana_cliente;
	ClienteAgregar ventana_agregar_cliente;
	Coordinador var_coordinador; // Esta variable, sera la intermediaria entre las transiciones de los frames y el Coordinador


	public static void main(String[] args) {
				
		Principal programa = new Principal();
		programa.iniciar();

	}

	private void iniciar() { //Inicio del programa, y de los distintos frames, para su futuro uso
		
		ventana_menu = new MenuFrame();
		ventana_login = new LoginFrame();
		ventana_cliente = new ClienteFrame();
		ventana_agregar_cliente = new ClienteAgregar();
		var_coordinador = new Coordinador();
		
		ventana_login.setVar_coordinador(var_coordinador);
		ventana_menu.setVar_coordinador(var_coordinador);
		ventana_cliente.setVar_coordinador(var_coordinador);
		ventana_agregar_cliente.setVar_coordinador(var_coordinador);
		
		var_coordinador.setVentana_login(ventana_login);
		var_coordinador.setVentana_menu(ventana_menu);
		var_coordinador.setVentana_cliente(ventana_cliente);
		var_coordinador.setVentana_agregar_cliente(ventana_agregar_cliente);
		
		ventana_login.setVisible(true);
		
	}

}
