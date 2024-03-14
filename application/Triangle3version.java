// Esta é a terceira versão do codigo Triangle
// Nesta versão o codigo tera a novidade da conta feita da area feita na class Triangle

package application;

	import java.util.Locale;
	import java.util.Scanner;

	import entities.Triangle;

public class Triangle3version {

	public static void main(String[] args) {

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				Triangle x, y;
				x = new Triangle();
				y = new Triangle();
				
				System.out.println("DIGITE APENAS NUMEROS ABAIXO DE 10!! \n");
				
				System.out.println("Entre com as medidas do trinagulo X: ");
				x.A = sc.nextDouble();
				x.B = sc.nextDouble();
				x.C = sc.nextDouble();
				
				System.out.println("Entre com as medidas do trinagulo Y: ");
				y.A = sc.nextDouble();
				y.B = sc.nextDouble();
				y.C = sc.nextDouble();
				
				double areaX = x.area();
				
				double areaY = y.area();
				
				System.out.printf("A area do trinagulo X é: %.4f%n", areaX);
				System.out.printf("A area do trinagulo Y é: %.4f%n", areaY);
				
				if(areaX > areaY) {
					System.out.println("A maior area é X");
				}
				else if(areaY > areaX) {
					System.out.println("A maior area é Y");
				}
				else {
					System.out.println("! *ERRO* !");
				}
				sc.close();
			}
		
	}
