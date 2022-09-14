package Jogos;

import java.util.Random;
import java.util.Scanner;

public class apertadinho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        //Jogador Numero 1

        int num = gerador.nextInt(100);
        //System.out.println(num);

        System.out.println("Jogador1: Chute um numero (n) > 0 e < 100!!!");
        System.out.println("Entre com o palpite: ");
        int chute = ler.nextInt();
        int chutecont1 = 1;

        if (num == chute) {
            System.out.println("Jogador 1: Voce acertou o numero!!");
        } else {
            int maior = 100;
            int menor = 0;

            do {
                if (num < chute) {
                    maior = chute;
                    chutecont1++;
                }
                if (num > chute) {
                    menor = chute;
                    chutecont1++;
                }
                System.out.println("Seu numero esta entre " + menor + " e " + maior);
                System.out.println("Entre com o palapite: ");
                chute = ler.nextInt();
            } while (num != chute);
            System.out.println("Jogador 1: Voce acertou o numero!!");
            //System.out.println("A quantidade de chutes foi: " + chutecont1);
        }
        System.out.println("");
        //Jogador Numero 2

        num = gerador.nextInt(100);
        //System.out.println(num);

        System.out.println("Jogador2: Chute um numero (n) > 0 e < 100!!!");
        System.out.println("Entre com o palpite: ");
        chute = ler.nextInt();
        int chutecont2 = 1;

        if (num == chute) {
            System.out.println("Jogador 2: Voce acertou o numero!!");
        } else {
            int maior = 100;
            int menor = 0;

            do {
                if (num < chute) {
                    maior = chute;
                    chutecont2++;
                }
                if (num > chute) {
                    menor = chute;
                    chutecont2++;
                }
                System.out.println("Seu numero esta entre " + menor + " e " + maior);
                System.out.println("Entre com o palapite: ");
                chute = ler.nextInt();
            } while (num != chute);
            System.out.println("Jogador 2: Voce acertou o numero!!");
            //System.out.println("A quantidade de chutes foi: " + chutecont2);
        }
        System.out.println("");
        //Vencedor e Perdedor

        if (chutecont1 < chutecont2) {
            System.out.println("Vendedor: Jogador 1 - " + chutecont1 + " chutes!");
            System.out.println("Perdedor: Jogador 2 - " + chutecont2 + " chutes!");
        } else if (chutecont2 < chutecont1) {
            System.out.println("Vendedor: Jogador 2 - " + chutecont2 + " chutes!");
            System.out.println("Perdedor: Jogador 1 - " + chutecont1 + " chutes!");
        } else {
            System.out.println("Empate entre o Jogador 1 e o Jogador 2 - " + chutecont1 + " chutes");
        }
    }
}
