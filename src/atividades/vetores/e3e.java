package atividades.vetores;

import java.util.Scanner;

public class e3e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < 15; i++){
            System.out.println("Entre com o elemento da posicao" + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < 15; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("");

        System.out.print("Vetor B: ");
        for (int i = 0; i < 15; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
