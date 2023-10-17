package votacaobr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class TelaVotacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAnoNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVotacao frame = new TelaVotacao();
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
	public TelaVotacao() {
		
		Calendar calendar = Calendar.getInstance();
		int anoSystem = calendar.get(Calendar.YEAR);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(107, 129, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 11, 251, 372);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Pode Votar? 🤔</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 11, 251, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ano de Nasc.: ");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 127, 114, 14);
		panel.add(lblNewLabel_1);
		
		txtAnoNasc = new JTextField();
		txtAnoNasc.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnoNasc.setText(Integer.toString(anoSystem));
		txtAnoNasc.setBounds(134, 126, 76, 20);
		panel.add(txtAnoNasc);
		txtAnoNasc.setColumns(10);
		
		JPanel panResultado = new JPanel();
		panResultado.setBounds(10, 263, 231, 98);
		panel.add(panResultado);
		panResultado.setLayout(null);
		panResultado.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Situação:");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 0, 211, 25);
		panResultado.add(lblNewLabel_2);
		
		JLabel lblResultado = new JLabel("New label");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 21, 211, 66);
		panResultado.add(lblResultado);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panResultado.setVisible(true);
				
				int nasc = Integer.parseInt(txtAnoNasc.getText());
				
				int resultado = anoSystem - nasc;
				
				if (resultado < 16) {
					lblResultado.setText("<html>Sua idade é: " + resultado + " Anos. <br> Então você não pode votar!</html>");
				} else if((resultado >= 16 && resultado<18)||(resultado>70)) {
					lblResultado.setText("<html>Sua idade é: " + resultado + " Anos. <br> Então seu voto é opcional!</html>");
				} else {
					lblResultado.setText("<html>Sua idade é: " + resultado + " Anos. <br> Então seu voto é Obrigatório!</html>");
				}
				
				
			}
		});
		btnVerificar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		btnVerificar.setBounds(78, 195, 89, 32);
		panel.add(btnVerificar);
	}
}
