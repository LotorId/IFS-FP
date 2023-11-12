package lista4;

import java.util.Scanner;

public class exc2j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number; int qtdNumber = 0;

        do {
            System.out.println("Entre com um numero (para sair digite um numero negativo): ");
            number = scan.nextInt();

            if (number >= 0) {
                qtdNumber++;
                System.out.println("A quantidade de numeros digitados ate o momento foram: " + qtdNumber);
            }
        } while (number >= 0);
    }
}
