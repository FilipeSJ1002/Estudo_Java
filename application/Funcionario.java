package application;

import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioP; 

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FuncionarioP funcionarioP = new FuncionarioP();
		
		System.out.print("Nome: ");
		funcionarioP.nome = sc.next();
		
		System.out.print("Salario bruto: R$ ");
		funcionarioP.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: R$ ");
		funcionarioP.imposto = sc.nextDouble();
		
System.out.println();

		System.out.print("Funcionario: " + funcionarioP.nome + ", R$ " + funcionarioP.salarioLiquido());
		
System.out.println();
System.out.println();

		System.out.print("Insira a porcentagem de aumento salarial: ");
		funcionarioP.porcentagem = sc.nextDouble();
		
System.out.println();
		
		System.out.println(funcionarioP); // chama a "toString"
				
		
		
		sc.close();
	}
	
}
