package exercicio11;

import javax.swing.JOptionPane;
public class Exercicio11 {

    public static void main(String[] args) {
			int numero;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
			
			if(numero%2==0) {
                            int resultado;
                            resultado = numero/2;
                            JOptionPane.showMessageDialog(null, "O numero /2 é " +resultado);
			}else{
				JOptionPane.showMessageDialog(null, "O numero não é divisivel por 2");
				}
			}
		}