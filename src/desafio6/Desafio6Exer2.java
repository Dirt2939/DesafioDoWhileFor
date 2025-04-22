/*
 * 2. Escreva um programa que calcule a soma dos números pares de 1 a 20
 * utilizando um loop while.
 */
package desafio6;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio6Exer2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 1, numPar = 0;

        while (num <= 20) {

            if (num % 2 == 0) {
                numPar += num;
            }
            num++;
        }
            

        System.out.println("A soma dos números pares entre 1 a 20 é: "+numPar);

    }
}
