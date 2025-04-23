package aula_002;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite o salario: ");
		float salario = leia.nextFloat();
		
		System.out.printf("\nDigite o abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("\nNovo Salario: %.2f", novoSalario);
		
	}

}
