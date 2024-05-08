import javax.swing.JOptionPane;

public class Principal {
	
	private static Operacao oper = new Operacao();
	
	public static void main(String[] args) {
		
		int continuar;
		
		do {
			double num1 = EntradaSaida.solicitaNumero("1º");
			double num2 = EntradaSaida.solicitaNumero("2º");
			int operacao = EntradaSaida.solicitaOperacao();
			double resultado = 0;
			
			switch(operacao) {
			case 1:
				resultado = oper.calculaSoma(num1, num2);
				break;
				
			case 2:
				resultado = oper.calculaSubtração(num1, num2);
				break;
				
			case 3:
				resultado = oper.calculaMultiplicacao(num1, num2);
				break;
				
			case 4:
				while ( num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				resultado = oper.calculaDivisao(num1, num2);
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
