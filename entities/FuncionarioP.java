package entities;

public class FuncionarioP {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double porcentagem;
	
	public Double aumento() {
		double aumento = (salarioLiquido()*porcentagem)/100;
		return aumento;
	}
	
	public double salAumento() {
		return salarioLiquido() + aumento();
	}
	
	public String toString() {
		return "Atualização de dados: "
				+ nome 
				+ ", R$ " 
				+ String.format("%.2f", salAumento());
	}
	
}
