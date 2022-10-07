/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaMetodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class TestaCalculadora {
    public static void main(String[] args){
        Calculadora c1 = new Calculadora();
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão"));
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o primeiro operando?"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o segundo operando?"));
        int resultado = 0;
        
        if(opcao == 1){
            resultado  = c1.soma(operando1, operando2);
        }
        else if(opcao == 2){
            resultado  = c1.subtracao(operando1, operando2);
        }
        else if(opcao == 3){
            resultado  = c1.multiplicacao(operando1, operando2);
        }
        else if(opcao == 4){
        resultado  = c1.divisao(operando1, operando2);
        }else{
            JOptionPane.showMessageDialog(null, "Digite uma opção válida");
        }
       JOptionPane.showMessageDialog(null, "Resultado" + resultado);
  
    }
    
}
