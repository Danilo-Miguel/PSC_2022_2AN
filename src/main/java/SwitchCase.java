import javax.swing.JOptionPane;
public class SwitchCase {
        public static void main(String[]args){
        int nota;
        nota  = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota "));
        switch(nota){
            case 10:
                JOptionPane.showMessageDialog(null, "Parabéns Conceito A " + nota);
                break;
                
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito A " + nota);
                break;
                
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito B " + nota);
                break;
                
            case 7:
                JOptionPane.showMessageDialog(null, "Conceito C " + nota);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Reprovado " + nota);
                break;

                    
        }
        
        }
}
