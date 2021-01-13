package coursejava;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe tres numero");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		/*A FUNCAO MAX RETORNA O MAIOR POR ISSO TEMOS QUE CRIAR UMA CLASSE*/
		int higher = max(a,b,c);
		ShowResult(higher);
		
		sc.close();
	}
	
	/**ESSA FUNCAO RECEBE PARAMETRO(ESTÃO DENTRO DO () LEMBRANDO QUE NÃO PRECISA SER IGUAL AO DA FUNCAO DE CIMA "A,B,C")****/
	
	public static int max(int x,int y, int z) {
		
		int aux;/*essa variavel é local, so vai existir aqui dentro desse escopo*/
		
		if(x>y &&x > z) {
			aux = x;
		}else if(y>z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux; /**ESSE RETORNO, TRAS O QUE ESTA NA VARIAVEL**/
		
	}
	
	/**Lembrando que void é porquê a funcao não retorna tipo nenhum, por isso fica void (vazio),  quando uma funcao faz uma ação que não retorna dado 
	 * que pode ser aproveitado pelo programa o tipo dela é vazio**/
	
	public static void ShowResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
