import javax.swing.JOptionPane;

public class LivroDeNotas {
    
    private String nomeDoCurso;
    private String nomeProfessor;
    
   public LivroDeNotas(String nomeDoCurso, String nomeProfessor){
       this.nomeDoCurso = nomeDoCurso;
       this.nomeProfessor = nomeProfessor;  
   }
  
    public void exibirMensagem(){
        JOptionPane.showMessageDialog(null, "Bem vindo Professor " + getNomeProfessor() + " ao livro de notas do curso " + nomeDoCurso);
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
      
}
