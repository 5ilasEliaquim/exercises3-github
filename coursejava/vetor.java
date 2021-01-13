package coursejava;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		double soma = 0, media = 0;
		
		System.out.println("Informe a altura");
		
		for(int i = 0; i<N;i++) {
			vet[i] = sc.nextInt();			
		}

		for(int i = 0; i<N;i++) {
			soma = soma + vet[i];
		}
		
		System.out.println(media/N);
		
		
		sc.close();
	}

}
