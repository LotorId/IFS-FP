package Vetores;

import java.io.FileOutputStream;
import java.util.Scanner;

public class e2e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        //REGISTRANDO VALORES
        for (int i = 0; i < 8; i++){
            System.out.println("Entre com a posicao " + i);
            vetorA[i] = scan.nextInt();
        }

        //RESGISTRANDO VETOR B
        for (int i = 0; i < 8; i++) {
            vetorB[i] = (vetorA[i] * 2);
        }

        //MOSTRANDO VETOR B
        for (int i = 0; i < 8; i++){
            System.out.print(vetorB[i] +" ");
        }
    }
}
