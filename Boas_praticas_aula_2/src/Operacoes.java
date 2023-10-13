import javax.swing.JOptionPane;

public class Operacoes {

	public static void main(String[] args) {
		
		String insereNumero1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String insereNumero2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		int numero1 = Integer.parseInt(insereNumero1);
		int numero2 = Integer.parseInt(insereNumero2);
		
		int result = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "O resultado do soma é: " + result);
	}

}
