package aula_03;

import java.util.Scanner;

public class Atividade_01_CompararSoma {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        // Entrada dos dados
	        System.out.print("Digite o número A: ");
	        int a = leia.nextInt();

	        System.out.print("Digite o número B: ");
	        int b = leia.nextInt();

	        System.out.print("Digite o número C: ");
	        int c = leia.nextInt();

	        // Soma de A + B
	        int soma = a + b;

	        // Exibe a comparação
	        System.out.printf("%d + %d = %d", a, b, soma);

	        // Verificação com IF
	        if (soma > c) {
	            System.out.printf(" > %d\n", c);
	            System.out.println("A Soma de A + B é Maior do que C");
	        } else if (soma < c) {
	            System.out.printf(" < %d\n", c);
	            System.out.println("A Soma de A + B é Menor do que C");
	        } else {
	            System.out.printf(" = %d\n", c);
	            System.out.println("A Soma de A + B é Igual a C");
	        }

	        leia.close();

	}

}
