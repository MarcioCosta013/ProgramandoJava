package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogioSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogioSwing frame = new TelaRelogioSwing();
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
	public TelaRelogioSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 11, 128, 139);
		lblNewLabel.setIcon(new ImageIcon(TelaRelogioSwing.class.getResource("/imagens/calendario.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data e Hota do Sistema");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(138, 23, 286, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblHora = new JLabel("Clique no Botão para ver...");
		lblHora.setForeground(new Color(192, 192, 192));
		lblHora.setBackground(new Color(255, 255, 255));
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora.setBounds(138, 48, 286, 14);
		contentPane.add(lblHora);
		
		JButton btnHora = new JButton("Click Aqui");
		btnHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lblHora.setText(relogio.toString());
			}
		});
		btnHora.setBounds(243, 179, 122, 23);
		contentPane.add(btnHora);
	}
}
