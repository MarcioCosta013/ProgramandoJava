package atividades;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaResolucaoSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResolucaoSwing frame = new TelaResolucaoSwing();
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
	public TelaResolucaoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaResolucaoSwing.class.getResource("/imagens/resolution.png")));
		lblNewLabel.setBounds(0, 0, 131, 128);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resolução da Tela");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(141, 11, 283, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResolucao = new JLabel("Clique no botão para ver a resolução...");
		lblResolucao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResolucao.setHorizontalAlignment(SwingConstants.CENTER);
		lblResolucao.setBounds(141, 36, 283, 14);
		contentPane.add(lblResolucao);
		
		JButton btnResolucao = new JButton("Click Aqui");
		btnResolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit tools = Toolkit.getDefaultToolkit();
				Dimension resolucao = tools.getScreenSize();
				lblResolucao.setText("A resolução da tela é: "+ resolucao.width + "X" + resolucao.height);
			}
		});
		btnResolucao.setBounds(188, 149, 203, 23);
		contentPane.add(btnResolucao);
	}

}
