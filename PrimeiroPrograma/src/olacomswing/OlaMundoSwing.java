package olacomswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OlaMundoSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoSwing frame = new OlaMundoSwing();
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
	public OlaMundoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessagem = new JLabel("Aqui aparece a mensagem");
		lblMessagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessagem.setBounds(84, 70, 283, 29);
		lblMessagem.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblMessagem);
		
		JButton btnClick = new JButton("Click aqui");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMessagem.setText("Olá Mundo!");
			}
		});
		btnClick.setBounds(150, 163, 143, 31);
		btnClick.setVerticalAlignment(SwingConstants.TOP);
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnClick);
	}

}
