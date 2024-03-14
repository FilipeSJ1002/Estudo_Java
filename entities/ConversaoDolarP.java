package entities;

public class ConversaoDolarP {
	
	public Double dolar;
	public Double converter;
	public static final Double IOF = 6.0;
	
	public Double valor() {
		return converter * dolar;
	}
	public Double iof() {
		return (valor() * 6)/100;
	}
	public Double conta() {
		return valor() + iof();
	}
	
	public String toString() {
		return "A porcentagem do IOF é de: " + String.format("%.0f", IOF) + "%."
				+ "\nO valor convertido é de: R$ " + String.format("%.2f", valor())
				+ "\nO valor do IOF foi de: R$ " + String.format("%.2f", iof())
				+ "\nO valor a ser cobrado sera de: R$ " + String.format("%.2f", conta());
	}
	

}
