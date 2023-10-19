package contagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeContagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeContagem frame = new TelaDeContagem();
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
	public TelaDeContagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contagem: ");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 59, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContando = new JLabel("");
		lblContando.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblContando.setBounds(104, 60, 320, 14);
		contentPane.add(lblContando);
		
		JButton btnNewButton = new JButton("Contar até 6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int cc = 1;
				String contagem = "";
				
				while (cc<=10) {
					
					if(cc == 5) {
						cc++;
						continue;
					}
					
					if(cc==8) {
						break;
					}
					
					contagem += cc + " ";
					cc++;
					
				}
				
				lblContando.setText(contagem);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		btnNewButton.setBounds(156, 137, 117, 23);
		contentPane.add(btnNewButton);
	}

}
