package atividades_07;

import java.util.Scanner;
import java.util.Stack;

public class Atividade_02_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Cria a Estrutura de Dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		// Variável para armazenar a opção escolhida
		int opcao = 0;
		
		do{
		System.out.println("\n***********************************************************");
		System.out.println("");
		System.out.println("		1 - Adicionar Livro na Pilha			");
		System.out.println("		2 - Listar todos os Livros				");
		System.out.println("		3 - Retirar Livro da Pilha				");
		System.out.println("		0 - Sair								");
		System.out.println("");
		System.out.println("***********************************************************");
		System.out.printf("Digite a opção desejada: ");
		opcao = leia.nextInt(); // Lê a opção escolhida
		leia.nextLine(); // Limpa o buffer
		
		if(opcao == 1) {
			System.out.println("Digite o titulo: ");
			pilha.add(leia.nextLine()); // Adiciona o livro na pilha
			System.out.println("Pilha Atualizada:");
			pilha.forEach(System.out::println); // Exibe a pilha atualizada
		}else if(opcao == 2) {
			 if (pilha.isEmpty()) {	// Verifica se a pilha está vazia antes de listar
			     System.out.println("A Pilha está vazia.");
			 } else {
			     System.out.println("Livros na Pilha:");
			     pilha.forEach(System.out::println); // Exibe todos os livros da pilha
			 }
		}else if (opcao == 3) {
			if (pilha.isEmpty()) { // Verifica se tem livro para retirar da pilha
				System.out.println("\n A pilha está vazia!");
			}else {// Remove o livro do topo da pilha e exibe
				System.out.println("O Livro * " + pilha.pop() + " * foi retirado da pilha ⚠"); 
			} if (pilha.isEmpty()){ // Verifica se tem livros na pilha
				System.out.println("\nPilha Atualizada: ");
				System.out.println("A Pilha está vazia!");	
			}else {
			System.out.println("\nPilha Atualizada: ");
		    pilha.forEach(System.out::println);	// Exibe a pilha atualizada
			}
        }else { // Validação das opções
        	System.out.println("⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠ Opção invalida ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠");
        }
		} while (opcao != 0); // Repete enquanto não escolher sair
		
		 System.out.println("Progama Encerrado!");
		leia.close();
	}
}