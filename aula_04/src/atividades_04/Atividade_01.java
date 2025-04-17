package atividades_04;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Entrada dos intervalos
		System.out.print("Digite o primeiro numero do intervalo:");
		int n1 = leia.nextInt();
		
		System.out.print("Digite o segundo numero intervalo:");
		int n2 = leia.nextInt();
		
		//Validação do intervalo
		if (n1 >= n2) {
			System.out.println("Intervalo invalido!");
		} else {
			System.out.println("No intervalo " + n1 + " e " + n2 + ":");
			
			for(int i = n1; i <= n2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		
		leia.close();
	}

}
