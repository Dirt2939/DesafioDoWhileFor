/*
 * 1. Escreva um programa que exiba uma contagem regressiva de 100 a -100
 * utilizando um loop while.
 */
package desafio6;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;

        num = 100;

        while (num >= -100) {
            System.out.println(num);

            num--;
        }

    }

}
