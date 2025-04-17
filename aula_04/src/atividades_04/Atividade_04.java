package atividades_04;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Contadores gerais
        int idade, identidade, totalPessoas = 0, somaIdades = 0;
        int dev, backend = 0, mulheresCisTransFrontend = 0, homensCisTransMobile40 = 0, nBinarioFullstackMenor30 = 0;

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Idade: ");
            idade = leia.nextInt();

            System.out.print("Identidade de Gênero (1 a 6): ");
            identidade = leia.nextInt();

            System.out.print("Pessoa Desenvolvedora (1 a 4): ");
            dev = leia.nextInt();

            leia.nextLine();

            // Atualiza totais
            totalPessoas++;
            somaIdades += idade;

            // 1 - Total de pessoas desenvolvedoras Backend
            if (dev == 1) {
                backend++;
            }

            // 2 - Mulheres Cis (1) e Trans (4) desenvolvedoras Frontend (2)
            if ((identidade == 1 || identidade == 4) && dev == 2) {
                mulheresCisTransFrontend++;
            }

            // 3 - Homens Cis (2) e Trans (5) desenvolvedores Mobile (3) maiores de 40 anos
            if ((identidade == 2 || identidade == 5) && dev == 3 && idade > 40) {
                homensCisTransMobile40++;
            }

            // 4 - Não Binário (3) desenvolvedores FullStack (4) menores de 30 anos
            if (identidade == 3 && dev == 4 && idade < 30) {
                nBinarioFullstackMenor30++;
            }

            // Deseja continuar?
            System.out.print("Deseja continuar (S/N)? ");
            continuar = leia.nextLine();
        }

        // Resultados
        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisTransFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisTransMobile40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nBinarioFullstackMenor30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);

        if (totalPessoas > 0) {
            double mediaIdade = (double) somaIdades / totalPessoas;
            System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
        } else {
            System.out.println("Nenhum dado foi informado.");
        }

        leia.close();
	}

}
