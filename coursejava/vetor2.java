package coursejava;

import java.util.Scanner;

import dadosVetores.Dados;

public class vetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		Dados[] vect = new Dados[N];
		
		/**AO INVES DE USARMOS N NO FOR PODEMOS USAR A PROPRIEDADE
		 * VECT.LENGTH QUE PASSA O TAMANHO DO VETOR **/
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double preco = sc.nextDouble();			
			vect[i] = new Dados(name, preco);
		}
		
		double soma = 0;
		
		for(int i =0;i<N;i++) {
			soma = soma + vect[i].getPreco();
		}

		double media = soma/vect.length;
		
		System.out.printf("Media de preco %.2f " , media);
		
		
		sc.close();
	}

}
