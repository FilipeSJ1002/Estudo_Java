package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RetProduct;

public class RetanguloProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RetProduct retProduct = new RetProduct();
		
		
		System.out.println("Entre com as medidas X e Y do retangulo: ");
		retProduct.x = sc.nextDouble();
		retProduct.y = sc.nextDouble();
		
		System.out.println(retProduct);
		
		sc.close();
	}
	
}
