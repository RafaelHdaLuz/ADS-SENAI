package fabrica;

import javax.swing.JOptionPane;

public class EntradaSaida {
	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro \n(Ex: SUV, Sedan, picape)");
		return modelo;
	}
	
	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor");
		return cor;
	}
	
	public static void mostraCarro(Carro carro) {
		JOptionPane.showMessageDialog(null, "Modelo: " +  carro.getmodelo() + "\nCor: " + carro.getcor());
	}
}