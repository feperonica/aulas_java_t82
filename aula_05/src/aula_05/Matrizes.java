package aula_05;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		int matrizInrregular[][] = {{10, 15}, {70, 120}, {50, 100}};
		
		Float matrizReal[][] = new Float[3][3];
		
		/*for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna ++) {
				System.out.printf("\n matrizInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		for(int linha = 0; linha < matrizReal.length; linha++) {
			for(int coluna = 0; coluna < matrizReal.length; coluna ++) {
				System.out.println("\nDigite um número Real: ");
				matrizReal[linha][coluna] = leia.nextFloat();	
			}
		}
		
		for(Float[] vetor : matrizReal) {
			for(var valor : matrizReal) {
				System.out.println("Exibir a posição atual" + valor);
			}
			
		}*/
		

		for(int linha = 0; linha < matrizInrregular.length; linha++) {
			for(int coluna = 0; coluna < matrizInrregular[linha].length; coluna ++) {
				System.out.printf("\n matrizInteiros[%d][%d] = %d", linha, coluna, matrizInrregular[linha][coluna]);
			}
		}
		
	}

}
