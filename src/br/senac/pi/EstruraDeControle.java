package br.senac.pi;

import java.util.Random;

import javax.swing.JOptionPane;

public class EstruraDeControle {

	public static void main(String[] args) {
		/*
		 * for(int i=0;i<100;i++){ if(i%2==0){ System.out.println(i); } }
		 */

		Random gerador = new Random();
		int j=gerador.nextInt(15);
		//JOptionPane.showMessageDialog(null, j);
		
		
		for (int i = 15; i >= 0; i--) {
			System.out.println(i);
			
			
			JOptionPane.showMessageDialog(null,i);
			
			
			if (i == j) {
				System.out.println("KABUMMMMMMMM!!!!");
				JOptionPane.showMessageDialog(null, "KABUMMMMMMMMMMMM!");
				JOptionPane.showMessageDialog(null, "VOCÊ PERDEU");
				break;
				
			}

		}
		
		JOptionPane.showMessageDialog(null,"teste");

	}

}
