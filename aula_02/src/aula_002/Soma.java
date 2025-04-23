package aula_002;

public class Soma {

	public static void main(String[] args) {
		
		int numero_01 = 2, numero_02 = 2;
		String numeroS_01 = "2", numeroS_02 = "2";
		
		System.out.printf("\n soma: %d + %d = %d", numero_01, numero_02, (numero_01 + numero_02));
		System.out.printf("\n soma: %s + %s = %s", numeroS_01, numeroS_02, (numeroS_01 + numeroS_02));
		
		//Atribuição com soma
		System.out.println(numero_01 = numero_01 + 2);
		System.out.println(numero_01 += 2);

	}

}
