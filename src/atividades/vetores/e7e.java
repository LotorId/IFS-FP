package atividades.vetores;

import java.util.Scanner;

public class e7e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Insira o elemento do vetor A na posicao " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Insira o elemento do vetor A na posicao " + i);
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.print("Vetor C: ");
        for (int i = 0; i < 10; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
