import javax.swing.JOptionPane;

public class EntradaSaida {
	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro desejado (Ex: SUV, hatch, picape):");
		return modelo;
	}
	
	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor do carro desejado:");
		return cor;
	}
	
	public static void mostraCarro(String modelo, String cor) {
		JOptionPane.showMessageDialog(null, "O modelo do seu carro é: "+ modelo + " e a cor é: "+cor);
	}
}
