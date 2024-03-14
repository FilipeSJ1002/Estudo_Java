package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConversaoDolarP;

public class ConversaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ConversaoDolarP contDolar = new ConversaoDolarP();
		
		System.out.print("Insira o valor do real para um dolar: ");
		contDolar.dolar = sc.nextDouble();
		
		System.out.print("\nIsira o valor em dolar que sera convertido: ");
		contDolar.converter = sc.nextDouble();
		
		System.out.println(contDolar);
		
		sc.close();
	}
	
}
