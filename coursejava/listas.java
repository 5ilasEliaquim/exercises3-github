package coursejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

	public static void main(String[] args) {
		
		/**PARA DECLARAR LISTA DE NUMEROS INTEROS**/
		
		/*** List<Integer> list;**/
		
		/**O INTEGER ESTA DENTRO DO <> POIS ESSE SINAL É O GENERIRCS
		 * GENERICS: QUANDO VOCÊ PODE PARAMETRIZAR A DEFINIÇÃO DE UM TIPO INFORMANDO UM OUTRO TIPO ESPECIFICO
		 * NESSE CASO QUEREMOS USAR INTEIRO E COLOCAMOS A WRAPPER CLASS**/

		List<String> list = new ArrayList<>();
		
		list.add("Maria"); /**ASSIM VOCÊ ADICIONA ELEMENTOS NA LISTA**/
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		/**PARA INSERIR UM NOVO ELEMENTO NA POSIÇÃO QUE DESEJA**/
		list.add(2, "Marco");
		
		/**PARA VERMOS O TAMANHO DA LISTA**/
		System.out.println(list.size());
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		

		/**PARA REMOVER UM NOVO ELEMENTO ATRAVÉS DA COMPARAÇÃO DE DADOS**/
		list.remove("Anna");
		list.remove(1); /**VAI REMOVER QUEM ESTIVER NA POSIÇÃO PASSADA**/
		
		
		/**PARA REMOVER POR PREDICADO**/
		list.removeIf(x ->x.charAt(0)=='M');
		
		/** VAI REMOVER TODO STRING X TAL QUE X.CHARAT(0) SEJA IGUAL A 'M' **/
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		/**PARA ENCONTRAR A POSIÇÃO DE UM ELEMENTO**/
		System.out.println("Index of Bob " +  list.indexOf("Bob"));
		System.out.println("Index of Marco " +  list.indexOf("Marco"));
		/**QUANDO NÃO ENCONTRAR A POSIÇÃO DO ELEMENTO ELE RETORNA -1**/
		
		System.out.println("---------------------------------");
		
		/**PARA FILTRAR NA LISTA TODO MUNDO QUE COMEÇA COM TAL LETRA**/
		/**1º PEGAMOS A LISTA NO CASO É A LIST E CONVERTEMOS PARA STREAM**/
		/**STREAM É UM TIPO ESPECIAL QUE ACEITA OPERAÇÕES LAMBDA**/
		
		/**2º A PARTIR DO STREAM CHAMAMOS A FUNÇÃO  FILTER QUE RECEBE O PREDICADO NO CASO 'A'**/
		
		/**3º COMO O STREAM NÃO É COMPATIVEL COM O LIST, ENTÃO VAMOS TER QUE PEGAR O STRAM E CONVERTER
		 * ELE PARA LISTA**/
		
		/**CHAMAMOS A FUNÇÃO COLLECT E DENTRO DO ARGUMENTO COLOCAMOS 'COLLECTOR.TOLIST'**/
		
		List<String> result = list.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------------");
		/**PARA FILTRAR NA LISTA O PRIMEIRO ELEMENTO QUE COMEÇA COM TAL LETRA**/
		/**COMO CADA ELEMENTO DA LISTA É UMA STRING DEVEMOS DECLARAR UMA VARIAVEL STRING**/
		/**1º PEGAMOS A LISTA NO CASO É A LIST E CONVERTEMOS PARA STREAM**/
		/**2º A PARTIR DO STREAM CHAMAMOS A FUNÇÃO  FILTER **/
		/**3º A PARTIR DO FILTER CHAMAMOS O FINDFIRST**/
		/**POREM O FINDAFIRST RETORNA UM OPTIONAL STRING , ENTÃO PASSAMOS O ORELSE 'NULL'
		 * LOGO SE O FINDFIRST NÃO ACHAR A LETRA QUE PEDIU ELE RETORNA NULO**/
		String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
