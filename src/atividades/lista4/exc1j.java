package lista4;

import java.util.Scanner;

public class exc1j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        do {
            System.out.println("Entre com um numero para descobrir seu triplo: ");
            number = scan.nextInt();

            if (number != 999) {
                System.out.println("O triplo do numero " + number + " e: " + (number * 3));
            }
        } while (number != -999);
    } // End
}