package lista4;

import java.util.Scanner;

public class exc7j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number; int menos21 = 0; int mais50 = 0;

        while (true) {
            System.out.println("Ola pessoa, entre com sua idade: ");
            number = scan.nextInt();

            if (number < 21) {
                menos21++;
            }

            if (number > 50) {
                mais50++;
            }

            System.out.println("obrigado pela pesquisa :)");
            System.out.println("Ha " + menos21 + " pessoas menos que 21 anos" +
                    " e ha " + mais50 + " pessoas maiores que 50 anos");
        }
    } //End
}
