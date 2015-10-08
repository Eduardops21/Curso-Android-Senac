package br.senac.pi.poo;

public class carro {
	//Atributos da classe (objetos) Carro
	String marca;
	String modelo;
	int ano;
	String placa;
	String Chassi;

	//Comportamento da classe (Objeto) Carro
	public void partida() {
		System.out.println("Carro ligado...");
    }

	public void acelerar() {
		System.out.println("Carro acelerado...");
	}
	
	public void parar() {
	
			System.out.println("carro parado...");
	}}