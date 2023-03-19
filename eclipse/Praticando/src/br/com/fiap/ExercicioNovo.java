package br.com.fiap;

import java.util.Scanner;

public class ExercicioNovo {

	public static void main(String[] args) {
		double altura, base, area; 
			
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor da altura do retangulo: ");
			altura = scan.nextDouble();
			System.out.println("Digite o valor da base: ");
			base = scan.nextDouble();
			area = altura * base;
			System.out.println("area do retangulo: " + area);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto");
			
		}
		
		
		
	}

}
