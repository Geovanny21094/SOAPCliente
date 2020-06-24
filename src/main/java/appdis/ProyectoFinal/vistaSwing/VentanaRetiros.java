package appdis.ProyectoFinal.vistaSwing;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaRetiros extends JInternalFrame {
	private JTextField textCuenta;
	private JTextField textCedula;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textMonto;
	private JTextField textSaldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRetiros frame = new VentanaRetiros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRetiros() {
		setTitle("Retiros");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 834, 448);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("# cuenta:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(63, 77, 81, 19);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(63, 129, 81, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(63, 177, 81, 19);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(63, 239, 81, 19);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monto:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(410, 239, 62, 19);
		getContentPane().add(lblNewLabel_4);
		
		textCuenta = new JTextField();
		textCuenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCuenta.setBounds(187, 75, 116, 22);
		getContentPane().add(textCuenta);
		textCuenta.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCedula.setBounds(187, 123, 116, 22);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);
		
		textNombres = new JTextField();
		textNombres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNombres.setBounds(187, 174, 116, 22);
		getContentPane().add(textNombres);
		textNombres.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textApellidos.setBounds(187, 236, 116, 22);
		getContentPane().add(textApellidos);
		textApellidos.setColumns(10);
		
		textMonto = new JTextField();
		textMonto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMonto.setBounds(484, 237, 116, 22);
		getContentPane().add(textMonto);
		textMonto.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBuscar.setBounds(369, 75, 97, 25);
		getContentPane().add(btnBuscar);
		
		JButton btnGuardar = new JButton("Confirmar Retiro");
		btnGuardar.setBounds(294, 339, 166, 40);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(472, 339, 97, 40);
		getContentPane().add(btnCancelar);
		
		JLabel lblNewLabel_5 = new JLabel("Datos de la cuenta");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(98, 13, 218, 33);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Saldo:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(63, 300, 69, 16);
		getContentPane().add(lblNewLabel_6);
		
		textSaldo = new JTextField();
		textSaldo.setBounds(187, 298, 116, 22);
		getContentPane().add(textSaldo);
		textSaldo.setColumns(10);

	}
}
