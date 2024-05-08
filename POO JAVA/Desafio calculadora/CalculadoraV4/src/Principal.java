import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int continuar;
		
		do {
			double num1 = EntradaSaida.solicitaNumero("1º");
			double num2 = EntradaSaida.solicitaNumero("2º");
			int operacao = EntradaSaida.solicitaOperacao();
			double resultado = 0;
			
			switch(operacao) {
			case 1:
				//Instância da classe soma
				Soma soma = new Soma();
				//Define os valores num1 e num2 nessa instância
				soma.setNum1(num1);
				soma.setNum2(num2);
				//Chama o método calculaSoma() do objeto soma para calcular a soma de num1 e num2 
				//armazenando o resultado na variável resultado.
				resultado = soma.calculaSoma();
				break;
				
			case 2:
				//Instância da classe Subtração
				Substração sub = new Substração();
				sub.setNum1(num1);
				sub.setNum2(num2);
				resultado = sub.calculaSubtração();
				break;
				
			case 3:
				//Instância da classe Multiplicação
				Multiplicação multi = new Multiplicação();
				multi.setNum1(num1);
				multi.setNum2(num2);
				resultado = multi.calculaMultiplicacao();
				break;
				
			case 4:
				while ( num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				//Instância da classe Divisão
				Divisão divi = new Divisão();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calculaDivisao();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada!");
				System.exit(0);
			}
			EntradaSaida.mostraResultado(resultado, operacao);
			
			continuar  = Integer.parseInt(JOptionPane.showInputDialog("Dejesa continuar calculando? 1 - sim | 2 - não"));
			
		} while (continuar == 1);	
		
	}
	
	
	
	
}
