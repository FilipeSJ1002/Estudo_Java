// Esta é a segunda versão do codigo Triangle
// Nesta versão foi feita a class Triangle para diminuir a quantidade de variaveis existentes
package application;

	import java.util.Locale;
	import java.util.Scanner;

	import entities.Triangle;

public class pTriangle {

	public static void main(String[] args) {

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				// double xA, xB, xC, yA, yB, yC;
				// Em vez disso ⬆️ use ⬇️
				Triangle x, y;
				x = new Triangle();
				y = new Triangle();
				
				System.out.println("Entre com as medidas do trinagulo X: ");
				/*
				 xA = sc.nextDouble();
			 	 xB = sc.nextDouble();
				 xC = sc.nextDouble();
				 
				 Em vez disso ⬆️ use ⬇️ */
				x.A = sc.nextDouble();
				x.B = sc.nextDouble();
				x.C = sc.nextDouble();
				
				System.out.println("Entre com as medidas do trinagulo Y: ");
				/*
				 yA = sc.nextDouble();
				 yB = sc.nextDouble();
				 yC = sc.nextDouble();
				 
				 Em vez disso ⬆️ use ⬇️ */
				y.A = sc.nextDouble();
				y.B = sc.nextDouble();
				y.C = sc.nextDouble();
				
				double p = (x.A + x.B + x.C) / 2.0;
				double areaX = Math.sqrt(p * (p - x.A)* (p - x.B) * (p - x.C));
				
				p = (y.A + y.B + y.C) / 2.0;
				double areaY = Math.sqrt(p * (p - y.A)* (p - y.B) * (p - y.C));
				
				System.out.printf("A area do trinagulo X é: %.4f%n", areaX);
				System.out.printf("A area do trinagulo Y é: %.4f%n", areaY);
				
				if(areaX > areaY) {
					System.out.println("A maior area é X");
				}
				else {
					System.out.println("A maior area é Y");
				}
				
				sc.close();
			}
		
	}
