package Provas;

import java.util.Scanner;

public class recuperacaoMarlon {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = 0; int qtdVetor1 = 0; int qtdVetor2 = 0;
        int[] vetor1 = new int[0]; int[] vetor2 = new int[0];
        do {
            System.out.println("Menu de opcoes:" +
                    "\n1. Inserir dois Vetores" +
                    "\n2. Listar IFS.vetores" +
                    "\n3. Gerar dois maiores numeros" +
                    "\n4. Gerar vetor repetido" +
                    "\n5. Gerar vetor diferenca" +
                    "\n6. Sair");
            opcao = leia.nextInt();
            switch (opcao){
                case 1: {
                    do {
                        System.out.println("Entre com a quantidade do vetor 1 - MAX 50");
                        qtdVetor1 = leia.nextInt();
                    } while (qtdVetor1 < 1 || qtdVetor1 > 50);

                    vetor1 = new int[qtdVetor1];

                    for (int i = 0; i < qtdVetor1; i++){
                        System.out.println("Entre com o elemento " + i + " do vetor 1:");
                        vetor1[i] = leia.nextInt();
                    }
                    
                    do {
                        System.out.println("Entre com a quantidade do vetor 2 - MAX 50");
                        qtdVetor2 = leia.nextInt();
                    } while (qtdVetor2 < 1 || qtdVetor2 > 50);

                    vetor2 = new int[qtdVetor2];

                    for (int i = 0; i < qtdVetor2; i++){
                        System.out.println("Entre com o elemento " + i + " do vetor 2:");
                        vetor2[i] = leia.nextInt();
                    }

                    System.out.println("Vetor 1 e 2 registrados!!\n");
                    break;
                } case 2: {
                    if (qtdVetor1 != 0){
                        System.out.print("Vetor 1: ");
                        for (int i = 0; i < qtdVetor1; i++){
                            System.out.print(vetor1[i] + " ");
                        }
                    } else {
                        System.out.println("vetor 1 nao tem numeros");
                    }

                    System.out.println("");
                    if (qtdVetor2 != 0){
                        System.out.print("Vetor 2: ");
                        for (int i = 0; i < qtdVetor2; i++){
                            System.out.print(vetor2[i] + " ");
                        }
                    } else {
                        System.out.println("vetor 2 nao tem numeros");
                    }
                    System.out.println("");
                    break;
                } case 3: {
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
                    int[] vetRep = new int[qtdVetor1+qtdVetor2];

                    if (qtdVetor1 != 0 && qtdVetor2 != 0){
                        for (int i = 0; i < qtdVetor1; i++){
                            cont = 0;
                            for (int j = 0; j < qtdVetor1; j++){
                                if (vetor1[i] == vetor1[j]){
                                    cont++;
                                }
                            }
                            if (cont >= 2){
                                vetRep[indice] = vetor1[i];
                                indice++;
                            }
                        }
                        
                        for (int i = 0; i < qtdVetor2; i++){
                            cont = 0;
                            for (int j = 0; j < qtdVetor2; j++){
                                if (vetor2[i] == vetor2[j]){
                                    cont++;
                                }
                            }
                            if (cont >= 2){
                                vetRep[indice] = vetor2[i];
                                indice++;
                            }
                        }
                        
                        int[] vetRep2 = new int[qtdVetor1+qtdVetor2];
                        int indice2 = 1;
                        int j = 0;
                        for(int i=0; i < indice ; i++){
                            boolean teste = false;
                            for(j=0; j < i; j++){
                                if(vetRep[i] == vetRep[j]){
                                    teste = true;
                                    break;
                                }
                            }

                            if(!teste){
                                vetRep2[indice2] = vetRep[j];
                                indice2++;
                            }
                        }
                        

                        for (int i = 0; i < (qtdVetor1+qtdVetor2); i++){
                            if (vetRep2[i] > 0){
                                System.out.print(vetRep2[i] + " ");
                            }
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Nao e possivel realizar a acao");
                    }
                    break;
                } case 5: {

                }
            }
        } while (opcao != 6);
    }
}
