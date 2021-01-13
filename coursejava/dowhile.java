package coursejava;

import java.util.Locale;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		char resp ;
		
		do {
			/***ELE COMEÇA O PROGRAMA EXECUTANDO A AÇÃO**/
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9 * C /5 + 32;
			
			System.out.printf("Equivalente a Fahrenheint: %.1f%n ", F);
			System.out.printf("Deseja repetir? ");
			resp = sc.next().charAt(0);

		}while( resp !='n');
		
		/**********CASO A RESPOSTA SEJA NÃO ELE FINALIZA O PROGRAMA******************/
		
		sc.close();

	}

}
