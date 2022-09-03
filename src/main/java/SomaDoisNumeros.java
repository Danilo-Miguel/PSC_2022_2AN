import javax.swing.JOptionPane;

public class SomaDoisNumeros {
    public static void main(String[] args){
     
        
        double primeiroValor , segundoValor, resultado;
        // Entrada de dados
        primeiroValor  = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));  
        segundoValor  = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        // processamento
        resultado =  primeiroValor + segundoValor; 
        double saida = 100.00;
        // saida
                System.out.println(String.format(" O numero é: %.7f ", saida));
        JOptionPane.showMessageDialog(null, "O resultado da some é: "   +  resultado);

        
   }
} 