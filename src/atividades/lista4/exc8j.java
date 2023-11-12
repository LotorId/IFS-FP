package lista4;

import java.util.Scanner;

public class exc8j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number; double maior;

        System.out.println("Entre com um numero (digite -9999 para sair)");
        number = scanner.nextDouble();

        if (number != -9999) {
            maior = number;
            do {
                System.out.println("Entre com um numero (digite -9999 para sair)");
                number = scanner.nextDouble();

                if (number != 9999 && number > maior) {
                    maior = number;
                }

            } while (number != -9999);
            System.out.println("O maior numero digitado foi: " + maior);
        } else {
            System.out.println("Nao foi digitada nenhuma idade");
        }
    } // End
}
