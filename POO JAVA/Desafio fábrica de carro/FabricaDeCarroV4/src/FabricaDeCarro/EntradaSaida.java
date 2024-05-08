package FabricaDeCarro;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro desejado \n(Ex: SUV, sedan, picape)");
		return modelo;
	}

	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor");
		return cor;
	}

	public static void mostraCarro(Carro carro) {
		JOptionPane.showMessageDialog(null,"O modelo do seu carro é: " + carro.getModelo() + "\n e a cor é: " + carro.getCor());
	}
}