package LivroDeNotas;

import javax.swing.JOptionPane;


public class LivroDeNotas {

    private String nomeDoCurso;
    private String nomeProfessor;
    private String nomeAluno;

    private double nota1, nota2, nota3, notaFinal;

    public LivroDeNotas(String nomeDoCurso, String nomeProfessor, String nomeAluno) {
        this.nomeDoCurso = nomeDoCurso;
        this.nomeProfessor = nomeProfessor;
        this.nomeAluno = nomeAluno;
    }

    public void exibirMensagem() {
        JOptionPane.showMessageDialog(null, "Bem vindo Professor " + getNomeProfessor() + " ao livro de notas do curso " + nomeDoCurso);
    }

    public void cadastrarNota() {
        setNotaFinal(getNota1() + getNota2() + getNota3());
        JOptionPane.showMessageDialog(null, "Nota cadastrada com sucesso!");

    }

    public void exibirNota() {
        JOptionPane.showMessageDialog(null, " A nota do aluno é: " + getNotaFinal());
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    /**
     * @return the nomeProfessor
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    /**
     * @param nomeProfessor the nomeProfessor to set
     */
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the notaFinal
     */
    public double getNotaFinal() {
        return notaFinal;
    }

    /**
     * @param notaFinal the notaFinal to set
     */
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

}
