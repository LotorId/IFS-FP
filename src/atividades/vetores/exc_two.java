/*Faça um programa que leia 10 números inteiros e armazene em um vetor. Em
seguida, leia um número X. Verifique e mostre uma mensagem indicando quantos
números do vetor são maiores que X, menores que X e iguais a X.
Exemplos:
numeros[10] = {2, 10, 5, 6, 15, 3, 9, 5, 1, 8}
X = 5 -> Mensagem: “5 são maiores, 3 são menores e 2 são iguais”
X = 7 -> Mensagem: “4 são maiores, 6 são menores e 0 são iguais”*/

package atividades.vetores;

import java.util.Scanner;

public class exc_two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        int[] vetor = new int[10];

        do {
            System.out.println("ENTRE COM O " + cont + " ELEMENTO DO VETOR");
            vetor[cont] = scan.nextInt();
            cont++;
        } while (cont < 10);

        for (int i = 0; i < cont; i++) {
            System.out.print(vetor[i] + "| ");
        }

        System.out.println("Insira um número para realizar as comparacoes!");
        int numero = scan.nextInt();
        int maior = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 0; i < cont; i++) {
            if (vetor[i] > numero) {
                maior++;
            } else if (vetor[i] < numero) {
                menor++;
            } else {
                igual++;
            }
        }

        System.out.println("X = " + numero + " -> " + maior + " SAO MAIORES, " + menor + " SAO MENORES, " + igual + " SAO IGUAIS");
    }
}
