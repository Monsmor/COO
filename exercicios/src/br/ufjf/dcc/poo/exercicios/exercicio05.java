package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {
		float x1, x2, y1, y2, d;
		
		x1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o x1:"));
		y1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o y1:"));
		x2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o x2:"));
		y2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o y2:"));
		
		d = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		d = (float) Math.sqrt(d);
		
		JOptionPane.showMessageDialog(null, d);

	}

}
