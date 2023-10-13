import javax.swing.JOptionPane;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		//Solicitando que o usuário insira a nota
		String insereNota = JOptionPane.showInputDialog("Digite a nota");
		
		// Convertendo a String insereNota para um valor Double
		double nota = Double.parseDouble(insereNota);
		
		
		//Verificando se a nota é maior que 5
		if(nota > 5) {
			JOptionPane.showMessageDialog(null, "Aprovado :)");
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado :(");
		}		
	}

}
