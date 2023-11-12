package atividades.apostilaJoseMaria.Repeticao;

import java.util.Scanner;

public class exc_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com a quatidade de valores para determinar qual foi o maior inserido: ");
        int qtd = input.nextInt();

        if (qtd > 0) {
            System.out.println("Entre com um numero: ");
            int maior = input.nextInt();
            for (int i = 1; i <= (qtd - 1); i++) {
                System.out.println("Entre com um numero: ");
                int n = input.nextInt();
                if (n > maior) {
                    maior = n;
                }
            }
            System.out.println("O maior numero digitado foi: " + maior);
        } else {
            System.out.println("Nao houveram numeros a serem lidos!!");
        }
    }
}
