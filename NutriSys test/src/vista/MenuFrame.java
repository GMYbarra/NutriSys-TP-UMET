package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuFrame extends JFrame {

	private JPanel contentPane;

	private Coordinador var_coordinador;

	public void setVar_coordinador(Coordinador var_coordinador) {
		this.var_coordinador = var_coordinador;
	}

	/**
	 * Create the frame.
	 */
	public MenuFrame() {
		setTitle("NutriSys");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(343, 369, 104, 43);
		contentPane.add(btnSalir);
		
		JButton btnPlanes = new JButton("Planes (En progreso)");
		btnPlanes.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnPlanes.setBounds(309, 284, 177, 23);
		contentPane.add(btnPlanes);
		
		JButton btnTurnos = new JButton("Turnos (En progreso)");
		btnTurnos.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnTurnos.setBounds(309, 236, 177, 23);
		contentPane.add(btnTurnos);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var_coordinador.mostrarVentanaCliente();
			}
		});
		btnCliente.setBounds(309, 188, 177, 27);
		contentPane.add(btnCliente);
		
		JLabel lblBienvenido = new JLabel("\u00A1Bienvenido \"Usuario\"!");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Calibri", Font.BOLD, 30));
		lblBienvenido.setBounds(10, 53, 764, 59);
		contentPane.add(lblBienvenido);
	}

}
