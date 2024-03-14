package application;

import java.util.Locale;
import java.util.Scanner;

public class trianguloObj {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com as medidas do trinagulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do trinagulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA)* (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA)* (p - yB) * (p - yC));
		
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
