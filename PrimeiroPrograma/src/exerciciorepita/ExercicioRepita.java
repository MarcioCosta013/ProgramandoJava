package exerciciorepita;

import javax.swing.JOptionPane; //Tem que importar essa classe para ter telas automaticamente...

public class ExercicioRepita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE); (para mstrar menssagens...
		int digi = 0, numPar = 0, numImpar = 0, maiorQue =0;
		double valor, resul = 0;
		double media;
		String mediaf;
		
		do {
			
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero a ser somado: (digite zero para terminar)"));//( para pegar valores digitados)
			
			if (valor != 0) {
				digi++;
			}
				
			
			if ((valor % 2) == 0) { //Para verificar sew é impar ou par.
				if (valor != 0) {
					numPar++;
				}
				
			} else {
				numImpar++;
				
			}
			
			if (valor > 100) { //para contar os numeros maiores que 100.
				maiorQue++;
			}
			
			resul += valor; //Para somar os novos valores digitados.
			
			media = (double) (resul/digi);
			
		} while ( valor != 0);
		
		JOptionPane.showMessageDialog(null, "<html>Total de numeros digitados: " + digi + "<br>Resultado final da soma é: " + resul + "<br>Total de Numeros par: " + numPar + "<br>Total de Numeros Impares: "
										+ numImpar + "<br>Acima de 100: " + maiorQue + "<br>Media dos valores digitados:" + String.format("%.2f", media) /* para formatar com 
										duas casas decimais*/+ "</html>");
		
		

	}

}
