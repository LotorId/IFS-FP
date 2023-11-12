package lista4;

import java.util.Scanner;

public class exc3j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number; int qtdNumber = 0;
        double soma = 0;

        do {
            System.out.println("Entre com numeros para calcular a media (para sair digite uma valor negativo): ");
            number = scan.nextInt();

            if (number >= 0) {
                soma = soma + number;
                qtdNumber++;
            }

        } while (number >= 0);

        System.out.println("A media dos numeros digitados e: " + (soma / qtdNumber));
    }
}
