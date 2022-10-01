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
public class Jogo {

    public static void main(String args[]) throws InterruptedException {
        Personagem cacador = new Personagem();
        cacador.nome = "John";
        while(true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();
            System.out.println("=====================================");
            Thread.sleep(2000);

        }
    }

}
