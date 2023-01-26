package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio17 {

	public static void main(String[] args) {
		int n=0, p=0, i=0;
		while(n != -1) {
			n = Integer.parseInt((JOptionPane.showInputDialog("Digite um número inteiro, para interromper digite -1:")));
			if(((n%2) == 0) && n != -1)
				p++;
			else if(n != -1) i++;
		}
		JOptionPane.showConfirmDialog(null, "Foram digitados " + p + " números pares e " + i + " números ímpares");
	}

}
