package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaFatorial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial frame = new TelaFatorial();
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
	public TelaFatorial() {
		setResizable(false);
		setTitle("Calculando Fatorial");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFatorial.class.getResource("/imagens/sinaismath.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); // para centralizar a janela ao executar o codigo.

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panDesc = new JPanel();
		panDesc.setBounds(10, 121, 225, 129);
		contentPane.add(panDesc);
		panDesc.setLayout(null);
		panDesc.setVisible(false);
		
		JLabel lblDesc = new JLabel("0! = 1");
		lblDesc.setForeground(new Color(0, 128, 64));
		lblDesc.setBounds(10, 5, 205, 124);
		panDesc.add(lblDesc);
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblResul = new JLabel("1");
		lblResul.setForeground(new Color(0, 0, 255));
		lblResul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResul.setBounds(81, 66, 154, 14);
		contentPane.add(lblResul);
		
		JSpinner spnFatorial = new JSpinner();
		spnFatorial.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				panDesc.setVisible(true);
				int fat = Integer.parseInt(spnFatorial.getValue().toString());
				int resul = 1;
				int cont = fat;
				String desc = "";
				while (cont >= 1) {
					
					resul *= cont;
					
					if (cont == 1) { //Para tira o 'x' do primeiro numero que é 1
						desc = desc + cont;
					} else {
						desc = desc + cont + "X";
					}
					
					cont--; //pega o valor inicial e vai diminuindo assim como é o fatorial...
				}
				
				lblResul.setText(Integer.toString(resul));
				lblDesc.setText("<html>" +fat+ "! = " + desc + "</html>");
			}
			
		});
		spnFatorial.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		spnFatorial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spnFatorial.setBounds(10, 63, 36, 20);
		contentPane.add(spnFatorial);
		
		JLabel lblNewLabel = new JLabel("! =");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(46, 66, 30, 14);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_2 = new JLabel("Calculando Fatorial");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 11, 228, 28);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
