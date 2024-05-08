package Controle;

import Modelo.*;
import Vizualizacao.EntradaSaida;

public class Controladora {

	public void exibeMenu() {
		Fabrica fabrica = new Fabrica();
		Carro carro = new Carro();
		int qtdCarro = 0;
		int opcao;
		int qtd;

		do {

			opcao = EntradaSaida.solicitaOpcao();

			
			switch (opcao) {

			case 0:
				qtdCarro = EntradaSaida.solicitaQtdCarro(qtdCarro);
				fabrica.fabricarCarro(qtdCarro);
				break;

			case 1:
				String informacoes = fabrica.listarCarro();
				EntradaSaida.mostrarCarro(informacoes);
				break;

			case 2:
				qtd = EntradaSaida.solicitarQtd();
				carro.setModelo(EntradaSaida.solicitaModelo());
				carro.setCor(EntradaSaida.solicitaCor());
				for (int i = 0; i < qtd; i++) {
					fabrica.venderCarro(carro.getModelo(), carro.getCor());
				}
				break;
			}
		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
