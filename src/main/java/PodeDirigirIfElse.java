
import javax.swing.JOptionPane;


public class PodeDirigirIfElse {
     public static void main(String[]args){
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
      String podeDirigir;
      if(idade >= 18)
          
          podeDirigir  =  "Você já pode dirigir, vá com cuidado "; 
      else
          podeDirigir  =  "Você não pode dirigir ainda, vá de metro "; 
          
      JOptionPane.showMessageDialog(null, podeDirigir);   
    }
}
