package aula_07;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diario de um Banana");
		pilha.add("Senhor dos Aneis");
		pilha.add("O Codigo da Vini");
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		
		System.out.println("Diario de um Banana, existe na Pilha: " + pilha.contains("Diario de um Banana"));
		
	}

}
