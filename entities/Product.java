package entities;

public class Product {	
	public String name;
	public Double price;
	public int qtt;
	
	public double priceTotal() {
		return price*qtt;
	}
	
	public void addProducts(int qtt) {
		this.qtt += qtt; // "this.qtt" é o qtt da class q seria o "public int qtt" enquanto o outro qtt seria o "qtt" q foi criado aq no public
		// o "this" chama a varivel pricipal da classe quando se tem mais de uma variavel com o msm nome
	}
	
	public void removeProducts(int qtt) {
		this.qtt -= qtt; // mesma coisa q o de cima so q emcima esta sendo adicionado e qaq esta sendo removido
	}
	
	public String toString() {
		return name
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ 	qtt
				+ " units, Total: $ " 
				+ String.format("%.2f", priceTotal());
	}
	
}
