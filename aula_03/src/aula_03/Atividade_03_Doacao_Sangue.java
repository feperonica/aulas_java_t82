package aula_03;

import java.util.Scanner;

public class Atividade_03_Doacao_Sangue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	    // Entrada de dados
	    System.out.print("Digite o Nome do doador: ");
	    String nome = leia.nextLine();

	    System.out.print("Digite a Idade do doador: ");
	    int idade = leia.nextInt();

	    System.out.print("Primeira doação de sangue? (true/false): ");
	    boolean primeiraDoacao = leia.nextBoolean();

	    // Verificação das regras de aptidão
	    boolean apto = false;

	    if (idade >= 18 && idade <= 59) {
	         apto = true;
	    } else if (idade >= 60 && idade <= 69 && !primeiraDoacao) {
	         apto = true;
	    }

	    // Saida personalizada
	    if (apto) {
	    System.out.println(nome + " está apto para doar sangue!");
	    } else {
	    System.out.println(nome + " não está apto para doar sangue!");
	    }

	    leia.close();
	  }

}
