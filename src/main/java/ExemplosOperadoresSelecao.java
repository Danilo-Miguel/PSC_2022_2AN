import javax.swing.JOptionPane;


public class ExemplosOperadoresSelecao {
    public static void main(String[] args){
        double notaA1, notaA2, notaA3, soma;
        
        notaA1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A1 do aluno: "));
        notaA2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A2 do aluno: "));
        notaA3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A3 do aluno: "));
        
      
        
        soma = notaA1 + notaA2 + notaA3;
         if(soma >= 70){
             
             JOptionPane.showMessageDialog(null, "O aluno foi aprovado com a média: " + soma); 
         } else{
             JOptionPane.showMessageDialog(null, "O aluno foi reprovado com a média: " + soma); 

         }     
    }
    
}
