import javax.swing.JOptionPane;

public class MostraNumerosMaiorOuMenor {

	public static void main(String[] args) {
		String insereNumero1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String insereNumero2 = JOptionPane.showInputDialog("Digite o segundo número");
		String insereNumero3 = JOptionPane.showInputDialog("Digite o terceiro número");
		String insereNumero4 = JOptionPane.showInputDialog("Digite o quarto número");
		
		int numero1 = Integer.parseInt(insereNumero1);
		int numero2 = Integer.parseInt(insereNumero2);
		int numero3 = Integer.parseInt(insereNumero3);
		int numero4 = Integer.parseInt(insereNumero4);
		
		int maior = Math.max(Math.max(numero1, numero2), Math.max(numero3, numero4));
		int menor = Math.min(Math.min(numero1, numero2), Math.min(numero3, numero4));
		
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
		JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
	}

}
