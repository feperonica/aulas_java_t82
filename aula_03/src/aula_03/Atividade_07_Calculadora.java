package aula_03;

import java.util.Scanner;

public class Atividade_07_Calculadora {

	public static void main(String[] args) {
	    
		Scanner leia = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o 1º número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = leia.nextFloat();

        // Código da operação
        System.out.print("Escolha a Operação:\n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão \n");
        int operacao = leia.nextInt();

        // Switch para realizar a operação
        switch (operacao) {
            case 1:
                System.out.printf("%.1f + %.1f = %.1f\n", numero1, numero2, (numero1 + numero2));
                break;
            case 2:
                System.out.printf("%.1f - %.1f = %.1f\n", numero1, numero2, (numero1 - numero2));
                break;
            case 3:
                System.out.printf("%.1f * %.1f = %.1f\n", numero1, numero2, (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                	System.out.printf("%.1f / %.1f = %.1f\n", numero1, numero2, (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        leia.close();
	}

}
