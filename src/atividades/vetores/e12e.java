package atividades.vetores;

import java.util.Scanner;

public class e12e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Entre com o elemento da posicao " + i);
            vetorA[i] = scan.nextInt();
            soma = soma + vetorA[i];
        }

        System.out.println("A soma dos numeros digitados no vetor e: " + soma);
    }
}
