package testevetor;

public class TesteVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = {3,2,8,7,5,4}; //cria um objeto/ todo vetor em java é um objeto.
		
		for(int c=0; c<=n.length - 1;c++) { //o ".length" diz quantas posições tem um vetor (nesse caso 6). O "-1" é pq a posição inicial do vetor é '0' logo iria contar um a mais...
			System.out.println("Na posição " + c + " temos o valor " + n[c]); 
		}

	}

}
