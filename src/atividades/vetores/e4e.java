package atividades.vetores;

import java.util.Scanner;

public class e4e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for (int i = 0; i < 15; i++){
            System.out.println("Entre com o elemento na posicao " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.pow(vetorA[i], 0.5);
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
