package br.senac.pi.poo;

import java.util.Scanner;

public class exercicio_questao1 {

	public static void main (String[] args){
double media;
int quantidade=0; double salario_total=0;
double salario=0;
System.out.println("quantos funcionarios a na empresa");
Scanner c= new Scanner(System.in);
quantidade=c.nextInt();
for(int i=1;i<=quantidade;i++){
	
	System.out.println("qual o salario do "+i+"funcionario");
	
	salario=c.nextDouble();
	salario_total=salario_total+salario;
}
	media=salario_total/quantidade;
	System.out.println(media);
	
	
	
	
	}
	
}
