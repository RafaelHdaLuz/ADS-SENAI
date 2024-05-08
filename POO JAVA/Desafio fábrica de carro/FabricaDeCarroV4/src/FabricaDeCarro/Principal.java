package FabricaDeCarro;

public class Principal {

	public static void main(String[] args) {

		String modelo = EntradaSaida.solicitaModelo();
		String cor = EntradaSaida.solicitaCor();

		Carro carro = new Carro();
		carro.setModelo(modelo);
		carro.setCor(cor);
		
		EntradaSaida.mostraCarro(carro);
	}
}
