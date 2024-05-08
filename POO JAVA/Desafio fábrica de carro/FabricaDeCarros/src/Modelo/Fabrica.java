package Modelo;

import java.util.ArrayList;

import Vizualizacao.EntradaSaida;

public class Fabrica {
	public ArrayList<Carro> listaCarro = new ArrayList<Carro>();

	public void venderCarro(String modelo, String cor) {
		for(int i=0; i<listaCarro.size(); i++) {
			
			Carro car = listaCarro.get(i);
			
			if((car.getModelo().equals(modelo)) && (car.getCor().equals(cor))){
				listaCarro.remove(car);
			}
		}
		
	}

	public void fabricarCarro(int qtdCarro) {
		for (int i = 0; i < qtdCarro; i++) {
			Carro carro = new Carro();
			carro.setModelo(EntradaSaida.solicitaModelo());
			carro.setCor(EntradaSaida.solicitaCor());
			listaCarro.add(carro);
		}
	}

	public String listarCarro() {
		String informacoes = "";
		for (Carro carro : this.listaCarro) {
			informacoes += "\n\nModelo: " + carro.getModelo() + "\nCor: " + carro.getCor();
		}

		return informacoes;
	}
}