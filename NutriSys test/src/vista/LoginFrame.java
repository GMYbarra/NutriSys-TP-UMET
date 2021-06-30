//Ventana inicial - Login

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.SqlUsuarios;
import modelo.Usuarios;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	
	private Coordinador var_coordinador;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	public void setVar_coordinador(Coordinador var_coordinador) {
		this.var_coordinador = var_coordinador;
	}
	
	//Creacion de frame
	
	public LoginFrame() {
		setTitle("NutriSys");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() { // Boton para ingresar al Menu principal - Login
			public void actionPerformed(ActionEvent e) {
				
				SqlUsuarios modUsr = new SqlUsuarios();
				Usuarios mod = new Usuarios();
				
				String pass = new String(txtPassword.getPassword());
				
				if(!txtUsuario.getText().equals("") && !pass.equals("")){ // Comparamos ambos casos, si hay o no algún campo, para continuar con el login
					
					mod.setNombreUsuario(txtUsuario.getText());
					mod.setUserPassword(pass);
					
					if(modUsr.validarLogin(mod)) {
						
						JOptionPane.showMessageDialog(null, "¡Login exitoso!"); //Si el login es exitoso, muestra mensaje y cambia de frame
						var_coordinador.mostrarVentanaMenu(); //Transicion al Menu principal "MenuFrame"
						
					} else {
						JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrectos"); //Caso contrario, informa error
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Debe ingresar sus datos"); //Si no ingresamos valores, informa error
				}
								
			}
		});
		btnEntrar.setBounds(337, 347, 123, 59);
		contentPane.add(btnEntrar);
		
		JLabel lblTitulo = new JLabel("NutriSys");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 81, 774, 59);
		contentPane.add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(252, 195, 86, 27);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(337, 200, 123, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(237, 233, 101, 27);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("");
		txtPassword.setBounds(337, 238, 123, 20);
		contentPane.add(txtPassword);
	}
}
