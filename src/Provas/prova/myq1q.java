package Provas.prova;

import java.util.Scanner;

public class myq1q {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[20];

        int ind = 0;
        int num = 0;
        do {
            System.out.println("Entre com o elemento da posicao " + ind + " FLAG 0");
            num = scan.nextInt();
            if (num != 0){
                vetor[ind] = num;
                ind++;
            }
        } while (num != 0 && ind < 20);

        for (int i = 0; i < ind; i++){
            for (int j = 0; j < ind; j++){
                if (vetor[i] < vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for (int i = 0; i < ind; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
