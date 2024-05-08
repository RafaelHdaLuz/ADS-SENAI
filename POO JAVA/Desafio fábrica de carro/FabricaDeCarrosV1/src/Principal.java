
public class Principal {

	public static void main(String[] args) {
		String modelo = EntradaSaida.solicitaModelo();
		String cor = EntradaSaida.solicitaCor();
		EntradaSaida.mostraCarro(modelo, cor);
	}

}
