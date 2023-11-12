package lista4;

import java.util.Scanner;

public class exc9j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number; double menor;

        System.out.println("Entre com um numero (digite -9999 para sair)");
        number = scanner.nextDouble();

        if (number != -9999) {
            menor = number;
            do {
                System.out.println("Entre com um numero (digite -9999 para sair)");
                number = scanner.nextDouble();

                if (number != 9999 && number < menor) {
                    menor = number;
                }

            } while (number != -9999);
            System.out.println("O menor numero digitado foi: " + menor);
        } else {
            System.out.println("Nao foi digitada nenhuma idade");
        }
    }
}
