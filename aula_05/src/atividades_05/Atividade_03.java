package atividades_05;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Matriz
		Float matrizReal[][] = new Float[3][3];
		//Variaveis
		double somaPrincipal = 0, somaSecundaria = 0;
		
		//Armazenamento da Matriz
		for(int linha = 0; linha < matrizReal.length; linha++) {
			for(int coluna = 0; coluna < matrizReal.length; coluna ++) {
				System.out.printf("Digite os numeros da matriz: ");
				matrizReal[linha][coluna] = leia.nextFloat();	
			}
		}
		//Apresentando Diagonal Principal
		System.out.print("Elementos da Diagonal Principal: ");
		for (int linha = 0; linha < matrizReal.length; linha++) {
		    for (int coluna = 0; coluna < matrizReal.length; coluna++) {
		        if (linha == coluna) { //Verificando Diagonal Principal
		            System.out.print(matrizReal[linha][coluna] + " ");
		        somaPrincipal += matrizReal[linha][coluna];
		        }
		    }
		}
		//Apresentando Diagonal Secundaria
		System.out.print("\nElementos da Diagonal Secundária: ");
		for (int linha = 0; linha < matrizReal.length; linha++) {
		    for (int coluna = 0; coluna < matrizReal.length; coluna++) {
		        if (coluna == matrizReal.length - 1 - linha) { //Verificando Diagonal Principal
		            System.out.print(matrizReal[linha][coluna] + " ");
		            somaSecundaria += matrizReal[linha][coluna];
		        }
		    }
		}
		//Apresentando a soma da Diagonal Principal e Secundaria
		System.out.print("\nSoma dos Elementos da Diagonal Secundaria: " + somaPrincipal);
		System.out.print("\nSoma dos Elementos da Diagonal Secundaria: " + somaSecundaria);
		leia.close();
	}

}
