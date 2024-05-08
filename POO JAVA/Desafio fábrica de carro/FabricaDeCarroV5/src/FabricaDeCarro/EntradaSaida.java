package FabricaDeCarro;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaTipo() {
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do veículo desejado? "
				+ "\nDigite:"
				+ "\n1-Popular "
				+ "\n2-Esportivo"));
		return tipo;
	}

	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro desejado \n(Ex: SUV, sedan, picape)");
		return modelo;
	}

	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor");
		return cor;
	}

	public static int solicitaAno() {
		int anoCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo"));
		return anoCarro;
	}

	public static String solicitaPotencia() {
		String potencia = JOptionPane.showInputDialog("Digite a potencia do veículo");
		return potencia;
	}

	public static String solicitaTurbo() {
		String turbo = JOptionPane.showInputDialog("O veículo terá turbo?");
		return turbo;
	}

	public static String solicitaTamanhoRoda() {
		String tamanhoRoda = JOptionPane.showInputDialog("Qual o aro do veículo?");
		return tamanhoRoda;
	}

	public static void mostraCarro(CarroBase carro, String escolherCarro) {
		JOptionPane.showMessageDialog(null,
				"O modelo do carro é: " + carro.getModelo() + "\n e a cor é: " + carro.getCor()
						+ "\nO ano do veículo é " + escolherCarro);
	}
}
