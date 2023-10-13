import javax.swing.JOptionPane;

public class ArmazenaNotasArray {

	public static void main(String[] args) {
		int tamanho = 3;
		float numeros[] = new float[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: " + ( i + 1)));
			
		}
		
		float maior = numeros[0];
		float menor = numeros[0];
		float media = numeros[0];
		String resultado = "" + numeros[0] + "\n";
		
		
		for(int i = 1; i < tamanho; i++) {
			if(maior < numeros[i])
				maior = numeros[i];
			if(menor > numeros[i])
				menor = numeros[i];
			media += numeros[i];
			
		}
		
		media /= tamanho;
		resultado =  "\n Média: " + media + "\n Maior: " + maior + "\n Menor: " + menor;
	    JOptionPane.showMessageDialog(null, resultado);
	

	}

}
