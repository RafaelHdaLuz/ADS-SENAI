
public class Soma {
	
	//variáveis privadas, armazenam os números que serão somados
	private double num1;
	private double num2;
	
	
	//getNum1() e getNum2() são métodos para obter os valores de num1 e num2
	public double getNum1() {
		//this é uma palavra-chave que se refere ao objeto atual dentro do qual o código está sendo executado
		return this.num1;
	}
	
	//setNum1(double num1) e setNum2(double num2) são métodos para definir os valores de num1 e num2
	public void setNum1(double num1) {
		this.num1=num1;
	}
	
	public double getNum2() {
		return this.num2;
	}
	
	public void setNum2(double num2) {
		this.num2=num2;
	}
	
	//acessa os valores de num1 e num2, realiza a adição desses valores e armazena o resultado na variável soma.
	public double calculaSoma() {
		double soma = num1 + num2;
		return soma;
	}
}
