package atividades_06;


import java.util.Iterator;	// Para percorrer os elementos do Set
import java.util.Scanner;
import java.util.Set;		// Interface do Set
import java.util.TreeSet;	// Set que organiza os dados em ordem crescente

public class Atividade_03 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // TreeSet para armazenar números únicos em ordem crescente
        Set<Integer> numeros = new TreeSet<>();
        
        int contador = 0;
        
        // Loop para entrada dos 10 numeros
        while (contador < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = leia.nextInt();
            numeros.add(numero);
            contador++;
        }

        // Usa Iterator para percorrer o Set
        Iterator<Integer> inumeros = numeros.iterator();
        
        // Loop que percorre os elementos do Set e imprimir um por um
        System.out.println("Listar dados do Set:");
        while (inumeros.hasNext()) {
            System.out.println(inumeros.next());
        }

        leia.close();
	}

}