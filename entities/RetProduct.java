package entities;

public class RetProduct {

	public double x;
	public double y;
	
	public double area() {
		return this.x * this.y;
	}
	public double perimetro() {
		return 2*(this.x + this.y);
	}
	public double diagonal() {
		return Math.sqrt((x*x)+(y*y));
	}
	
	
	public String toString(){
		return "Area: " 
				+ area()
				+	"\nPerimeto: "
				+ perimetro()
				+ "\nDiagonal: "
				+ diagonal();
	}
}
