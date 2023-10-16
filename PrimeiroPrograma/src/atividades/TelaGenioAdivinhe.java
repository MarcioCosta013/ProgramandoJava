package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class TelaGenioAdivinhe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenioAdivinhe frame = new TelaGenioAdivinhe();
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
	public TelaGenioAdivinhe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 374);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaGenioAdivinhe.class.getResource("/imagens/genius.png")));
		lblNewLabel_1.setBounds(270, 11, 213, 212);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblGenio = new JLabel("New label");
		lblGenio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGenio.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblGenio.setBounds(10, 32, 221, 143);
		contentPane.add(lblGenio);
		lblGenio.setText("<html> Oi, eu sou o Gênio Marcio! <br> Vou pensar em um numero aleatório de <strong>1 até 10</strong>, tente advinhar...</html>");
		
		JSpinner spnNum = new JSpinner();
		spnNum.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spnNum.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		spnNum.setBounds(153, 203, 60, 20);
		contentPane.add(spnNum);
		
		JButton btnPalpite = new JButton("Palpite...");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = Integer.parseInt(spnNum.getValue().toString());
				
				
				double random = Math.random();
				int genioResul = (int)(1 + random * (11-1));
				
				String acertou = "<html> Parabêns, você acertou! o numero que eu pensei foi <strong>" + genioResul+ "!</strong></html>";
				String errou = "<html> Ops, Você errou! o numero que eu pensei foi <strong>" + genioResul+ "!</strong></html>";
				
				lblGenio.setText( (num==genioResul) ? acertou:errou);
				
			}
		});
		btnPalpite.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnPalpite.setBounds(10, 203, 114, 23);
		contentPane.add(btnPalpite);
	}
}
