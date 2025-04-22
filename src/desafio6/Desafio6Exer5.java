/*
 * 5. Escreva um programa que implemente um jogo de adivinhação onde o usuário
deve adivinhar um número entre 1 e 100, utilizando um loop do-while para
repetir até que o usuário acerte o número. O numero da sorte deverá ser
randomizado pelo computador, pesquise como funciona a biblioteca
Math.random()
 */
package desafio6;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio6Exer5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int numSorte, num;
        boolean acertou = false;

        do {
            System.out.println("Adivinhe o número: ");
            num = ler.nextInt();

            numSorte = 1 + (int) (Math.random() * 100);
            System.out.println(numSorte);

            if (num == numSorte) {
                acertou = true;
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu"
                        + ", o número era: " + numSorte);
            }
        } while (!acertou);

    }
}
