package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio12 {
	public static void main(String[] args) {
		int v = Integer.parseInt((JOptionPane.showInputDialog("Quantas vezes a frase será dita?")));
		for(int i=0; v>i; i++) {
			JOptionPane.showMessageDialog(null, "Faça o exercício novamente!");
		}
	}
}
