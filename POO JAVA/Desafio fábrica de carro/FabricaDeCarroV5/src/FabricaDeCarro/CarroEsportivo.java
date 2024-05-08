package FabricaDeCarro;

public class CarroEsportivo extends CarroBase {

	private String Turbo;
	private String tamanhoRoda;

	public String getTurbo() {
		return Turbo;
	}

	public void setTurbo(String turbo) {
		Turbo = turbo;
	}

	public String getTamanhoRoda() {
		return tamanhoRoda;
	}

	public void setTamanhoRoda(String tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}

	public String tipoCarro() {

		this.setTamanhoRoda(EntradaSaida.solicitaTamanhoRoda());
		this.setTurbo(EntradaSaida.solicitaTurbo());
		String descricao = "Turbo: " + this.getTurbo() + "\nAro: " + this.getTamanhoRoda();
		return descricao;
	}

}
