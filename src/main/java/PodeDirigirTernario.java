
import javax.swing.JOptionPane;


public class PodeDirigirTernario {
     public static void main(String[]args){
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
      String podeDirigir;
      podeDirigir = idade>=18?"Sim, você pode dirigir, vai pra revoada":"Não, sem revoada";
      JOptionPane.showMessageDialog(null, podeDirigir);   

     }
}
