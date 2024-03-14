package application;

import java.util.Scanner;

import entities.MediaAlunoP;

public class MediaAluno {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		MediaAlunoP mediaAlunoP = new MediaAlunoP();
        
        System.out.print("Digite o nome do aluno: ");
        mediaAlunoP.aluno = sc.next();
        System.out.println();
        System.out.print("Digite a primeira nota:  ");
        mediaAlunoP.n1 = sc.nextDouble();
        System.out.println();
        System.out.print("Digite a segunda nota: ");
        mediaAlunoP.n2 = sc.nextDouble();
        System.out.println();
        System.out.println(mediaAlunoP);
        
        sc.close();
		
	}

}
