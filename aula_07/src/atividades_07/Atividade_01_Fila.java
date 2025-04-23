package atividades_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_01_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Cria a Estrutura de Dados Fila
		Queue<String> fila = new LinkedList<>();
		
		// Variável para armazenar a opção escolhida
		int opcao = 0;
		
		do{
		System.out.println("\n***********************************************************");
		System.out.println("");
		System.out.println("		1 - Adicionar Cliente na Fila			");
		System.out.println("		2 - Listar todos os Cliente				");
		System.out.println("		3 - Retirar Cliente da Fila				");
		System.out.println("		0 - Sair								");
		System.out.println("");
		System.out.println("***********************************************************");
		System.out.printf("Digite a opção desejada: ");
		opcao = leia.nextInt(); // Lê a opção escolhida
		leia.nextLine(); // Limpa o buffer

		if(opcao == 1) {
			System.out.println("Digite o nome do cliente a ser adicionado na fila: ");
			fila.add(leia.nextLine()); // Adiciona um cliente na fila
			System.out.println("Pilha Atualizada:");
			fila.forEach(System.out::println); // Exibe a fila atualizada
		}else if(opcao == 2) {
			 if (fila.isEmpty()) { // Verifique se tem clientes na fila
			     System.out.println("A fila está vazia.");
			 } else {
			     System.out.println("Clientes na fila:");
			     fila.forEach(System.out::println); // Exibe todos os clientes da fila
			 }
		}else if (opcao == 3) {	 
			if (fila.isEmpty()) { // Verifique se tem clientes na fila
				System.out.println("\n A fila está vazia!");
			}else {
				System.out.println("Chamando: " + fila.poll() + " ⚠");  // Remove o cliente do início da fila e exibe
			} if (fila.isEmpty()){	// Após chamar, verifica se ainda tem cliente
				System.out.println("\nLista Atualizada: ");
				System.out.println("A fila está vazia!");	
			}else {	
			System.out.println("\nLista Atualizada: ");
		    fila.forEach(System.out::println);// Apresenta a fila atualizada
			}
        }else { // Validação das opções
        	System.out.println("⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠ Opção invalida ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠");
        }
		} while (opcao != 0);  // Repete enquanto não escolher sair
		
		 System.out.println("Progama Encerrado");
		leia.close();
	}
}