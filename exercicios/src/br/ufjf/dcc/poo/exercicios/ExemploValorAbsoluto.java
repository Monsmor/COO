package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExemploValorAbsoluto {
	
	public static void main(String[] args) {
		double n;
		n = Double.parseDouble((JOptionPane.showInputDialog("Insira um número:")));
		if (n < 0)
			n = -n;
		JOptionPane.showMessageDialog(null, "Seu valor absoluto é: " + n);
	}
}
