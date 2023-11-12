package atividades.vetores;

import java.util.Scanner;

public class e13e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] multiplos5 = new int[10];

        int ind = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Entre com o elemento na posicao " + i);
            int num = scan.nextInt();
            if (num % 5 == 0){
                multiplos5[ind] = num;
                ind++;
            }
        }

        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.print(multiplos5[i] + " ");
            soma = soma + multiplos5[i];
        }

        System.out.println("\nE a soma deles e: " + soma);
    }
}
