package br.com.fiap;

import javax.swing.JOptionPane;

public class EntradaJOption {

	public static void main(String[] args) {
		float num1 = 0.0f, num2 = 0.0f, num3 = 0.0f, num4 = 0.0f, media = 0.0f;
		
		
  String aux; 
  try {
	aux = JOptionPane.showInputDialog("Coloque a nota da prova1: ");
	num1 = Integer.parseInt(aux);
	aux = JOptionPane.showInputDialog("Coloque a nota da prova2: ");
	num2 = Integer.parseInt(aux);
	aux = JOptionPane.showInputDialog("Coloque a nota da prova3: ");
	num3 = Integer.parseInt(aux);
	aux = JOptionPane.showInputDialog("Coloque a nota da prova4: ");
	num4 = Integer.parseInt(aux);
	media = (num1 + num2 + num3 + num4)/4;
	JOptionPane.showMessageDialog(null, "a media é: " + media);
	
	
} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Resposta incorreta");
	
}
	
	
	}

}
