//Clase destinada a mostrar el cliente buscado (En desarrollo)

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
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ClienteDatos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public ClienteDatos() {
		setTitle("NutriSys");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes_Titulo = new JLabel("Datos del cliente");
		lblClientes_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo.setFont(new Font("Calibri", Font.BOLD, 30));
		lblClientes_Titulo.setBounds(10, 76, 764, 59);
		contentPane.add(lblClientes_Titulo);
		
		JPanel ImagenCliente = new JPanel();
		ImagenCliente.setBounds(333, 146, 113, 95);
		contentPane.add(ImagenCliente);
		
		JLabel lblClientes_Titulo_1_1 = new JLabel("ID cliente");
		lblClientes_Titulo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblClientes_Titulo_1_1.setBounds(10, 252, 764, 25);
		contentPane.add(lblClientes_Titulo_1_1);
		
		JLabel lblClientes_Titulo_1_1_1 = new JLabel("Nombre Apellido");
		lblClientes_Titulo_1_1_1.setToolTipText("");
		lblClientes_Titulo_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblClientes_Titulo_1_1_1.setBounds(10, 274, 764, 36);
		contentPane.add(lblClientes_Titulo_1_1_1);
		
		JLabel lblClientes_Titulo_1_1_2 = new JLabel("DNI");
		lblClientes_Titulo_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes_Titulo_1_1_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblClientes_Titulo_1_1_2.setBounds(10, 303, 764, 43);
		contentPane.add(lblClientes_Titulo_1_1_2);
		
		JLabel lblEdaad = new JLabel("Edad:");
		lblEdaad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdaad.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEdaad.setBounds(260, 362, 56, 14);
		contentPane.add(lblEdaad);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(326, 357, 133, 20);
		contentPane.add(textField);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccin.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblDireccin.setBounds(248, 391, 68, 14);
		contentPane.add(lblDireccin);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(326, 388, 133, 20);
		contentPane.add(textField_1);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblTelefono.setBounds(230, 422, 86, 14);
		contentPane.add(lblTelefono);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(326, 419, 133, 20);
		contentPane.add(textField_2);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicion.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCondicion.setBounds(177, 446, 86, 14);
		contentPane.add(lblCondicion);
		
		JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxDiabetes.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxDiabetes.setBackground(new Color(0, 206, 209));
		chckbxDiabetes.setBounds(273, 446, 86, 14);
		contentPane.add(chckbxDiabetes);
		
		JCheckBox chckbxCeliaquia = new JCheckBox("Celiaquia");
		chckbxCeliaquia.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxCeliaquia.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxCeliaquia.setBackground(new Color(0, 206, 209));
		chckbxCeliaquia.setBounds(361, 446, 86, 14);
		contentPane.add(chckbxCeliaquia);
		
		JCheckBox chckbxHipertensin = new JCheckBox("Hipertensi\u00F3n");
		chckbxHipertensin.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxHipertensin.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxHipertensin.setBackground(new Color(0, 206, 209));
		chckbxHipertensin.setBounds(444, 446, 97, 14);
		contentPane.add(chckbxHipertensin);
		
		JCheckBox chckbxOtra = new JCheckBox("Otra");
		chckbxOtra.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxOtra.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxOtra.setBackground(new Color(0, 206, 209));
		chckbxOtra.setBounds(543, 446, 83, 14);
		contentPane.add(chckbxOtra);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(333, 490, 118, 36);
		contentPane.add(btnNewButton);
	}
}
