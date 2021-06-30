package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

import controlador.Coordinador;
import modelo.Clientes;
import modelo.SqlClientes;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ClienteAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JTextField txtEdad;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	
	private Coordinador var_coordinador;
	private final ButtonGroup buttonGenero = new ButtonGroup();
	private JButton btnConfirmar;
	
	private String genero;


	
	public void setVar_coordinador(Coordinador var_coordinador) {
		this.var_coordinador = var_coordinador;
	}

	// Creacion de frame
	
	public ClienteAgregar() {
		setTitle("NutriSys");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblAgregar_Titulo = new JLabel("Agregar cliente");
		lblAgregar_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_Titulo.setFont(new Font("Calibri", Font.BOLD, 30));
		lblAgregar_Titulo.setBounds(10, 54, 764, 43);
		contentPane.add(lblAgregar_Titulo);
		
		JLabel lblAgregar_Subtitulo = new JLabel("Ingrese los datos del cliente");
		lblAgregar_Subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_Subtitulo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAgregar_Subtitulo.setBounds(10, 89, 764, 43);
		contentPane.add(lblAgregar_Subtitulo);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtNombre.setBounds(331, 165, 133, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(331, 196, 133, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(331, 227, 133, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(331, 258, 133, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtDireccion.setBounds(331, 289, 133, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtTelefono.setBounds(331, 320, 133, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNombre.setBounds(265, 168, 56, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblApellido.setBounds(265, 199, 56, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDni.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblDni.setBounds(287, 230, 34, 14);
		contentPane.add(lblDni);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEdad.setBounds(265, 263, 56, 14);
		contentPane.add(lblEdad);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblDireccion.setBounds(253, 292, 68, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblTelefono.setBounds(235, 323, 86, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblSexo.setBounds(235, 358, 86, 14);
		contentPane.add(lblSexo);
		
		JLabel lblCondicion = new JLabel("Condicion (En progreso):"); // Opcion en desarrollo, este checkbox se utilizará para agregar 0 o + opciones
		lblCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicion.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCondicion.setBounds(168, 383, 153, 14);
		contentPane.add(lblCondicion);
		
		JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setEnabled(false);
		chckbxDiabetes.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxDiabetes.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxDiabetes.setBackground(new Color(0, 206, 209));
		chckbxDiabetes.setBounds(331, 383, 86, 14);
		contentPane.add(chckbxDiabetes);
		
		JCheckBox chckbxCeliaquia = new JCheckBox("Celiaquia");
		chckbxCeliaquia.setEnabled(false);
		chckbxCeliaquia.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxCeliaquia.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxCeliaquia.setBackground(new Color(0, 206, 209));
		chckbxCeliaquia.setBounds(419, 383, 86, 14);
		contentPane.add(chckbxCeliaquia);
		
		JCheckBox chckbxHipertension = new JCheckBox("Hipertensi\u00F3n");
		chckbxHipertension.setEnabled(false);
		chckbxHipertension.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxHipertension.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxHipertension.setBackground(new Color(0, 206, 209));
		chckbxHipertension.setBounds(502, 383, 97, 14);
		contentPane.add(chckbxHipertension);
		
		JCheckBox chckbxOtra = new JCheckBox("Otra");
		chckbxOtra.setEnabled(false);
		chckbxOtra.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxOtra.setFont(new Font("Calibri", Font.PLAIN, 14));
		chckbxOtra.setBackground(new Color(0, 206, 209));
		chckbxOtra.setBounds(601, 383, 83, 14);
		contentPane.add(chckbxOtra);
		
		JButton btnConfirmar = new JButton("Confirmar"); // Boton de confirmación de registro de cliente
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SqlClientes modClt = new SqlClientes(); //Creacion de objetos
				Clientes mod = new Clientes();
				
				if(txtDNI.getText().equals("") || txtNombre.getText().equals("") || txtApellido.getText().equals("") 
						|| txtEdad.getText().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("") 
						|| genero == "" || txtApellido.getText().equals("")) { //Verificacion de campos vacios
					
					JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar todos los campos");
					
				}
				
				if (modClt.validarCliente(txtDNI.getText()) == 0) { //Verificacion de existencia de cliente, mediante el DNI
				
					mod.setDNI(Integer.parseInt(txtDNI.getText()));
					mod.setNombre(txtNombre.getText());
					mod.setApellido(txtApellido.getText());
					mod.setEdad(Integer.parseInt(txtEdad.getText()));
					mod.setDireccion(txtDireccion.getText());
					mod.setTelefono(Integer.parseInt(txtTelefono.getText()));
					mod.setSexo(genero);
					mod.setApellido(txtApellido.getText());
				
					if(modClt.registrarCliente(mod)) {
						JOptionPane.showMessageDialog(null, "Registro guardado"); //Registro: Si el método devuelve un "true", guarda los registros
					} else {
						JOptionPane.showMessageDialog(null, "Error al guardar registro"); //Registro: Al devolver "False", muestra error
					}
				} else {
					JOptionPane.showMessageDialog(null, "ERROR: DNI ya asignado"); //Validacion: Al devolver un valor que no sea 0, muestra error
				}
			}
		});
		btnConfirmar.setBounds(331, 422, 116, 35);
		contentPane.add(btnConfirmar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				var_coordinador.VolverCliente();
			}
			
		});
		btnVolver.setBounds(341, 478, 89, 23);
		contentPane.add(btnVolver);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genero = "Femenino";
			}
		});
		buttonGenero.add(rdbtnFemenino);
		rdbtnFemenino.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnFemenino.setBackground(new Color(0, 206, 209));
		rdbtnFemenino.setBounds(331, 352, 86, 23);
		contentPane.add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genero = "Masculino";
			}
		});
		buttonGenero.add(rdbtnMasculino);
		rdbtnMasculino.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnMasculino.setBackground(new Color(0, 206, 209));
		rdbtnMasculino.setBounds(419, 352, 86, 23);
		contentPane.add(rdbtnMasculino);
	}
}
