// Menu de cliente

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteFrame extends JFrame {

	private JPanel contentPane;

	private Coordinador var_coordinador;

	public void setVar_coordinador(Coordinador var_coordinador) {
		this.var_coordinador = var_coordinador;
	}

	/**
	 * Create the frame.
	 */
	public ClienteFrame() {
		setTitle("NutriSys");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblClientes_Titulo = new JLabel("Clientes");
		lblClientes_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo.setFont(new Font("Calibri", Font.BOLD, 30));
		lblClientes_Titulo.setBounds(0, 72, 764, 59);
		contentPane.add(lblClientes_Titulo);
		
		JButton btnClienteAgregar = new JButton("Agregar");
		btnClienteAgregar.addActionListener(new ActionListener() { // Transicion al frame "ClienteAgregar" - Registro de clientes
			public void actionPerformed(ActionEvent e) {
				var_coordinador.mostrarAgregarCliente();
			}
		});
		btnClienteAgregar.setBounds(317, 175, 145, 23);
		contentPane.add(btnClienteAgregar);
		
		JButton btnClienteBuscar = new JButton("Buscar cliente");
		btnClienteBuscar.setBounds(317, 223, 145, 23);
		contentPane.add(btnClienteBuscar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() { // Volvemos al frame "MenuFrame" - Menu principal
			public void actionPerformed(ActionEvent e) {
				var_coordinador.VolverMenu();
			}
		});
		btnVolver.setBounds(346, 397, 90, 23);
		contentPane.add(btnVolver);
		this.setLocationRelativeTo(null);
	}
}
