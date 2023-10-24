package testevetor;

import java.util.Arrays;

public class TesteVetor3preenchimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[5];
		
		Arrays.fill(num, 0); //para preencher automatico todas as posições com o valor 0.
		
		for(int valor: num) {
			System.out.println(valor);
		}

	}

}
