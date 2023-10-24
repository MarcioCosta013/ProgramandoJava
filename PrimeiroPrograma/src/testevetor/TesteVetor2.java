package testevetor;

import java.util.Arrays;

public class TesteVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = {3, 5, 1, 8, 4};
		Arrays.sort(n); //Para organizizar os numeros dentro do vetor em ordem crescente.
		for(int valor: n) {
			System.out.print(valor + " ");
		}
		
		//Busca Binária
		
		int pos = Arrays.binarySearch(n, 1); //"(n, 1)" n é o vetor e "1" é o valor que eu to pesquisando...
		System.out.println(pos); //retorna a posição em que o numero pesquisado está no vetor...

	}

}
