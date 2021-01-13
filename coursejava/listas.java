package coursejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

	public static void main(String[] args) {
		
		/**PARA DECLARAR LISTA DE NUMEROS INTEROS**/
		
		/*** List<Integer> list;**/
		
		/**O INTEGER ESTA DENTRO DO <> POIS ESSE SINAL � O GENERIRCS
		 * GENERICS: QUANDO VOC� PODE PARAMETRIZAR A DEFINI��O DE UM TIPO INFORMANDO UM OUTRO TIPO ESPECIFICO
		 * NESSE CASO QUEREMOS USAR INTEIRO E COLOCAMOS A WRAPPER CLASS**/

		List<String> list = new ArrayList<>();
		
		list.add("Maria"); /**ASSIM VOC� ADICIONA ELEMENTOS NA LISTA**/
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		/**PARA INSERIR UM NOVO ELEMENTO NA POSI��O QUE DESEJA**/
		list.add(2, "Marco");
		
		/**PARA VERMOS O TAMANHO DA LISTA**/
		System.out.println(list.size());
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		

		/**PARA REMOVER UM NOVO ELEMENTO ATRAV�S DA COMPARA��O DE DADOS**/
		list.remove("Anna");
		list.remove(1); /**VAI REMOVER QUEM ESTIVER NA POSI��O PASSADA**/
		
		
		/**PARA REMOVER POR PREDICADO**/
		list.removeIf(x ->x.charAt(0)=='M');
		
		/** VAI REMOVER TODO STRING X TAL QUE X.CHARAT(0) SEJA IGUAL A 'M' **/
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		/**PARA ENCONTRAR A POSI��O DE UM ELEMENTO**/
		System.out.println("Index of Bob " +  list.indexOf("Bob"));
		System.out.println("Index of Marco " +  list.indexOf("Marco"));
		/**QUANDO N�O ENCONTRAR A POSI��O DO ELEMENTO ELE RETORNA -1**/
		
		System.out.println("---------------------------------");
		
		/**PARA FILTRAR NA LISTA TODO MUNDO QUE COME�A COM TAL LETRA**/
		/**1� PEGAMOS A LISTA NO CASO � A LIST E CONVERTEMOS PARA STREAM**/
		/**STREAM � UM TIPO ESPECIAL QUE ACEITA OPERA��ES LAMBDA**/
		
		/**2� A PARTIR DO STREAM CHAMAMOS A FUN��O  FILTER QUE RECEBE O PREDICADO NO CASO 'A'**/
		
		/**3� COMO O STREAM N�O � COMPATIVEL COM O LIST, ENT�O VAMOS TER QUE PEGAR O STRAM E CONVERTER
		 * ELE PARA LISTA**/
		
		/**CHAMAMOS A FUN��O COLLECT E DENTRO DO ARGUMENTO COLOCAMOS 'COLLECTOR.TOLIST'**/
		
		List<String> result = list.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------------");
		/**PARA FILTRAR NA LISTA O PRIMEIRO ELEMENTO QUE COME�A COM TAL LETRA**/
		/**COMO CADA ELEMENTO DA LISTA � UMA STRING DEVEMOS DECLARAR UMA VARIAVEL STRING**/
		/**1� PEGAMOS A LISTA NO CASO � A LIST E CONVERTEMOS PARA STREAM**/
		/**2� A PARTIR DO STREAM CHAMAMOS A FUN��O  FILTER **/
		/**3� A PARTIR DO FILTER CHAMAMOS O FINDFIRST**/
		/**POREM O FINDAFIRST RETORNA UM OPTIONAL STRING , ENT�O PASSAMOS O ORELSE 'NULL'
		 * LOGO SE O FINDFIRST N�O ACHAR A LETRA QUE PEDIU ELE RETORNA NULO**/
		String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
