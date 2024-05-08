package Vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static int solicitaOpcao() {
		String[] opcoes = { "Fabricar carros", "Listar carros", "Vender carros", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
		return modelo;
	}

	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor do carro");
		return cor;
	}

	public static int solicitaQtdCarro(int qtdCarro) {
		qtdCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros para fabricar"));
		return qtdCarro;
	}

	public static String mostrarCarro(String informacoes) {
		JOptionPane.showMessageDialog(null, "LISTA DOS CARROS" + informacoes);
		return informacoes;
	}

	public static int solicitarQtd() {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carro que você deseja vender"));
		return qtd;
	}
}
