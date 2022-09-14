package Sala;

import java.util.Scanner;

public class menuVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[100];
        int[] primos = new int[100];
        int n = 0; int option; int maior = 0; int cont;

        do {
            System.out.println("\n----------------------");
            System.out.println("----- MENU VETOR -----");
            System.out.println("---------------------- \n");

            System.out.println("1 - Para Inserir valores no vetor!");
            System.out.println("2 - Para mostrar os valores do vetor");
            System.out.println("3 - Para mostrar o maior valor inserido no vetor");
            System.out.println("4 - Para mostrar os números primos inseridos no vetor");
            System.out.println("5 - Para sair");
            System.out.println("\nDigite a opcao desejada: ");
            option = scan.nextInt();

            switch (option) {
                case 1: {
                    //Adicionar elementos no vetor

                    System.out.println("Quantos elementos deseja preencher o vetor? (n < 100): ");
                    n = scan.nextInt();


                    for (int i = 0; i < n; i++) {
                        System.out.println("\nDigite o elemento " + i + " do vetor");
                        vetor[i] = scan.nextInt();

                        if (vetor[i] > maior) {
                            maior = vetor[i];
                        }
                    } break;

                } case 2: {
                    //Mostrar elementos do vetor

                    if (n > 0) {
                        for (int i = 0; i < n; i++) {
                            System.out.print(" | " + vetor[i]);
                        }
                        System.out.println("");
                    } else {
                        System.out.println("O vetor não possui nenhum valor para ser mostrado");
                    } break;

                } case 3: {
                    //Para listar o maior elemento do vetor
                    if (maior > 0) {
                        System.out.println("O maior elemento do vetor e: " + maior);
                    } else {
                        System.out.println("O vetor não possui nenhum valor para ser mostrado");
                    }
                    break;
                } case 4: {
                    //Numeros primos
                    int iv = 0;

                    for (int i = 0; i < n; i++) {
                        cont = 0;
                        for (int j = 1; j <= vetor[i]; j++) {
                            if (vetor[i] % j == 0) {
                                cont++;
                            }
                        } if (cont == 2) {
                            primos[iv] = vetor[i];
                            iv++;
                        }
                    }

                    for (int k = 0; k < n; k++) {
                        System.out.print(" | " + primos[k]);
                    }
                    break;

                } case 5: {
                    //Sair
                    break;
                }
            }
        } while (option != 5);

        //Fim.
    }
}
