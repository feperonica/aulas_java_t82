package aula_03;

import java.util.Scanner;

public class Atividade_06_Reajuste_Salarial {

	public static void main(String[] args) {
        
		Scanner leia = new Scanner(System.in);

        // Entradas
        System.out.print("Nome do colaborador: ");
        String nome = leia.nextLine();

        System.out.print("Cargo: ");
        int cargo = leia.nextInt();

        System.out.print("Salário: R$ ");
        float salario = leia.nextFloat();

        String nomeCargo = "";
        float percentual = 0;

        // Switch para identificar o cargo e o reajuste
        switch (cargo) {
        	case 1:
                nomeCargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                nomeCargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                nomeCargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                nomeCargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                nomeCargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                nomeCargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido.");
                leia.close();
                return;
        }

        // Cálculo do novo salário
        float novoSalario = salario + (percentual * salario);

        // Saída formatada
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: " + nomeCargo);
        System.out.printf("Salário: R$ %.2f\n", novoSalario);

        leia.close();

	}

}
