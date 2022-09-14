package Provas;

import java.util.Scanner;

public class recuperacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int option = 0;
        int qtdVetor1 = 0; int qtdVetor2 = 0;
        int[] vetor1 = new int[0];
        int[] vetor2 = new int[0];

        do {
            System.out.println("Menu de opcoes:" +
                    "\n1. Inserir dois Vetores" +
                    "\n2. Listar Vetores" +
                    "\n3. Gerar Dois Maiores Numeros" +
                    "\n4. Gerar Vetor Repetido" +
                    "\n5. Gerar Vetor Diferenca" +
                    "\n6. Sair");
            option = scan.nextInt();

            switch (option){
                case 1: {
                    //QUANTIDADE VETOR 1
                    do {
                        System.out.println("Entre com a quantidade do vetor 1 (maximo 50)");
                        qtdVetor1 = scan.nextInt();
                    } while (qtdVetor1 < 1 || qtdVetor1 > 50);

                    vetor1 = new int[qtdVetor1];

                    for (int i = 0; i < qtdVetor1; i++){
                        System.out.println("Entre com o elemento " + i + " do vetor 1:");
                        vetor1[i] = scan.nextInt();
                    }

                    //QUANTIDADE VETOR 1
                    do {
                        System.out.println("Entre com a quantidade do vetor 2 (maximo 50)");
                        qtdVetor2 = scan.nextInt();
                    } while (qtdVetor2 < 1 || qtdVetor2 > 50);

                    vetor2 = new int[qtdVetor2];

                    for (int i = 0; i < qtdVetor2; i++){
                        System.out.println("Entre com o elemento " + i + " do vetor 2:");
                        vetor2[i] = scan.nextInt();
                    }

                    System.out.println("Vetor 1 e 2 registrados!!\n");
                    break;
                } case 2: {
                    //LISTAR VETOR 1
                    if (qtdVetor1 != 0){
                        System.out.print("Vetor 1: ");
                        for (int i = 0; i < qtdVetor1; i++){
                            System.out.print(vetor1[i] + " ");
                        }
                    } else {
                        System.out.println("VETOR 1 NAO POSSUI ELEMENTOS");
                    }

                    System.out.println("");
                    //LISTAR VETOR 2
                    if (qtdVetor2 != 0){
                        System.out.print("Vetor 2: ");
                        for (int i = 0; i < qtdVetor2; i++){
                            System.out.print(vetor2[i] + " ");
                        }
                    } else {
                        System.out.println("VETOR 2 NAO POSSUI ELEMENTOS");
                    }
                    System.out.println("");
                    break;
                } case 3: {
                    //MAIOR VETOR 1
                    int v1maior;
                    int v2maior;
                    if (vetor1[0] > vetor1[1])  {
                        v1maior = vetor1[0];
                        v2maior = vetor1[1];
                    }else {
                        v1maior = vetor1[1];
                        v2maior = vetor1[0];
                    }
                    for (int i=2; i < qtdVetor1; i++) {
                        if (vetor1[i] > v1maior) {
                            v2maior = v1maior;
                            v1maior = vetor1[i];
                        }else {
                            if (vetor1[i] > v2maior) {
                                v2maior = vetor1[i];
                            }
                        }
                    }
                    for (int i=0; i < qtdVetor2; i++){
                        if (vetor2[i] > v1maior) {
                            v2maior = v1maior;
                            v1maior = vetor2[i];
                        }else {
                            if (vetor2[i] > v2maior) {
                                v2maior = vetor2[i];
                            }
                        }
                    }
                    System.out.println("Os dois maiores números são: " + v1maior +  " e " + v2maior );
                    break;

                } case 4: {
                    int indice = 0;
                    int cont = 0;
                    int[] vetorRepetido = new int[qtdVetor1+qtdVetor2];

                    if (qtdVetor1 != 0 && qtdVetor2 != 0){
                        //REPETIDO VETOR 1
                        for (int i = 0; i < qtdVetor1; i++){
                            cont = 0;
                            for (int j = 0; j < qtdVetor1; j++){
                                if (vetor1[i] == vetor1[j]){
                                    cont++;
                                }
                            }
                            if (cont >= 2){
                                vetorRepetido[indice] = vetor1[i];
                                indice++;
                                }
                            }

                        //REPETIDO VETOR 2
                        for (int i = 0; i < qtdVetor2; i++){
                            cont = 0;
                            for (int j = 0; j < qtdVetor2; j++){
                                if (vetor2[i] == vetor2[j]){
                                    cont++;
                                }
                            }
                            if (cont >= 2){
                                vetorRepetido[indice] = vetor2[i];
                                indice++;
                            }
                        }

                        //GERANDO VETOR SEM REPETICAO
                        int[] vetorRepetido2 = new int[qtdVetor1+qtdVetor2];
                        int indice2 = 1;
                        int j = 0;
                        for(int i=0; i < indice ; i++){
                            boolean teste = false;
                            for(j=0; j < i; j++){
                                if(vetorRepetido[i] == vetorRepetido[j]){
                                    teste = true;
                                    break;
                                }
                            }

                            if(!teste){
                                vetorRepetido2[indice2] = vetorRepetido[j];
                                indice2++;
                            }
                        }

                        //IMPRIMINDO VETOR

                        for (int i = 0; i < (qtdVetor1+qtdVetor2); i++){
                            if (vetorRepetido2[i] > 0){
                                System.out.print(vetorRepetido2[i] + " ");
                            }
                        }

                        System.out.println("");

                    } else {
                        System.out.println("OS VETORES NAO POSSUEM ELEMENTOS PARA ANALISE!!");
                    }
                break;
                } case 5: {

                }
            } // FIM SWITCH
        } while (option != 6);
    } // FIM CODIGO
}
