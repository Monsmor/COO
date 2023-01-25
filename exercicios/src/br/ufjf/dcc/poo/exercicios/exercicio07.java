package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio07 {

	public static void main(String[] args) {
		int nums = (int) (Math.random() * 100);
		int num = Integer.parseInt((JOptionPane.showInputDialog("Insira um número de 0 a 100:")));

		if(num == nums)
			JOptionPane.showMessageDialog(null, "O número sorteado foi o mesmo");
		else {
			if(num > nums)
				JOptionPane.showMessageDialog(null, "O número sorteado foi menor");
			else
				JOptionPane.showMessageDialog(null, "O número sorteado foi maior");
		}
  	}
}
