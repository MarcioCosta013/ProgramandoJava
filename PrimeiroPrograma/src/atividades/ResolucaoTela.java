package atividades;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

	public static void main(String[] args) {
		// codigo para pegar a resolução da tela
		Toolkit ferramentas = Toolkit.getDefaultToolkit();
		Dimension resolucao = ferramentas.getScreenSize();
		System.out.println(resolucao.width + "X" + resolucao.height);

	}

}
