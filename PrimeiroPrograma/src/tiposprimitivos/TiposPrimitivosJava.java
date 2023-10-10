package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivosJava {

	public static void main(String[] args) {
		
		float nota = 8.5f;
		System.out.println("Sua nota é: " + nota);
		System.out.printf("Sua nota é: %.2f", nota); // o "%.2f" vai ser substituido pelo valor em nota e o "\n" é para quebrar linha
		
		String nome = "Marcio";
		System.out.printf("A Nota de %s nota é: %.2f \n", nome, nota); //substituindo mais de uma ...
		
		System.out.format("A Nota de %s nota é: %.1f \n", nome, nota); //usando 'format' no lugar de 'Println'...
		System.out.println("----------------------------------------------------------");
		
		
		//recebendo valores pelo teclado agora...
		
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome2 = tecla.nextLine();
		System.out.println("Digite a nota: ");
		float nota2 = tecla.nextFloat();
		System.out.printf("A Nota de %s nota é: %.1f \n", nome2, nota2);
	}

}
