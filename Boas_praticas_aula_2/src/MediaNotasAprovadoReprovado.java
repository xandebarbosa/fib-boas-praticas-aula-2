import javax.swing.JOptionPane;

public class MediaNotasAprovadoReprovado {

	public static void main(String[] args) {
		String insereNota1 = JOptionPane.showInputDialog("Digite a primeira nota");
		String insereNota2 = JOptionPane.showInputDialog("Digite a segunda nota");
		
		double nota1 = Double.parseDouble(insereNota1);
		double nota2 = Double.parseDouble(insereNota2);
		
		double media = (nota1 + nota2) / 2;
		
		if (media > 5) {
			JOptionPane.showMessageDialog(null, "Aprovado !!!");
		} else {
			// Solicitando ao usuário que insira mais uma nota
			String insereNota3 = JOptionPane.showInputDialog("Digite a terceira nota");
			double nota3 = Double.parseDouble(insereNota3);
			
			double menorNota = Math.min(nota1, nota2);
			
			//Refazendo a média com a nova nota
			media = (nota3 + (nota1 + nota2 - menorNota)) / 2;
			
			if (media > 5) {
				JOptionPane.showMessageDialog(null, "Aprovado :)");
			} else {
				JOptionPane.showMessageDialog(null, "Reprovado :(");
			}
		}
	}

}
