package atividades_04;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		int numero, pares = 0, impares = 0;
		
		//Repeticao para ler 10 números
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o "+ i +"º numero: ");
			numero = leia.nextInt();
		//Validação	
			if (numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		//Resultados
		System.out.println("\nTotal de numeros pares: " + pares);
		System.out.println("\nTotal de numeros pares: " + impares);
	}

}
