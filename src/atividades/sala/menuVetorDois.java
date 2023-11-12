package atividades.sala;
import java.util.Scanner;

public class menuVetorDois
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variaveis
        int[] vetorA = new int[50]; int[] vetorB = new int[50];
        int option = 2; int qtdVetorA = 0; int qtdVetorB = 0; int maiorA = 0; int maiorB = 0; int cont = 0;

        //Cod
        while (option != 9) {
            //Menu
            System.out.println("\n--------- MENU VETOR -----------");
            System.out.println("""
                    1 - Preencher Vetores | 2 - Listar Vetores | 3 - Gerar Vetor Multiplicacao:\s
                    4 - Gerar Vetor Intersecao | 5 - Gerar Vetor Uniao | 6 - Gerar Vetor Diferenca:\s
                    7 - Quantidade de Numeros Primos | 8 - Maior numero | 9 - Sair.""");
            option = input.nextInt();

            //In
            switch (option) {
                case 1: {
                    //Vetor A
                    System.out.println("Insira a quantidade de elementos para o vetor A (no máximo 50): ");
                    qtdVetorA = input.nextInt();
                    maiorA = 0;
                    for (int i = 0; i < qtdVetorA; i++) {
                        System.out.println("Insira o elemento " + i + " do vetor A");
                        vetorA[i] = input.nextInt();
                        if (vetorA[i] > maiorA) {
                            maiorA = vetorA[i];
                        }

                    }
                    //Vetor B
                    System.out.println("Insira a quantidade de elementos para o vetor B (no máximo 50): ");
                    qtdVetorB = input.nextInt();
                    maiorB = 0;
                    for (int i = 0; i < qtdVetorB; i++) {
                        System.out.println("Insira o elemento " + i + " do vetor B");
                        vetorB[i] = input.nextInt();
                        if (vetorB[i] > maiorB) {
                            maiorB = vetorB[i];
                        }
                    }
                    break;
                } case 2: {
                    //Vetor A
                    System.out.println("Vetor A: ");
                    for (int i = 0; i < qtdVetorA; i++){
                        System.out.print("| " + vetorA[i]);
                    }
                    System.out.println("");
                    //Vetor B
                    System.out.println("Vetor B: ");
                    for (int i = 0; i < qtdVetorB; i++){
                        System.out.print("| " + vetorB[i]);
                    }
                    System.out.println("");
                    //Vetor Multiplicacao
                    break;
                } case 3: {
                    int[] vetorMultiplicacao = new int[50];
                    if (qtdVetorA == qtdVetorB) {
                        System.out.println("Vetor Multiplicacao");
                        for (int i = 0; i < 50; i++) {
                            vetorMultiplicacao[i] = vetorA[i] * vetorB[i];
                            System.out.print("| " + vetorMultiplicacao[i]);
                        }
                    } else {
                        System.out.println("Os IFS.vetores A e B nao possuem a mesma quantidade de elementos!!");
                    }
                    break;
                } case 4: {
                    int[] vetorInteseccao = new int[50];
                    System.out.println("A interseccao dos IFS.vetores A e B e:");
                    for( int i=0; i < vetorA.length; i++) {
                        for(int j=0; j < vetorB.length; j++) {
                            if (vetorA[i] == vetorB[j]){
                                vetorInteseccao[j] = vetorA[i];
                                System.out.print("|  " + vetorInteseccao[j]);
                            }
                        }
                    }
                    break;
                } case 5: {
                    int[] vetorUniao = new int[100];
                    for(int i=0; i<vetorA.length; i++){
                        for(int j=0; j<vetorB.length; j++){
                            if(vetorA[i] != vetorB[j]){
                                vetorUniao[i] = vetorA[i];
                                System.out.print("| " + vetorUniao[i]);

                            }
                        }
                    }
                    break;
                } case 6: {
                    break;
                } case 7: {
                    //Primos A
                    int[] vetorPrimosA = new int[50];
                    int PA = 0;
                    for (int i = 0; i < qtdVetorA; i++) {
                        cont = 0;
                        for (int j = 1; j <= vetorA[i]; j++) {
                            if (vetorA[i] % j == 0) {
                                cont++;
                            }
                        } if (cont == 2) {
                            vetorPrimosA[PA] = vetorA[i];
                            PA++;
                        }
                    }

                    for (int i = 0; i < qtdVetorA; i++) {
                        System.out.print(" | " + vetorPrimosA[i]);
                    }
                    System.out.println("");

                    //Primos B
                    int[] vetorPrimosB = new int[50];
                    int PB = 0;
                    for (int i = 0; i < qtdVetorB; i++) {
                        cont = 0;
                        for (int j = 1; j <= vetorB[i]; j++) {
                            if (vetorB[i] % j == 0) {
                                cont++;
                            }
                        } if (cont == 2) {
                            vetorPrimosB[PB] = vetorB[i];
                            PB++;
                        }
                    }

                    for (int i = 0; i < qtdVetorB; i++) {
                        System.out.print(" | " + vetorPrimosB[i]);
                    }
                    break;
                } case 8: {
                    System.out.println("O maior numero do Vetor A e: " + maiorA);
                    System.out.println("O maior numero do Vetor B e: " + maiorB);
                    break;
                }
            } //Fim Switch

        } //Fim While

    } //Fim
}
