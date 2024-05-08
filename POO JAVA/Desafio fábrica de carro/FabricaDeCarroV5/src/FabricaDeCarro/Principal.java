package FabricaDeCarro;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		CarroBase carro = new Carro();
		CarroBase qualCarro = null;

		String escolherCarro = null;

		switch (EntradaSaida.solicitaTipo()) {

		// carro popular
		case 1:
			qualCarro = new Carro();
			break;

		// carro esportivo
		case 2:
			qualCarro = new CarroEsportivo();
			break;

		default:
			JOptionPane.showMessageDialog(null, "Tente novamente!");
			break;
		}

		escolherCarro = qualCarro.tipoCarro();
		carro.setModelo(EntradaSaida.solicitaModelo());
		carro.setCor(EntradaSaida.solicitaCor());

		EntradaSaida.mostraCarro(carro, escolherCarro);
	}
}
