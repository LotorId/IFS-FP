/*A coordenação do curso de Sistemas de Informação do IFS deseja saber quantos
alunos estão cursando ao mesmo tempo as disciplinas de Programação I e
Programação II. Faça um programa que leia os códigos de matrícula dos alunos de
ambas as disciplinas e imprima os códigos de matrículas dos alunos que estão
cursando as duas disciplinas ao mesmo tempo. A quantidade de alunos de cada
disciplina deve ser informada pelo usuário.*/

package atividades.vetores;

import java.util.Scanner;

public class exc_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ARMAZENANDO ALUNOS DE PROGRAMACAO I
        System.out.println("ENTRE COM A QUANTIDADE DE ALUNOS QUE ESTUDAM PROGRAMACAO I");
        int qtdProgramacaoI = scan.nextInt();
        int[] vetorProgramacaoI = new int[qtdProgramacaoI];

        for (int i = 0; i < qtdProgramacaoI; i++) {
            System.out.println("ENTRE COM O CODIGO DE MATRICULA DO " + (i+1) + " ALUNO DE PROGRAMACAO I");
            vetorProgramacaoI[i] = scan.nextInt();
        }

        //ARMAZENANDO ALUNOS DE PROGRAMACAO II
        System.out.println("ENTRE COM A QUANTIDADE DE ALUNOS QUE ESTUDAM PROGRAMACAO II");
        int qtdProgramacaoII = scan.nextInt();
        int[] vetorProgramacaoII = new int[qtdProgramacaoII];

        for (int i = 0; i < qtdProgramacaoII; i++) {
            System.out.println("ENTRE COM O CODIGO DE MATRICULA DO " + (i+1) + " ALUNO DE PROGRAMACAO II");
            vetorProgramacaoII[i] = scan.nextInt();
        }

        //COMPARACOES DE MATRICULA
        int qtdAmbas = qtdProgramacaoI + qtdProgramacaoII;
        int[] ambas = new int[qtdAmbas];
        int indice = 0;

        for (int i = 0; i < qtdProgramacaoI; i++) {
            for (int j = 0; j < qtdProgramacaoII; j++) {
                if (vetorProgramacaoI[i] == vetorProgramacaoII[j]){
                    ambas[indice] = vetorProgramacaoI[i];
                    indice++;
                }
            }
        }

        //APRESENTANDO AS MATRICULAS
        System.out.println("As matriculas a seguir cursam Programacao I e II");
        for (int i = 0; i < qtdAmbas; i++) {
            System.out.print(ambas[i] + "| ");
        }

    }// FIM CODIGO
}
