package atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TelaVetor extends JFrame {
	
	int vetor[] = new int[10];
	DefaultListModel lista = new DefaultListModel();
	int select = 0;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVetor frame = new TelaVetor();
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
	public TelaVetor() {

		for(int c = 0; c < vetor.length; c++) {
			lista.addElement(vetor[c]);
		}
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaVetor.class.getResource("/imagens/usuarioimg.png")));
		setTitle("Tela Posição Vetor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 281);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spnNum = new JSpinner();
		spnNum.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		spnNum.setBounds(10, 37, 69, 22);
		contentPane.add(spnNum);
		
		JLabel lblSelect = new JLabel("[0]");
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblSelect.setBounds(262, 44, 46, 14);
		contentPane.add(lblSelect);
		
		JLabel lblNewLabel_1 = new JLabel("Vetor");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(214, 45, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = list.getMinSelectionIndex();
				lblSelect.setText("[" + select + "]");
			}
		});
		list.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		list.setBounds(214, 70, 105, 161);
		contentPane.add(list);
		list.setModel(lista); // Para ligar o objeto lista ao Jlist.
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(214, 70, 105, 161);
		contentPane.add(scrollPane);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lista.removeAllElements();
				vetor[select] = Integer.parseInt(spnNum.getValue().toString());
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnAdd.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnAdd.setBounds(89, 36, 115, 23);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[select] = 0;
				lista.removeAllElements();
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnRemove.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnRemove.setBounds(89, 70, 115, 23);
		contentPane.add(btnRemove);
		
		JButton btnOrdem = new JButton("Ordenar");
		btnOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Arrays.sort(vetor); // para ordenar os numeros em ordem crescente dentro do vetor
				lista.removeAllElements(); // para limpar o a lista para depois mostrar ela novamente com os valores atualizados.
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnOrdem.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		btnOrdem.setBounds(89, 104, 115, 23);
		contentPane.add(btnOrdem);
		
		
	}
}
