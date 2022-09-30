package LivroDeNotas;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {

    public static void main(String[] args) {

        String nomeDoCurso = JOptionPane.showInputDialog("Qual o nome do curso Professor?");
        String nomeProfessor = JOptionPane.showInputDialog("Qual o nome do Professor?");
        String aluno = JOptionPane.showInputDialog("Qual o nome do Aluno?");

        LivroDeNotas livroDeNotas = new LivroDeNotas(nomeDoCurso, nomeProfessor, aluno);

        livroDeNotas.exibirMensagem();

        //String nomeDoCurso1 = JOptionPane.showInputDialog("Qual o nome do curso Professor?");
        // String nomeProfessor1 = JOptionPane.showInputDialog("Qual o nome do Professor?");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da A1"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("igite a nota da A2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("igite a nota da A3"));

        //LivroDeNotas livroDeNotas1 = new LivroDeNotas(nomeDoCurso1, nomeProfessor1);
        livroDeNotas.setNota1(nota1);
        livroDeNotas.setNota2(nota2);
        livroDeNotas.setNota3(nota3);

        livroDeNotas.cadastrarNota();
        livroDeNotas.exibirNota();

    }

}
