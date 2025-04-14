package aula_002;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Salario Bruto: ");
		float salariobruto = leia.nextFloat();
		
		System.out.printf("Adicional Noturno: ");
		float adicionalnoturo = leia.nextFloat();
		
		System.out.printf("Horas Extras: ");
		float horasextras = leia.nextFloat();
		
		System.out.printf("Descontos: ");
		float desconto = leia.nextFloat();
		
		float salarioliquido = salariobruto + adicionalnoturo + (horasextras * 5) - desconto;
		
		System.out.printf("Salario Liquido: %.2f", salarioliquido);

	}

}
