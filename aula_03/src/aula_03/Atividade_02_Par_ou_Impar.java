package aula_03;

import java.util.Scanner;

public class Atividade_02_Par_ou_Impar {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	     // Entrada
	     System.out.print("Digite um número: ");
	     int numero = leia.nextInt();

	     // Verificação de paridade
	     boolean par = (numero % 2 == 0);
	     boolean positivo = (numero >= 0);

	     // Saída formatada
	     System.out.print("O Número " + numero + " é ");

	     if (par && positivo) {
	         System.out.println("par e positivo!");
	     } else if (par && !positivo) {
	         System.out.println("par e negativo!");
	     } else if (!par && positivo) {
	         System.out.println("ímpar e positivo!");
	     } else {
	         System.out.println("ímpar e negativo!");
	     }

	     leia.close();
	}

}
