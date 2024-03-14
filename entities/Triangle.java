package entities;

public class Triangle {
		// A primeira versão n tem inclusão nenhuma com essa class
	
		// Para a primeira versão do codigo
		public double A;
		public double B;
		public double C;
		
		// Para a terceira versão do codigo
		public double area() {
			double p = (A+B+C)/2;
			return Math.sqrt(p * (p - A)* (p - B) * (p - C));
		}
}