/*Construa um programa que leia 5 números inteiros e armazene em um vetor. Em
seguida, verifique e mostre uma mensagem indicando se o vetor está em ordem
crescente, decrescente ou não ordenado.*/

package atividades.vetores;

import java.util.Scanner;

public class exc_one {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int[] vetor = new int[5];

        do {
            System.out.println("ENTRE COM O " + cont + " VALOR DO VETOR: ");
            vetor[cont] = scan.nextInt();
            cont++;
        } while (cont < 5);

        int crescente = 1;
        int decrescente = 1;

        for (int i = 0; i < cont-1; i++){
            if (vetor[i] < vetor[i+1]){
                crescente++;
            } else {
                decrescente++;
            }
        }

        if (crescente == 5) {
            System.out.println("Vetor em ordem crescente!");
        } else if (decrescente == 5) {
            System.out.println("Vetor em ordem decrescente!");
        } else {
            System.out.println("Nao ordenado");
        }

    }
}
