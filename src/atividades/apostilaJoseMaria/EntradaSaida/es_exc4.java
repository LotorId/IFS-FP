package atividades.apostilaJoseMaria.EntradaSaida;

import java.util.Scanner;

public class es_exc4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius: ");
        double celsius = ler.nextDouble();
        double farenheit;
        farenheit = ((180 * celsius ) / 100) + 32;
        System.out.println("A hipotenusa deste triangulo retangulo e: " + farenheit + "ºF");

    }

}
