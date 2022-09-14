package ApostilaJoseMaria.EntradaSaida;

import java.util.Scanner;

public class es_exc2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com os três coeficientes da equação de 2º grau: ");
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        double delta;
        delta = b*b - 4*a*c;
        System.out.println("O delta dos coeficientes digitados é: " + delta);

    }

}
