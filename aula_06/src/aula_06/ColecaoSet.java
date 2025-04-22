package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas){
			System.out.println(frutas.hashCode());
		}
		
		System.out.println("Morando existe na coleção? " + frutas.contains("Morango"));
		
		//Excluir um elemento da coleção
		frutas.remove("Morango");
		
		//Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		leia.close();
	}

}
