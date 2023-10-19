package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class TelaTriangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTriangulo frame = new TelaTriangulo();
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
	public TelaTriangulo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaTriangulo.class.getResource("/imagens/sinaismath.png")));
		setTitle("Calculo do Triangulo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); // para centralizar a janela no centro da tela quando abrir.

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaTriangulo.class.getResource("/imagens/triangulo.png")));
		lblNewLabel.setBounds(367, 77, 108, 113);
		contentPane.add(lblNewLabel);
		
		JPanel panResul = new JPanel();
		panResul.setBounds(10, 226, 465, 90);
		contentPane.add(panResul);
		panResul.setLayout(null);
		panResul.setVisible(false);
		
		
		JLabel lblFormaTriangulo = new JLabel("New label");
		lblFormaTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormaTriangulo.setBounds(10, 11, 445, 25);
		panResul.add(lblFormaTriangulo);
		
		JLabel lblTipoTriangulo = new JLabel("New label");
		lblTipoTriangulo.setForeground(new Color(0, 128, 0));
		lblTipoTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoTriangulo.setBounds(10, 47, 445, 32);
		panResul.add(lblTipoTriangulo);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 77, 347, 113);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSlidA = new JLabel("0");
		lblSlidA.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblSlidA.setBounds(293, 11, 46, 21);
		panel.add(lblSlidA);
		
		JLabel lblSlidB = new JLabel("0");
		lblSlidB.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblSlidB.setBounds(293, 48, 46, 26);
		panel.add(lblSlidB);
		
		JLabel lblSlidC = new JLabel("0");
		lblSlidC.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblSlidC.setBounds(293, 85, 46, 26);
		panel.add(lblSlidC);
		
		JSlider slidA = new JSlider();
		slidA.setMaximum(50);
		slidA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblSlidA.setText(Integer.toString(slidA.getValue()));
			}
		});
		slidA.setValue(0);
		slidA.setBounds(83, 11, 200, 26);
		panel.add(slidA);
		
		JSlider slidB = new JSlider();
		slidB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblSlidB.setText(Integer.toString(slidB.getValue()));
			}
		});
		slidB.setMaximum(50);
		slidB.setValue(0);
		slidB.setBounds(83, 48, 200, 26);
		panel.add(slidB);
		
		JSlider slidC = new JSlider();
		slidC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblSlidC.setText(Integer.toString(slidC.getValue()));
			}
		});
		slidC.setMaximum(50);
		slidC.setValue(0);
		slidC.setBounds(83, 85, 200, 26);
		panel.add(slidC);
		
		JLabel lblNewLabel_3 = new JLabel("Seg. A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 11, 63, 26);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Seg. B");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 48, 63, 26);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Seg. C");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 85, 63, 26);
		panel.add(lblNewLabel_5);
		
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setIcon(new ImageIcon(TelaTriangulo.class.getResource("/imagens/sinaismath.png")));
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panResul.setVisible(true);
				
				int a = slidA.getValue();
				int b = slidB.getValue();
				int c = slidC.getValue();
				
				if(a<b+c && b<a+c && c<a+b) {
					lblFormaTriangulo.setText("Forma Um Triangulo!");
					
					if(a==b && b==c) {
						lblTipoTriangulo.setText("Equilátero");
					} else if(a!=b && b!=c && c!=a) {
						lblTipoTriangulo.setText("Escaleno");
					} else {
						lblTipoTriangulo.setText("Isósceles");
					}
				} else {
					lblFormaTriangulo.setText("Não forma Um Triangulo!");
					lblTipoTriangulo.setText("------");
				}
			}
		});
		btnVerificar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		btnVerificar.setBounds(183, 191, 126, 33);
		contentPane.add(btnVerificar);
		
		JLabel lblNewLabel_1 = new JLabel("Calculo Triangulo e seu Tipo");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 11, 465, 55);
		contentPane.add(lblNewLabel_1);
	}
}
