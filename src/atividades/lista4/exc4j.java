package lista4;

import java.util.Scanner;

public class exc4j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number; int qtdNumber = 0;

        do {
            System.out.println("Entre com um numero (para sair digite um numero negativo): ");
            number = scan.nextInt();

            if (number >= 100 && number <= 200) {
                qtdNumber++;
                System.out.println( qtdNumber + " numero(s) entre 100 e 200 foram digitados!");
            }
        } while (number >= 0);

        System.out.println( qtdNumber + " numero(s) entre 100 e 200 foram digitados!");
    } // End
}
