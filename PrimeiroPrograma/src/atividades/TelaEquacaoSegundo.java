package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TelaEquacaoSegundo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEquacaoSegundo frame = new TelaEquacaoSegundo();
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
	public TelaEquacaoSegundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spnA = new JSpinner();
		spnA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnA.setBounds(45, 51, 30, 20);
		contentPane.add(spnA);
		
		JLabel lblNewLabel = new JLabel("<html>X<sup>2</sup>+</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(75, 49, 36, 19);
		contentPane.add(lblNewLabel);
		
		JSpinner spnB = new JSpinner();
		spnB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnB.setBounds(104, 51, 30, 20);
		contentPane.add(spnB);
		
		JLabel lblNewLabel_1 = new JLabel("X-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(140, 54, 17, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spnC = new JSpinner();
		spnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnC.setBounds(156, 51, 30, 20);
		contentPane.add(spnC);
		
		JLabel lblNewLabel_2 = new JLabel("= 0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(193, 54, 30, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html>&Delta =</html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(75, 112, 30, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(new Color(255, 0, 0));
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblB.setBounds(103, 112, 17, 14);
		contentPane.add(lblB);
		
		JLabel lblNewLabel_5 = new JLabel("<html><sup>2</sup>- 4 .</html>");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(120, 101, 46, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(255, 0, 0));
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblA.setBounds(159, 112, 17, 14);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_7 = new JLabel(".");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(176, 110, 10, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(255, 0, 0));
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblC.setBounds(185, 112, 17, 14);
		contentPane.add(lblC);
		
		JPanel panResul = new JPanel();
		panResul.setBounds(10, 211, 252, 73);
		contentPane.add(panResul);
		panResul.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Tipo =");
		lblNewLabel_10.setBounds(10, 43, 44, 19);
		panResul.add(lblNewLabel_10);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_9 = new JLabel("<html>&Delta =</html>");
		lblNewLabel_9.setBounds(27, 13, 27, 20);
		panResul.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblResDelta = new JLabel("New label");
		lblResDelta.setForeground(new Color(0, 128, 255));
		lblResDelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResDelta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResDelta.setBounds(64, 16, 178, 14);
		panResul.add(lblResDelta);
		
		JLabel lblResulTipo = new JLabel("New label");
		lblResulTipo.setForeground(new Color(0, 128, 255));
		lblResulTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblResulTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResulTipo.setBounds(64, 47, 178, 14);
		panResul.add(lblResulTipo);
		
		JButton btnCalcular = new JButton("<html>Calcular &Delta</html>");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(81, 160, 105, 27);
		contentPane.add(btnCalcular);
	}
}
