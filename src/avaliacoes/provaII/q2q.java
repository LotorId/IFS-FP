package avaliacoes.provaII;

import java.util.Scanner;

public class q2q {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanho = 5;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];

        for (int i = 0; i < tamanho; i ++){
            System.out.println("Entre com a posicao " + i + " do vetor A");
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Vetor A preenchido!!");

        for (int i = 0; i < tamanho; i ++){
            System.out.println("Entre com a posicao " + i + " do vetor B");
            vetorB[i] = scan.nextInt();
        }

        System.out.println("Vetor B preenchido!!");

        int[] vetorAB = new int[tamanho];
        int indice = 0;

        for (int i = 0; i < tamanho; i++){
            int indVetorAB = 0;
            for (int j = 0; j < tamanho; j++){
                if (vetorA[i] == vetorB[j]){
                    indVetorAB++;
                }
            }
            if (indVetorAB == 0){
                vetorAB[indice] = vetorA[i];
                indice++;
            }
        }

        for (int i = 0; i < tamanho; i++){
            System.out.print(vetorAB[i]);
        }

        System.out.println("");

        int[] vetorAC = new int[tamanho];
        indice = 0;

        for (int i = 0; i < tamanho; i++){
            System.out.println("Entre com a posicao " + i + " do vetor C");
            vetorC[i] = scan.nextInt();
        }

        for (int i = 0; i < tamanho; i++){
            int indVetorAC = 0;
            for (int j = 0; j < tamanho; j++){
                if (vetorAB[i] == vetorC[j]){
                    indVetorAC++;
                }
            }
            if (indVetorAC == 0){
                vetorAC[indice] = vetorAB[i];
                indice++;
            }
        }

        for (int i = 0; i < tamanho; i++){
            System.out.print(vetorAC[i] + " ");
        }

    }
}
