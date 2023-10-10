package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class TelaIdiomaSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdiomaSwing frame = new TelaIdiomaSwing();
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
	public TelaIdiomaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaIdiomaSwing.class.getResource("/imagens/idiomasEditado.png")));
		lblNewLabel.setBounds(0, 0, 219, 157);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idioma do Sistema");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(229, 11, 195, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIdioma = new JLabel("Clique no Botão para ver o idioma...");
		lblIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdioma.setBounds(229, 45, 195, 14);
		contentPane.add(lblIdioma);
		
		JButton btnIdioma = new JButton("Click Aqui");
		btnIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale idioma = Locale.getDefault();
				lblIdioma.setText(idioma.getDisplayLanguage());
			}
		});
		btnIdioma.setBounds(229, 155, 195, 23);
		contentPane.add(btnIdioma);
	}

}
