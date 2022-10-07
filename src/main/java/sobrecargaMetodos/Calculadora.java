/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaMetodos;

/**
 *
 * @author Samsung
 */
public class Calculadora {

    public int soma(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public float soma(float a, float b) {
        return a + b;
    }

    public String soma(String a, String b) {
        int numero1 = Integer.parseInt(a);
        int numero2 = Integer.parseInt(b);
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    
     public int soma(int a, String b) {
        return Integer.parseInt(b)+a; 
    }
     
     public int soma(String a, int b) {
        return Integer.parseInt(a)+b; 
    }
     
     
    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
}
