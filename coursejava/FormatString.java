package coursejava;

public class FormatString {

	public static void main(String[] args) {
		
		/** FORMATAR UMA STRING : toLowerCase(),toUpperCase,()trim
		 * RECORTAR: substring(inicio),substring(inicio,fim)
		 * SUBSTITUIR: Replace(char,char),Replace(string,string)
		 * BUSCAR: IndexOf,LastIndexOf
		 * str.Split
		 * 
		 */
		
		String original = "abcde FGHIJ  ABC abc DEFG     ";
		
		/*PARA CONVERTER TUDO EM MINUSCULA*/
		String s01 = original.toLowerCase();
		/*PARA CONVERTER TUDO EM MAIUSCULA*/
		String s02 = original.toUpperCase();
		/*PARA ELIMINAR OS ESPAÇOS NO COMEÇO E FINAL DAS VARIAVEIS*/
		String s03 = original.trim();
		/*PARA MOSTRAR SOMENTE APARTIR 	DO NUMERO ESCOLHIDO (ABAIXO FOI ESCOLHIDO O NUMERO 2)*/
		String s04 = original.substring(2);
		/*PARA MOSTRAR SOMENTE APARTIR 	DO NUMERO ESCOLHIDO (ABAIXO FOI ESCOLHIDO O NUMERO 2) E ACABAR NO NUMERO PASSADO (NO CASO 9)(2,9 SÃO ARGUMENTOS)*/
		String s05 = original.substring(2,9);
		/***PARA SUBSTITUIR A  LETRA, SEMPRE QUE ENCONTRAR A LETRA 'A' SUBSTITUI POR 'X' (a,x)*******/
		String s06 = original.replace('a','x');
		/***PARA SUBSTITUIR UMA SUBSTRING, SEMPRE QUE ENCONTRAR A LETRA 'ABC' SUBSTITUI POR 'XY' (a,x)*******/
		String s07 = original.replace("abc","xy");
		/**PARA ACHAR A PRIMEIRA OCORRENCIA DO ARGUMENTO PASSADO**/
		int i = original.indexOf("bc");
		/**PARA ACHAR A ULTIMA OCORRENCIA DO ARGUMENTO PASSADO**/
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original:   -"+original+ " - ");
		System.out.println("toLowerCase:  -"+ s01+ "- ");
		System.out.println("toUpperCase:  -"+ s02+ "- ");
		System.out.println("trim:  -"+ s03+ "- ");
		System.out.println("Substring(2):  -"+ s04+ "- ");
		System.out.println("Substring(2,9):  -"+ s05+ "- ");
		System.out.println("Replace(a,x):  -"+ s06+ "- ");
		System.out.println("Replace(abc por xy):  -"+ s07+ "- ");
		System.out.println("Index of 'bc': "+ i );
		System.out.println("Last index of 'bc': "+ j );
		

		/***O SPLIT SERVE PARA RECORTAR A STRING E JOGAR CADA PARTE EM UM VETOR, E SE QUISER PODE COLOCAR QUANTAS PALAVRAS QUISER QUE AUTOMATICAMENTE
		 * SERÁ CRIADO UM NOVO VETOR PARA ALOCAR ESSA PALAVRA**/
		
		String s = "potato aplle lemon";
		/**O ESPAÇO ENTRE OS PARENTESES É O SEPARADOR**/
		String[] vect = s.split(" ");
		
		/*** String word1 = vect[0];
			String word2 = vect[1];
			String word3 = vect[2];
			***************/
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
