package lista4;

import java.util.Scanner;

public class exc6j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        do {
            System.out.println("Entre com um numero para saber seus divisores (digite -999 para sair): ");
            number = scan.nextInt();

            if (number != -999) {
                System.out.println("Estes numeros sao divisores de " + number);
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.print(i +" | ");
                    }
                }
                System.out.println("");
            }

        } while (number != -999);
    } //End
}
