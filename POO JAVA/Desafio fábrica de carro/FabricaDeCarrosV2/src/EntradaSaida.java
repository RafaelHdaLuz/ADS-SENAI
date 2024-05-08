import javax.swing.JOptionPane;

public class EntradaSaida {
    //método estático que solicita ao usuário o modelo do carro    
	public static String solicitaModelo() {
                String modelo = JOptionPane.showInputDialog("Digite o modelo do carro desejado (Ex: SUV, hatch, picape):");
                return modelo;
        }
       
    //método estático que solicita ao usuário a cor do carro     
	public static String solicitaCor() {
                String cor = JOptionPane.showInputDialog("Digite a cor do carro desejado:");
                return cor;
        }
       
    //método estático que recebe duas strings como parâmetro    
	public static void mostraCarro(String modelo, String cor) {
                JOptionPane.showMessageDialog(null, "O modelo do seu carro é: "+ modelo + "\n e a cor é: "+cor);
        }
}