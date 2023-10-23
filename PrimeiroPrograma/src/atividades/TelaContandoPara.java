package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
//import javax.swing.JScrollBar;

public class TelaContandoPara extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContandoPara frame = new TelaContandoPara();
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
	public TelaContandoPara() {
		setTitle("Contador do Marcio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaContandoPara.class.getResource("/imagens/usuarioimg.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInicio = new JLabel("1");
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblInicio.setBounds(354, 59, 46, 26);
		contentPane.add(lblInicio);
		
		JLabel lblFinal = new JLabel("6");
		lblFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinal.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblFinal.setBounds(354, 96, 46, 26);
		contentPane.add(lblFinal);
		
		JLabel lblPassos = new JLabel("1");
		lblPassos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassos.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblPassos.setBounds(354, 134, 46, 26);
		contentPane.add(lblPassos);
		
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 59, 46, 26);
		contentPane.add(lblNewLabel);
		
		JSlider slidInicio = new JSlider();
		slidInicio.setValue(1);
		slidInicio.setMinorTickSpacing(1);
		slidInicio.setMaximum(5);
		slidInicio.setMinimum(1);
		slidInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblInicio.setText(Integer.toString(slidInicio.getValue()));
			}
		});
		slidInicio.setBounds(66, 59, 286, 26);
		contentPane.add(slidInicio);
		
		JLabel lblFim = new JLabel("Fim");
		lblFim.setHorizontalAlignment(SwingConstants.CENTER);
		lblFim.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblFim.setBounds(10, 97, 46, 26);
		contentPane.add(lblFim);
		
		JSlider slidFim = new JSlider();
		slidFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblFinal.setText(Integer.toString(slidFim.getValue()));
			}
		});
		slidFim.setMaximum(20);
		slidFim.setMinimum(6);
		slidFim.setValue(1);
		slidFim.setBounds(66, 97, 286, 26);
		contentPane.add(slidFim);
		
		JLabel lblPasso = new JLabel("Passo");
		lblPasso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasso.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblPasso.setBounds(10, 134, 46, 26);
		contentPane.add(lblPasso);
		
		JSlider slidPasso = new JSlider();
		slidPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblPassos.setText(Integer.toString(slidPasso.getValue()));
			}
		});
		slidPasso.setMaximum(5);
		slidPasso.setMinimum(1);
		slidPasso.setValue(1);
		slidPasso.setBounds(66, 134, 286, 26);
		contentPane.add(slidPasso);
		
		JLabel lblNewLabel_1 = new JLabel("Contador do Marcio");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 11, 390, 37);
		contentPane.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setVisibleRowCount(1);
		list.setEnabled(false);
		list.setValueIsAdjusting(true);
		//list.setBounds(423, 65, 85, 167); comentei essa linha mas poderia deixar ela ativa. copiei essas medidas e coloquei no ScrollPane abaixo.
		contentPane.add(list);
		
		JScrollPane ScrollPane = new JScrollPane(list); //Criei a barrade rolagem aqui.
		ScrollPane.setBounds(423, 65, 85, 167); //peguei essas medidas do list que criei e coloquei onde queria...
		getContentPane().add(ScrollPane);
		ScrollPane.setVisible(false); //Ocutei para mostra só quando clicar no btnContar.
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ScrollPane.setVisible(true); // Para mostrar a barra de rolagem...
				
				int inicio = slidInicio.getValue();
				int fim = slidFim.getValue();
				int passos = slidPasso.getValue();
				
				DefaultListModel lista = new DefaultListModel();
				
				for (int i = inicio; i <= fim; i += passos) {
					
					lista.addElement(i);
					
				}
				
				list.setModel(lista);
			}
		});
		btnContar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		btnContar.setIcon(new ImageIcon(TelaContandoPara.class.getResource("/imagens/sinaismath.png")));
		btnContar.setBounds(156, 216, 128, 37);
		contentPane.add(btnContar);
		
		
		
		
		
	}
}
