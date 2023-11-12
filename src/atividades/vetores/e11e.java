package atividades.vetores;

import java.util.Scanner;

public class e11e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorPares = new int[10];

        int ind = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Entre com o elemento da posicao " + i);
            int num = scan.nextInt();
            if (num % 2 == 0){
                vetorPares[ind] = num;
                ind++;
            }
        }

        System.out.println("Os elementos pares digitados foram:");
        for (int i = 0; i < 10; i++){
            System.out.print(vetorPares[i] + " ");
        }
    }
}
