package atividades_04;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        int numero, positivo = 0, negativo = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = leia.nextInt();

	            if (numero > 0) {
	               positivo += numero;
	            }else {
	            	negativo += numero;
	            }

	        } while (numero != 0);

	        System.out.println("\nA soma dos números positivos é: " + positivo);
	        System.out.println("\nA soma dos números negativos é: " + negativo);

	        leia.close();

	}

}
