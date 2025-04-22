/*
 * 7. Escreva um programa que calcule a soma dos números ímpares de 1 a 200
 * utilizando um loop for. 
 */
package desafio6;

/**
 * @author Rafael
 */
public class Desafio6Exer7 {

    public static void main(String[] args) {
        int numImpar = 0;
        
        for (int num = 1; num <= 200; num++) {
            
            if (num % 2 != 0) {
                numImpar = numImpar + num;
            }
            
        }
        
        System.out.println("A soma dos números ímpares entre "
                + "1 e 200 é: "+numImpar);

        
    }
}
