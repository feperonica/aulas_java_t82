package atividades_05;
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Matriz
		Float matrizNotas[][] = new Float[10][4]; // indice 10 a 4
		float medias[] = new float[10]; // 10 alunos
		//Variavel
	    
		
	    //Digitando a nota dos alunos
		for (int linha = 0; linha < matrizNotas.length; linha++) {
		    for (int coluna = 0; coluna < matrizNotas[linha].length; coluna++) {
		        System.out.printf("Digite a nota do aluno %d no bimestre %d: ", linha + 1, coluna + 1);
		        matrizNotas[linha][coluna] = leia.nextFloat();
		    }
		}
		//Soma das notas de cada aluno
		for (int linha = 0; linha < matrizNotas.length; linha++) {
			float soma = 0;
		    for (int coluna = 0; coluna < matrizNotas[linha].length; coluna++) {
		        soma += matrizNotas[linha][coluna];
		    }
		    medias[linha] = soma / 4;
		}
		//Média
		System.out.println("\nMédias dos alunos:");
		for (int notas = 0; notas < medias.length; notas++) {
		    System.out.printf("%.1f ", medias[notas]);
		}
		leia.close();
	}

}
