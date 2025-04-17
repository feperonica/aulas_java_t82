package atividades_04;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 	
		 	//Variaveis
	        int numero, positivo = 0, negativo = 0;
	        
	        //Entrada dos dados
	        do {
	            System.out.print("Digite um número: ");
	            numero = leia.nextInt();
	            
	        //Soma Negativos e Positivos
	            if (numero > 0) {
	               positivo += numero;
	            }else {
	            	negativo += numero;
	            }
	        //Validação 
	        } while (numero != 0);
	        
	        //Resultados
	        System.out.println("\nA soma dos números positivos é: " + positivo);
	        System.out.println("\nA soma dos números negativos é: " + negativo);

	        leia.close();

	}

}
