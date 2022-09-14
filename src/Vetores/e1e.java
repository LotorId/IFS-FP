package Vetores;

import java.util.Scanner;

public class e1e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Entre com o valor da posicao" + i);
            vetorA[i] = scan.nextInt();
        }

        //PASSANDO VETOR A PARA B
        for (int i = 0; i < 5; i++){
            vetorB[i] = vetorA[i];
        }

        //MOSTRANDO VETOR A
        for (int i = 0; i < 5; i++){
            System.out.print(vetorA[i] + " ");
        }

        //MOSTRANDO VETOR B
        for (int i = 0; i < 5; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
