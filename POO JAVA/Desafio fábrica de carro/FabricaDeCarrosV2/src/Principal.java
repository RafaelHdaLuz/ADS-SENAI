public class Principal {

	public static void main(String[] args) {
		
		String modelo = EntradaSaida.solicitaModelo();
		String cor = EntradaSaida.solicitaCor();

		Carro model = new Carro();
		model.setmodelo(modelo);
		model.setcor(cor);
		modelo = model.escolhaModelo();
		Carro color = new Carro();
		color.setmodelo(modelo);
		color.setcor(cor);
		cor = color.escolhaCor();
		
		EntradaSaida.mostraCarro(modelo, cor);
	}
}
