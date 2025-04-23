package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// Cria a Estrutura de Dados Fila
		Queue<String> fila = new LinkedList<>();
		
		// Adicionamos Elementos na fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		// Exibimos a fila na tela
		System.out.println(fila);
		
		// Retiramos um elemento da fila
		fila.remove();
		
		// Exibimos a fila na tela
		System.out.println(fila);
		
		// Adicionamos Elementos na fila
		fila.add("Thiago");
		
		// Exibimos a fila na tela
		System.out.println(fila);
		
		// Exibimos o primeiro elemento da fila
		System.out.println(fila.peek());

		// Exibimos e Removemos o primeiro elemento da fila
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		//Procurando elementos na fila
		System.out.println("A Maria esta na fila? " + fila.contains("Maria"));
		System.out.println("O Carlos esta na fila? " + fila.contains("Carlos"));
		
		//Verificando o tamanho da fila
		System.out.println("O Carlos esta na fila? " + fila.size());
		
		int contador = 0;
		
		for(var pessoa : fila) {
			contador ++;
			if(pessoa.equalsIgnoreCase("Maria")) {
				System.out.printf("\nA Maria esta em %dº lugar na fila. " + contador);
			}
		}

	}

}
