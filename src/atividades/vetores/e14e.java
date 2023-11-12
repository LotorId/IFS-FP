package atividades.vetores;

import java.util.Scanner;

public class e14e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        int impares = 0;
        double qtdImpares = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Entre com o primeiro elemento da posicao " + i);
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 != 0){
                impares = impares + vetorA[i];
                qtdImpares++;
            }
        }

        System.out.println("A media aritmetica dos elementos impares do vetor e: " + (impares/qtdImpares));
    }
}
