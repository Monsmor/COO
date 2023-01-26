package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio13 {

	public static void main(String[] args) {
		int x = 0, m = 0, c = 0;
		while (x != -1) {
			x = Integer.parseInt((JOptionPane.showInputDialog("Insira um número:")));
			if (x != -1) {
				m = m+x;
				c++;
			}
		}
		JOptionPane.showMessageDialog(null, "A média é: " + m/c);

	}

}
