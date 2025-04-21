package atividades_05;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		double vetorDouble[] = new double [10]; // Indice 0 a 9
		float soma = 0, media = 0;
		
		//Preenchendo o Vetor
		for (int indice = 0; indice < vetorDouble.length; indice++) {
			System.out.printf("Digite um número Real: ");
			vetorDouble[indice] = leia.nextDouble();
		}
		//Verificando Impares
		System.out.printf("Elementos nos índices ímpares: ");
		for (int indice = 0; indice < vetorDouble.length; indice++) {
			if(vetorDouble[indice] % 2 != 0) {
			 System.out.print(vetorDouble[indice] + " ");
			}
		}
		//Verificando Pares
		System.out.printf("\nElementos pares: ");
		for (int indice = 0; indice < vetorDouble.length; indice++) {
			if(vetorDouble[indice] % 2 == 0) {
			 System.out.print(vetorDouble[indice] + " ");
			}
		}
		//Soma Vetor
		for (var valor : vetorDouble) {
			soma += valor;
		}
		//Media Vetor
		media = soma / vetorDouble.length;
		
		//Resultados
		System.out.printf("\nSoma: " + soma);
		System.out.printf("\nMédia: %.2f", media);
		
		leia.close();
	}

}
