//Clase todavía en desarrollo, destinada a la busqueda de clientes según ciertos parámetros

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class ClienteBuscar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	//Creacion de frame
	
	public ClienteBuscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes_Titulo = new JLabel("Buscar cliente");
		lblClientes_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo.setFont(new Font("Calibri", Font.BOLD, 30));
		lblClientes_Titulo.setBounds(10, 62, 764, 59);
		contentPane.add(lblClientes_Titulo);
		
		JButton btnVerDatos = new JButton("Ver datos");
		btnVerDatos.setBounds(168, 460, 145, 23);
		contentPane.add(btnVerDatos);
		
		JButton btnModificarDatos = new JButton("Modificar datos");
		btnModificarDatos.setBounds(325, 460, 145, 23);
		contentPane.add(btnModificarDatos);
		
		JButton btnEliminarCliente = new JButton("Eliminar cliente");
		btnEliminarCliente.setBounds(480, 460, 145, 23);
		contentPane.add(btnEliminarCliente);
		
		JLabel lblClientes_Titulo_1 = new JLabel("Seleccione metodo de b\u00FAsqueda");
		lblClientes_Titulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblClientes_Titulo_1.setBounds(10, 106, 764, 43);
		contentPane.add(lblClientes_Titulo_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DNI");
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBackground(new Color(0, 206, 209));
		rdbtnNewRadioButton.setBounds(204, 185, 52, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ID");
		rdbtnNewRadioButton_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 206, 209));
		rdbtnNewRadioButton_1.setBounds(204, 243, 52, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(261, 184, 133, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(261, 242, 133, 20);
		contentPane.add(textField_1);
		
		JLabel lblClientes_Titulo_1_1 = new JLabel("\u00BFQu\u00E9 desea realizar?");
		lblClientes_Titulo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblClientes_Titulo_1_1.setBounds(10, 394, 764, 43);
		contentPane.add(lblClientes_Titulo_1_1);
		
		JList list = new JList();
		list.setBounds(480, 184, 185, 123);
		contentPane.add(list);
		
		JButton btnVerDatos_1 = new JButton("Buscar");
		btnVerDatos_1.setBounds(278, 301, 97, 23);
		contentPane.add(btnVerDatos_1);
	}
}
