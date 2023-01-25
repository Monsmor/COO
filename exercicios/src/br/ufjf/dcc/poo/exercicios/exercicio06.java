package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio06 {

	public static void main(String[] args) {
		int km, l;
		km = Integer.parseInt((JOptionPane.showInputDialog("Informe quantos km:")));
		l = Integer.parseInt((JOptionPane.showInputDialog("Informe quantos litros:")));
		
		JOptionPane.showMessageDialog(null, km/l);
		
	}

}
