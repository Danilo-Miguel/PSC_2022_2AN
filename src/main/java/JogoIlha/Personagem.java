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

    String nome;
    int energia = 4;
    int fome;
    int sono;

    /* Quando o personagem caça, ele gasta dois pontos de energia.
    Ele somente pode caçar caso tenha pelo menos dois pontos de energia
    Em qualquer caso, seus níveis de fome e sono sobem de um ponto.
     */
    void cacar() {
        if (energia >= 2) {
            System.out.println("O " + nome + " está caçando");
            energia -= 2;
        } else {
            System.out.println("Você não tem energia para caçar");
        }
        fome = fome + 1;
        sono = sono + 1;

    }

    /*
    Quando o personagem come, ele reduz de 1 ponto seu nível de fome.
    Além disso, seu nível de energia aumenta de 1.
    Ele somente come se tiver nível de fome maior ou igual a 1.
     */
    void comer() {
        if (fome >= 1) {
            energia += 1;
            System.out.println("O " + nome + " está comendo");
            fome -= 1;
        } else {
            System.out.println(nome + " sem fome");
        }
    }

    /*
    Quando o personagem dorme, ele reduz de 1 ponto seu nível de sono. 
    Além disso, seu nível de energia aumenta de 1. 
    Ele somente dorme se tiver nível de sono maior ou igual a 1.
     */
    void dormir() {
        if (sono >= 1) {
            energia += 1;
            System.out.println("O " + nome + " está dormindo");
            sono -= 1;

        }else{
            System.out.println(nome + " sem sono");

        }
    }
}
