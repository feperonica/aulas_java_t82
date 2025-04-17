package atividades_04;

import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        //Variaveis
        int numero, soma = 0, contador = 0;
       
        //Entrada dos dados e validação
        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                contador++;
            }

        } while (numero != 0);

        //Resultados
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f\n", media);
        } else {
            System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
        }

        leia.close();		
	}

}
