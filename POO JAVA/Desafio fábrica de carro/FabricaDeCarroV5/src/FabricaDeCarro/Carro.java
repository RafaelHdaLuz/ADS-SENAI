package FabricaDeCarro;

public class Carro extends CarroBase {

	private String potencia;
	private int anoCarro;

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public int getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	}

	public String tipoCarro() {
		this.setAnoCarro(EntradaSaida.solicitaAno());
		this.setPotencia(EntradaSaida.solicitaPotencia());

		String descricao = "Ano do veículo: " + this.getAnoCarro() + "\nPotência do veículo: " + this.getPotencia();
		return descricao;
	}
}