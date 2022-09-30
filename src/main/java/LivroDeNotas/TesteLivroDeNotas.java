
import javax.swing.JOptionPane;

public class TesteLivroDeNotas {

    public static void main(String[] args) {
        String nomeDoCurso = JOptionPane.showInputDialog("Qual o nome do curso Professor?");
        String nomeProfessor = JOptionPane.showInputDialog("Qual o nome do Professor?");
        String nomeDoCurso1 = JOptionPane.showInputDialog("Qual o nome do curso Professor?");
        String nomeProfessor1 = JOptionPane.showInputDialog("Qual o nome do Professor?");

        LivroDeNotas livroDeNotas = new LivroDeNotas(nomeDoCurso, nomeProfessor);
        LivroDeNotas livroDeNotas1 = new LivroDeNotas(nomeDoCurso1, nomeProfessor1);

        livroDeNotas.exibirMensagem();

    }

}
