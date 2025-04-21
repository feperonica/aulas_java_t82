package atividades_05;

import java.util.Scanner;

public class Atividade_01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; // índice de 0 a 9
		int numero = 0;
		boolean encontrato = false;
		
	
		//Entrada de dados
		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		 // Percorre o vetor para verificar se o número está presente
		for (int pesquisa = 0; pesquisa < vetor.length; pesquisa++) {
			if(vetor[pesquisa] == numero) {
			System.out.printf("\nO número "+ numero + " está localizado na posição: "+ pesquisa + "ª");
			encontrato = true;
			break;
					
			}
			
		}
		// Se percorreu tudo e não encontrar
		if (!encontrato){
				System.out.println("O número não foi encontrado!");	
		}
		
			leia.close();
	}
}


