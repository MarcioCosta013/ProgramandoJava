package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSomaSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSomaSwing frame = new TelaSomaSwing();
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
	public TelaSomaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 181);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(149, 149, 149));
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela de soma");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel.setBounds(106, 11, 318, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaSomaSwing.class.getResource("/imagens/calculatorEditado.png")));
		lblNewLabel_1.setBounds(0, 0, 96, 98);
		contentPane.add(lblNewLabel_1);
		
		txtN1 = new JTextField();
		txtN1.setBounds(106, 57, 70, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(183, 57, 15, 19);
		contentPane.add(lblNewLabel_2);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(196, 57, 70, 20);
		contentPane.add(txtN2);
		
		JLabel lblResul = new JLabel("0");
		lblResul.setHorizontalAlignment(SwingConstants.CENTER);
		lblResul.setBounds(337, 60, 46, 14);
		contentPane.add(lblResul);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int soma = n1 + n2;
				lblResul.setText(Integer.toString(soma));
			}
		});
		btnSoma.setBounds(286, 57, 41, 21);
		contentPane.add(btnSoma);
		
	}
}
