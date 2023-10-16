package operadoresclassmath;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaOperadoresMath extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumerador;
	private JTextField txtDenominador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOperadoresMath frame = new TelaOperadoresMath();
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
	public TelaOperadoresMath() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numerador");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 30, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 55, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Divisão Resul. =");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 153, 130, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz Quadrada =");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 178, 130, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblResulDivisao = new JLabel("0");
		lblResulDivisao.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblResulDivisao.setBounds(150, 155, 46, 14);
		contentPane.add(lblResulDivisao);
		
		JLabel lblRusulResto = new JLabel("0");
		lblRusulResto.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblRusulResto.setBounds(150, 180, 46, 14);
		contentPane.add(lblRusulResto);
		
		txtNumerador = new JTextField();
		txtNumerador.setBounds(110, 29, 86, 20);
		contentPane.add(txtNumerador);
		txtNumerador.setColumns(10);
		
		txtDenominador = new JTextField();
		txtDenominador.setBounds(110, 54, 86, 20);
		contentPane.add(txtDenominador);
		txtDenominador.setColumns(10);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numerador = Integer.parseInt(txtNumerador.getText());
				int denominador = Integer.parseInt(txtDenominador.getText());
				
				float divisao = numerador / denominador;
				float raiz = (float) Math.sqrt(numerador);
				
				lblResulDivisao.setText(Float.toString(divisao));
				lblRusulResto.setText(Float.toString(raiz));
			}
		});
		btnDividir.setBounds(97, 112, 89, 23);
		contentPane.add(btnDividir);
		
	}
}
