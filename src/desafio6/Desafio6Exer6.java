/*
 * Escreva um programa que exiba a tabuada de multiplicação de um número
 * fornecido pelo usuário usando um loop for. Você deve informar o numero e de
 * quanto a quanto você quer fazer a tabuada por exemplo: tabuada do 2 de 1 a 20.
 */
package desafio6;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio6Exer6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual tabuada você quer? ");
        int numTabuada = ler.nextInt();

        System.out.println("Até quanto você quer sua tabuada? ");
        int numTabuadaLimite = ler.nextInt();

        for (int tabuada = 1; tabuada <= numTabuadaLimite; tabuada++) {
            int NUM_TABUADA = numTabuada * tabuada;
            System.out.println(numTabuada + " * " + tabuada + " = " + NUM_TABUADA);
        }

    }

}
