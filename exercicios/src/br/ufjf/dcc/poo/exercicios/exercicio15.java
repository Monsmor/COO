package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio15 {

	public static void main(String[] args) {
		int a = Integer.parseInt((JOptionPane.showInputDialog("Qual o início do intervalo?")));
		int b = Integer.parseInt((JOptionPane.showInputDialog("E o final?")));
		String texto = "";
		int c=0;
		for(int i= a; i<=b; i++) {
			texto = texto + i + " ";
			c++;
			if(c == 10) {
				texto = texto + "\n";
				c = 0;
			}
		}
		JOptionPane.showConfirmDialog(null, texto);
	}

}
