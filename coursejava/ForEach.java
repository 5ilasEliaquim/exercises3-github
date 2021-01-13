package coursejava;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String [] {"Maria", "Carla","Pedro"};/**PODEMOS PASSAR O QUE FICARÁ NO VETOR COMO O EXEMPLO**/ 

		for(int i =0; i< vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		/***PARA FAZER A MESMA SAIDA SO QUE COM O FOR EACH****/
		/**PARA USA-LO VOCÊ DEVE COLOCAR NA SEGUINTE SEQUENCIA 
		 * FOR(TIPO (DO ELEMENTO DO VETOR) APELIDO(PODE SER QUALQUER UM )  : COLEÇÃO (NO CASO AQUI A COLEÇÃO SE CHAMA VECT))***/
		System.out.println("-----------");
		
		
		for(String obj: vect) {
			/***MODO DE LEITURA DO FOR EACH; PARA CADA OBJ CONTIDO NO VETOR VECT FAÇA**/
			System.out.println(obj);
		}
		
		sc.close();
	}

}
