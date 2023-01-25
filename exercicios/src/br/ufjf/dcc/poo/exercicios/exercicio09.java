package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio09 {

	public static void main(String[] args) {
		float a = Float.parseFloat((JOptionPane.showInputDialog("Informe o primeiro valor:")));
		float b = Float.parseFloat((JOptionPane.showInputDialog("Informe o segundo valor:")));
		float c = Float.parseFloat((JOptionPane.showInputDialog("Informe o terceiro valor:")));
		
		if((Math.abs(b-c) < a)&&(a < b+c))
			JOptionPane.showMessageDialog(null, "É um triangulo!");
		else if((Math.abs(a-c) < b)&&(b < a+c))
			JOptionPane.showMessageDialog(null, "É um triangulo!");
		else if((Math.abs(a-b) < c)&&(c < a+b))
			JOptionPane.showMessageDialog(null, "É um triangulo!");
		else JOptionPane.showMessageDialog(null, "Não é um triangulo!");
	}

}
