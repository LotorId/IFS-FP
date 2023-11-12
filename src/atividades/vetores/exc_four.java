/*Construir um programa que simula o lançamento de dois dados. O programa deve
usar um objeto da classe Random para lançar os dados. Como cada dado pode
mostrar um valor de 1 a 6, a soma dos dois dados varia de 2 a 12. O programa deve
lançar os dados tentativas vezes. Utilizar um vetor para guardar o número de vezes que
cada possível valor da soma ocorreu. Mostrar o valor da soma mais frequente e o
valor da soma menos frequente.*/

package atividades.vetores;

import java.util.Random;
import java.util.Scanner;

public class exc_four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        int tentativas = 25;

        //GERANDO DADO 1
        int[] dadoUm = new int[tentativas];
        for (int i = 0; i < tentativas; i++) {
            dadoUm[i] = (gerador.nextInt(6) + 1);
        }

        //GERANDO DADO 2
        int[] dadoDois = new int[tentativas];
        for (int i = 0; i < tentativas; i++) {
            dadoDois[i] = (gerador.nextInt(6) + 1);
        }

        //SOMANDO OS DADOS
        int[] dadoSoma = new int[tentativas];
        for (int i = 0; i < tentativas; i++) {
            dadoSoma[i] = dadoUm[i] + dadoDois[i];
        }

        //COMPARANDO O MAIS FREQUENTE
        int maisFtemp = 0;
        int contMaisF = 0;
        boolean ind = true;
        for (int i = 2; i <= 12; i++) {
            if (!ind) {
                break;
            }
            for (int j = 0; j < tentativas; j++) {
                if (dadoSoma[j] == i && ind) {
                    maisFtemp = i;
                    contMaisF++;
                    ind = false;
                } else {
                    if (dadoSoma[j] == maisFtemp && !ind){
                        contMaisF++;
                    }
                }
            }
        }

        for (int i = (maisFtemp + 1); i <= 12; i++) {
            int contMaisFaux = 0;
            for (int j = 0; j < tentativas; j++){
                if (dadoSoma[j] == i) {
                    contMaisFaux++;
                }
            }

            if (contMaisFaux > contMaisF) {
                maisFtemp = i;
            }
        }
        /*
        //COMPARANDO O MENOS FREQUENTE
        int menosFtemp = 0;
        int contMenosF = 0;
        ind = true;
        for (int i = 2; i <= 12; i++) {
            for (int j = 0; j < tentativas; j++) {
                if (!ind){
                break;
                }
                if (dadoSoma[j] == i && ind) {
                    menosFtemp = i;
                    contMenosF++;
                    ind = false;
                } else {
                    if (dadoSoma[j] == menosFtemp && !ind){
                        contMenosF++;
                    }
                }
            }

        }

        for (int i = (menosFtemp + 1); i <= 12; i++) {
            int contMenosFaux = 0;
            for (int j = 0; j < tentativas; j++){
                if (dadoSoma[j] == i) {
                    contMenosFaux++;
                }
            }

            if (contMenosFaux < contMenosF) {
                menosFtemp = i;
            }
        }
        */

        System.out.println("O valor mais frequente foi: " + maisFtemp);
        /*System.out.println("O valor menos frequente foi: " + menosFtemp);*/
    }// FIM CODIGO
}
