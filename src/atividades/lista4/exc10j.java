package lista4;

import java.util.Scanner;

public class exc10j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base; double altura; double raio; double Pi = 3.14;
        char option;

        do {
            System.out.println("A - Calcular a area do quadrado\n" +
                    "B - Calcular a area do triangulo\n" +
                    "C - Calcular a area do circulo\n" +
                    "F - Finalizar algoritmo");
            option = scan.next().charAt(0);

            switch (option) {
                case 'A' | 'a': {
                    System.out.println("Insira a base do quadrado: ");
                    base = scan.nextDouble();
                    System.out.println("A area do quadrado e: " + (base * base));
                    break;
                } case 'B' | 'b': {
                    System.out.println("Insira a base do triangulo: ");
                    base = scan.nextDouble();
                    System.out.println("Insira a altura do triangulo: ");
                    altura = scan.nextDouble();
                    System.out.println("A area do triangulo e: " + (base*altura/2));
                    break;
                } case 'C' | 'c': {
                    System.out.println("Insira o raio do circulo para calcular: ");
                    raio = scan.nextDouble();
                    System.out.println("A area do circulo e:" + (Pi * Math.pow(raio, 2)));
                    break;
                }
            }
        } while (option != 'f');
    }
}
