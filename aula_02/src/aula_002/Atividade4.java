package aula_002;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Numero 1: ");
		float n1 = leia.nextFloat();
		
		System.out.printf("Numero 2: ");
		float n2 = leia.nextFloat();
		
		System.out.printf("Numero 3: ");
		float n3 = leia.nextFloat();
		
		System.out.printf("Numero 4: ");
		float n4 = leia.nextFloat();
		
		float diferenca = (n1 * n2 ) - (n3 * n4);
		
		System.out.printf("Diferança: %.1f", diferenca);

	}

}
