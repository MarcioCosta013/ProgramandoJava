package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class TelaSuperCalcMath extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSuperCalcMath frame = new TelaSuperCalcMath();
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
	public TelaSuperCalcMath() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Super Calculadora do Marcio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 447, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe um valor: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(37, 68, 121, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spnValor = new JSpinner();
		spnValor.setModel(new SpinnerNumberModel(Integer.valueOf(1), null, null, Integer.valueOf(1)));
		spnValor.setBounds(168, 67, 63, 20);
		contentPane.add(spnValor);
		
		JPanel panCalc = new JPanel();
		panCalc.setBounds(10, 120, 256, 191);
		contentPane.add(panCalc);
		panCalc.setLayout(null);
		panCalc.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Resto da Divisão por 2: ");
		lblNewLabel_2.setBounds(10, 11, 129, 15);
		panCalc.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblRestoDiv = new JLabel("0");
		lblRestoDiv.setBounds(200, 11, 46, 14);
		panCalc.add(lblRestoDiv);
		lblRestoDiv.setForeground(new Color(255, 0, 0));
		lblRestoDiv.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestoDiv.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("Elevado ao Cubo: ");
		lblNewLabel_4.setBounds(10, 37, 121, 14);
		panCalc.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_6 = new JLabel("Raiz Quadrada: ");
		lblNewLabel_6.setBounds(10, 62, 121, 14);
		panCalc.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_8 = new JLabel("Raiz Cúbiba: ");
		lblNewLabel_8.setBounds(10, 87, 121, 14);
		panCalc.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_10 = new JLabel("Valor Absoluto: ");
		lblNewLabel_10.setBounds(10, 112, 121, 14);
		panCalc.add(lblNewLabel_10);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblAoCubo = new JLabel("0");
		lblAoCubo.setBounds(200, 36, 46, 14);
		panCalc.add(lblAoCubo);
		lblAoCubo.setForeground(new Color(255, 0, 0));
		lblAoCubo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblAoCubo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRaizQuadra = new JLabel("0");
		lblRaizQuadra.setBounds(200, 61, 46, 14);
		panCalc.add(lblRaizQuadra);
		lblRaizQuadra.setForeground(new Color(255, 0, 0));
		lblRaizQuadra.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblRaizQuadra.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRaizCubi = new JLabel("0");
		lblRaizCubi.setBounds(200, 86, 46, 14);
		panCalc.add(lblRaizCubi);
		lblRaizCubi.setForeground(new Color(255, 0, 0));
		lblRaizCubi.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblRaizCubi.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblValorAbso = new JLabel("0");
		lblValorAbso.setBounds(200, 111, 46, 14);
		panCalc.add(lblValorAbso);
		lblValorAbso.setForeground(new Color(255, 0, 0));
		lblValorAbso.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblValorAbso.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor = Integer.parseInt(spnValor.getValue().toString());
				
				int restoDiv = valor % 2;
				int aoCubo = (int) Math.pow(valor, 3);
				float raizQuadra = (float) Math.sqrt(valor);
				float raizCubi = (float) Math.cbrt(valor);
				int valorAbso = (int) Math.abs(valor);
				
				lblRestoDiv.setText(Integer.toString(restoDiv));
				lblAoCubo.setText(Integer.toString(aoCubo));
				lblRaizQuadra.setText(Float.toString(raizQuadra));
				lblRaizCubi.setText(String.format("%.2f", raizCubi)); //'String.format()' para bota para aparecer só com duas casas decimais.
				lblValorAbso.setText(Integer.toString(valorAbso));
				
				panCalc.setVisible(true);
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(TelaSuperCalcMath.class.getResource("/imagens/sinaismath.png")));
		btnCalcular.setBounds(287, 164, 144, 41);
		contentPane.add(btnCalcular);
		
	}
}
