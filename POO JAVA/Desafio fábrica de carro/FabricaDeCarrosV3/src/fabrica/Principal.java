package fabrica;

public class Principal {

	public static void main(String[] args) {

		String modelo = EntradaSaida.solicitaModelo();
		String cor = EntradaSaida.solicitaCor();
		
		Carro carro = new Carro();
		carro.setcor(cor);
		carro.setmodelo(modelo);
		
		EntradaSaida.mostraCarro(carro);
	}
}
