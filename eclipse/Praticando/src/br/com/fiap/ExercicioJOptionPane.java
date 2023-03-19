package br.com.fiap;

import javax.swing.JOptionPane;

public class ExercicioJOptionPane {
	
	public static void main(String[] args) {
		
		int anoAtual, anoNasc, idade;
		
	String aux;
	try {
		aux = JOptionPane.showInputDialog("digite o ano atual");
		anoAtual = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Digite o ano de nascimento");
		anoNasc = Integer.parseInt(aux);
		idade = anoAtual - anoNasc;
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos");
		
	
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "formato incorreto");
		
	}
}
	
	
}
