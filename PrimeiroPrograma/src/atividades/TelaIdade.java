package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class TelaIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		Calendar sistema = Calendar.getInstance();
		int anosystem = sistema.get(Calendar.YEAR); //pegando só o ano
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nacimento:");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 46, 134, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAno = new JSpinner();
		txtAno.setModel(new SpinnerNumberModel(2023, 1923, 2023, 1));
		txtAno.setBounds(154, 44, 65, 20);
		contentPane.add(txtAno);
		
		JLabel lblResul = new JLabel("0");
		lblResul.setForeground(new Color(255, 0, 0));
		lblResul.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		lblResul.setBounds(51, 196, 46, 14);
		contentPane.add(lblResul);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				int ano = Integer.parseInt(txtAno.getValue().toString()); 
				/*
				 * acima para pegar o valor do txtAno (que é um 'objeto') tem que pegar com o 'getValue'
				 *  e depois transformar de Objeto para String (com o 'toString' e passar de String para Int
				 * com o 'Integer.parseInt()'
				 */
				
				
				
				lblResul.setText(Integer.toString(anosystem - ano));
				/*
				 * fiz o ano do sistema menos o ano digitado, e peguei essa conta e convertir ela para String 
				 * para poder settar o resultado na label lblresul.
				 */
			}
		});
		btnCalcular.setHorizontalAlignment(SwingConstants.LEFT);
		btnCalcular.setIcon(new ImageIcon(TelaIdade.class.getResource("/imagens/sinaismath.png")));
		btnCalcular.setBounds(62, 126, 110, 33);
		contentPane.add(btnCalcular);
		
		JLabel imagemUsuario = new JLabel("");
		imagemUsuario.setIcon(new ImageIcon(TelaIdade.class.getResource("/imagens/usuarioimg.png")));
		imagemUsuario.setBounds(267, 11, 157, 150);
		contentPane.add(imagemUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 195, 37, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ano Atual: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 11, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblAnoAtual = new JLabel(Integer.toString(anosystem));
		lblAnoAtual.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		lblAnoAtual.setBounds(85, 11, 46, 14);
		contentPane.add(lblAnoAtual);
		
		
	}
}
