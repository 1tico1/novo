package br.com.fiap;

import java.util.Scanner;

public class PraticandoScannertest { 

	public static void main(String[] args) {
		double raio, area;
		final double PI = 3.1416;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio de um circulo");
			raio = scan.nextDouble();
			area = PI * (raio*raio);
			System.out.println("A area é: " + area);
			
		} catch (Exception e) {
			// TODO: handle exception
		}	


}
	
}




