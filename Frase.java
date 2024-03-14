//VETOR QUE RECEBE AS PALAVRAS DE UMA FRASE E AS NUMERA EM ORDEM.

import java.util.Scanner;

public class Frase {
		
		public static void main(String[] args) {
			Scanner frase = new Scanner(System.in);
			
			System.out.println("Digite uma frase qualquer: ");
			String r = frase.nextLine();
			System.out.println("");
			String[] vetPalavra = r.split(" ");
			
			System.out.println("A quantidade de palavras e sua posição na frase.");
			for(int i=0;i<vetPalavra.length;i++) {
				System.out.println(i+1 + " - " + vetPalavra[i]);
			}
			frase.close();
		}
}