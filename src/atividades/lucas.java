package atividades;

import java.util.Scanner;

public class lucas {
    /*
     * criar uma urna, segundo turno:
     * candidatos: 83 Alibabá e 93 Alcapone / 0 branco / votos diferentes é nulo
     * flag -1
     * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0; // Alibabá
        int y = 0; // Alcapone
        int z = 0; // Branco
        int w = 0; // Nulo
        String k = ""; // nº vencedor
        double a = 0; // % Alibabá
        double b = 0; // % Alcapone
        double voto = 0;

        do {

            System.out.println("Insira seu voto");
            System.out.println("83 - Alibaba | " +
                    "93 - Alcapone | " +
                    "0 - Branco | " +
                    "Outro n - Nulo");

            voto = input.nextInt();

            if (voto == 83) {
                x++;
            }
            else if (voto == 93) {
                y++;
            }
            else if (voto == 0) {
                z++;
            }
            else if (voto != -1) {
                w++;
            }

        } while (voto != -1);

        // desempate de votos
        while (x == y) {
            System.out.println("Os votos de Alibaba e Alcapone nao podem ser iguais");
            System.out.println("Insira o voto de desempate");
            voto = input.nextInt();

            if (voto == 83) {
                x++;
            }
            if (voto == 93) {
                y++;
            }
        }

        // vencedor
        if (x + y + z > 1 && x + y + z < 100000000) {

            a = x / (x + y + z + 0.0); // porcentagem alibaba
            b = y / (x + y + z + 0.0); // porcentagem alcapone

            if (x > y) {
                k = "Alibaba";
            }
            else {
                k = "Alcapone";
            }

            System.out.println("Votos Alibaba: " + x);
            System.out.println("Votos Alcapone: " + y);
            System.out.println("Votos Brancos: " + z);
            System.out.println("Votos Nulos: " + w);
            System.out.println("Vencedor: " + k);
            System.out.printf("porc Alibaba: %.2f%n", a);
            System.out.printf("porc Alcapone: %.2f%n", b);

        }
        else if (x + y + z >= 100000000) {
            System.out.println("A quatidade de pontos não pode ser maior ou igual a cem milhoes");
        }
        else {
            System.out.println("Nao há pontos suficientes para contabilizar");
        }
     }
}
