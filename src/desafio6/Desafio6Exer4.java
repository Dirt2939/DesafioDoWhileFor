/*
 * 4. Escreva um programa que calcule o fatorial de um número fornecido pelo
 * usuário usando um loop do-while.
 */
package desafio6;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio6Exer4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numFator = 0, numFatorTotal = 0, num = 0;
        
        System.out.println("Digite um número: ");
        numFator = ler.nextInt();
        numFatorTotal = 1;
        num = numFator;
        
        do {
            
            numFatorTotal = numFatorTotal * num;
            
            num--;
        }
        while (num > 0);
        
        System.out.println("O fatorial de (!"+numFator+") é: "+numFatorTotal);
        
    }
}
