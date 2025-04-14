package aula_002;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.printf("Nota 2: ");
		float nota2 = leia.nextFloat();
		
		System.out.printf("Nota 3: ");
		float nota3 = leia.nextFloat();
		
		System.out.printf("Nota 4: ");
		float nota4 = leia.nextFloat();
		
		float mediafinal = (nota1 + nota2 + nota3 + nota4)/4 ;
		
		System.out.printf("Médina final: %.1f", mediafinal);

	}

}
