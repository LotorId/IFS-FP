package atividades.vetores;

import java.util.Scanner;

public class e10e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Entre com o elemento da posicao " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < 10; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("");

        System.out.print("Vetor B: ");
        for (int i = 0; i < 10; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
