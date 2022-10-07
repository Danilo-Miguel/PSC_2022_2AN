/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoIlha;

import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class Jogo {

    public static void main(String args[]) throws InterruptedException {
        
        String personagem = JOptionPane.showInputDialog("Insira o nome do Personagem");
        
        Personagem cacador = new Personagem(personagem,10,0,0);
        Personagem soneca = new Personagem("Douglas",2,6,4);
        Personagem faminto = new Personagem("Soneca",2,6,4);

        
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
