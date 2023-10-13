import javax.swing.JOptionPane;

public class MostraParOuImpar {

	public static void main(String[] args) {
		
		String insereNumero = JOptionPane.showInputDialog("Digite um número");
		
		int numero = Integer.parseInt(insereNumero);
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é par.");
		} else {
			JOptionPane.showMessageDialog(null, "O número é impar.");
		}
		

	}

}
