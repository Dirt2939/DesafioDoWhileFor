/*
 * 3. Escreva um programa que solicite números ao usuário até que ele insira
 * zero e, em seguida, exiba a soma dos números digitados.
 */
package desafio6;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio6Exer3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 0, numC = 1, num2 = 0;

        while (numC != 0) {

            System.out.println("Digite um número: ");
            num = ler.nextInt();

            num2 = num2 + num;
            
            if (num == 0) {
                numC--;
            }
        }

        System.out.println("A soma dos números digitados é: " + num2);

    }

}
