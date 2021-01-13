package coursejava;

import java.util.Scanner;

import entitievetorexercicio.Rent;

public class exe1vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rent[] quarto = new Rent[10];

		System.out.println("Quantas pessoas irão alugar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.println("informe o nome do cliente");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("informe Email do cliente");
			String email = sc.nextLine();
			System.out.println("informe o quarto do cliente");
			int room = sc.nextInt();
			
			quarto[room] = new Rent(name, email);

			 
		}

			
			System.out.println();
			System.out.println("Busy rooms");
			for(int i =0;i<quarto.length;i++) {
				if (quarto[i] != null) {
						
						System.out.println(i + " "+ quarto[i]);

					}
				}
			
		
		sc.close();

	}

}
