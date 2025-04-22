package atividades_06;

import java.util.ArrayList;
import java.util.Scanner;


public class Atividade_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// ArrayList de Strings para armazenar as cores
		ArrayList<String> cores = new ArrayList<String>();
		
		int contador = 0;
		
		// Loop para entrada das 5 cores
		while (contador < 5) {
			System.out.println("Escreva uma cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
			contador ++;
		}
		
		 // Exibe a lista de cores na ordem em que foram digitadas
		System.out.println("\nLista das cores:");
		System.out.println(cores);
		
		// Ordena a lista em ordem alfabética
		cores.sort(null);
		
		// Exibe as cores já ordenadas
		System.out.println("\nCores ordenadas por ordem alfabética:");
		cores.forEach(System.out::println);
		
		leia.close();
	}

}