package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class CadastroProduto {
	public static void main(String[] args) {
		/*
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter product data: \n");
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			System.out.println("Quantity in stock: ");
			int qtt = sc.nextInt();
			
			System.out.println("Product data: " + name + ", " + price + ", " + qtt + " units, Total price: " + (price * qtt));
			int add = .calculoProdutos(qtt);
		*/
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: \n");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in  stock: ");
		product.qtt = sc.nextInt();
		
		
		System.out.println("Product data: " + product);
		//aq á uma "toString" escondida, ela nao precisa ser colocada no product (product.toString), pois o Java detecta a toString sem nos precisarmos colocar 
		// o "toString" é para demostrar tal variavel como uma string, o jeito que eu queira q ela apareca como String
		//System.out.println(product.name + ", " + product.price + ", " + product.qtt);
		
		System.out.println();
		
		//adicionar
		System.out.print("Enter the number of products to be added in stock: ");
		int qtt = sc.nextInt();
		product.addProducts(qtt);
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		//remover
		System.out.print("Enter the number of products to be removed from stock: ");
		qtt = sc.nextInt();
		product.removeProducts(qtt);
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		
		
		sc.close();
	}
	
}
