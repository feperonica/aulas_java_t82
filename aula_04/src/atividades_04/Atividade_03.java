package atividades_04;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		int contador = 0, idade;
		int	menor = 0 , maior = 0, entre = 0;
		
		//Entrada de dados
		while(contador <= 10) {
			System.out.printf("Digite uma idade: ");
			idade = leia.nextInt();
			
			//Validador de idade positiva
			if (idade < 0) {
				System.out.println("Erro idade negativa detectada");
                break;				
			}
			
			//Contagem de idade
			if (idade <= 21) {
				menor++;
			}else if (idade >= 50) {
				maior++;
			}else {
				entre++;
			}
			contador ++;
		}
		
		//Resultados
				System.out.println("\nTotal de pessoas menores de 21 anos: " + menor);
				System.out.println("Total de pessoas maiores de 50 anos: " + maior);
				System.out.println("Total de pessoas com idade entra 22 a 49 anos: " + entre);
		
		leia.close();
	}

}
