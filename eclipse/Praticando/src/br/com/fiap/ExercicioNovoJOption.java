package br.com.fiap;

import javax.swing.JOptionPane;

public class ExercicioNovoJOption {

	public static void main(String[] args) {
		double altura, base, area;  
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Informe a base do retangulo: ");
			base = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Informe a altura do retangulo: ");
			altura = Integer.parseInt(aux);
			area = base * altura;
			JOptionPane.showMessageDialog(null, "Valor da area: " + area);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Resposta errada");
			
		}

	}

}
