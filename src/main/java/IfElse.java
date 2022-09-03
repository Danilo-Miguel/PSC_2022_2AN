
import javax.swing.JOptionPane;


public class IfElse {
    public static void main(String[]args){
      double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota"));
      if(nota >= 70){
          JOptionPane.showMessageDialog(null, "Aprovado com a nota: " + nota);
      }else{
           JOptionPane.showMessageDialog(null, "Reprovado com a nota: " + nota);

      }
    }
    
}
