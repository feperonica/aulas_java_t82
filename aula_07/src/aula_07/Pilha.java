package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Cria a Estrutura de dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		// Adiciona Elementos na Pilha
		pilha.add("Comunicação não Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diario de um Banana");
		pilha.add("Senhor dos Aneis");
		pilha.add("O Codigo da Vini");
		
		//Adicionando elemento via tela na Pilha
		System.out.println("Digite o Titulo de um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		// Retira um elemento da Pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		// Adiciona um Elemento na Pilha
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		// Exibe o elemento que esta no topo da pilha
		System.out.println(pilha.peek());
		
		// Verifica se um elemento existe na pilha
		System.out.println("Diario de um Banana, existe na Pilha: " + pilha.contains("Diario de um Banana"));
		
	}

}
