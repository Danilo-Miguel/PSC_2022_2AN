/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoIlha;

/**
 *
 * @author Samsung
 */

/*
Os valores para energia, fome e sono vão de 0 a 10.
O personagem começa com o máximo de energia, sem fome e sem sono
 */
public class Personagem {

    private String nome;
    private int energia = 10;
    private int fome;
    private int sono;

    public Personagem(String nome, int energia, int fome, int sono) {
        if (energia >= 0 && energia <= 10) 
            this.energia = energia;
        
        if (energia >= 0 && energia <= 10) 
            this.fome = fome;
        
        if (energia >= 0 && energia <= 10) 
            this.sono = sono;
     
            this.nome = nome;
    }

    /* Quando o personagem caça, ele gasta dois pontos de energia.
    Ele somente pode caçar caso tenha pelo menos dois pontos de energia
    Em qualquer caso, seus níveis de fome e sono sobem de um ponto.
     */
    void cacar() {
        if (getEnergia() >= 2) {
            System.out.println("O " + getNome() + " está caçando");
            setEnergia(getEnergia() - 2);
        } else {
            System.out.println("Você não tem energia para caçar");
        }
        setFome(getFome() + 1);
        setSono(getSono() + 1);

    }

    /*
    Quando o personagem come, ele reduz de 1 ponto seu nível de fome.
    Além disso, seu nível de energia aumenta de 1.
    Ele somente come se tiver nível de fome maior ou igual a 1.
     */
    void comer() {
        if (getFome() >= 1) {
            setEnergia(getEnergia() + 1);
            System.out.println("O " + getNome() + " está comendo");
            setFome(getFome() - 1);
        } else {
            System.out.println(getNome() + " sem fome");
        }
    }

    /*
    Quando o personagem dorme, ele reduz de 1 ponto seu nível de sono. 
    Além disso, seu nível de energia aumenta de 1. 
    Ele somente dorme se tiver nível de sono maior ou igual a 1.
     */
    void dormir() {
        if (getSono() >= 1) {
            setEnergia(getEnergia() + 1);
            System.out.println("O " + getNome() + " está dormindo");
            setSono(getSono() - 1);

        } else {
            System.out.println(getNome() + " sem sono");

        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * @return the fome
     */
    public int getFome() {
        return fome;
    }

    /**
     * @param fome the fome to set
     */
    public void setFome(int fome) {
        this.fome = fome;
    }

    /**
     * @return the sono
     */
    public int getSono() {
        return sono;
    }

    /**
     * @param sono the sono to set
     */
    public void setSono(int sono) {
        this.sono = sono;
    }
}
