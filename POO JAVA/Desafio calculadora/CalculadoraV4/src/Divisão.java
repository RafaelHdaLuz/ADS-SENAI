
public class Divisão {
	
	//váriaveis privadas
	private double num1;
	private double num2;
	
	//método get para obter os valores de num1
	public double getNum1() {
		return this.num1;
	}
	
	//método set para definir os valores de num1
	public void setNum1(double num1) {
		this.num1=num1;
	}
	
	//método get para obter os valores de num2
	public double getNum2() {
		return this.num2;
	}
	
	//método set para definir os valores de num2
	public void setNum2(double num2) {
		this.num2=num2;
	}
	
	//acessa os valores de num1 e num2, realiza a divisão desses valores e armazena o resultado na variável divi
	public double calculaDivisao() {
		double divi = num1 / num2;
		return divi;
	}
}
