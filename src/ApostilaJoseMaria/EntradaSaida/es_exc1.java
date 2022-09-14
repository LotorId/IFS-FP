package ApostilaJoseMaria.EntradaSaida;

import java.util.Scanner;

public class es_exc1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva os três números para calcular a média: ");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        double media;
        media = (n1 + n2 + n3) / 3.0;
        System.out.println("A média dos números digitados é: " + media);

    }

}
