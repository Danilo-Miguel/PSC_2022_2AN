
import javax.swing.JOptionPane;


public class IfSimples {
    public static void main(String[]args){
      double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota"));
      if(nota >= 70){
          JOptionPane.showMessageDialog(null, "Aprovado com a nota: " + nota);
      }
    }
    
}
