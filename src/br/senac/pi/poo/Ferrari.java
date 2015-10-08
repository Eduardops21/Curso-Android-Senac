package br.senac.pi.poo;

public class Ferrari {
	public static void main(String[] args) {
	
	
		carro c1 = new carro();
		
			c1.marca = "Ferrari"; //Atribuição de valores
			c1.modelo= "f448";
			c1.Chassi = "f45679FRTY";
			c1.ano = 2015;
			System.out.println("Marca: "+c1.marca);
			System.out.println("Modelo "+c1.modelo);
			System.out.println("Ano "+c1.ano);
			
			c1.partida();
			c1.acelerar();
			c1.parar();
			
	}
	
}