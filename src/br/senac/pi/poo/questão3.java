package br.senac.pi.poo;

import java.util.Scanner;

public class questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String nome;		
double nota1,nota2,nota3;


Scanner c = new Scanner (System.in);

System.out.println("Nome do aluno: ");
nome=c.next();

System.out.println("primeira nota: ");
nota1=c.nextDouble();

System.out.println("segunda nota: ");
nota2=c.nextDouble();

System.out.println("terceira nota: ");
nota3=c.nextDouble();


double media=(nota1+nota2+nota3)/3;

if(media>=7){
	System.out.println("Esta Aprovado!");
}

else if(media>=6 && media<7){
	System.out.println("Esta de Recuperação!");
}

else if(media<6){
	System.out.println("Esta Reprovado!");

}
		
		
		
	}

}
