package atividades.apostilaJoseMaria.EntradaSaida;

import java.util.Scanner;

public class es_exc6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro para A" );
        int A = ler.nextInt();
        System.out.println("Entre com um numero inteiro para B: ");
        int B = ler.nextInt();
        int temp = A;
        A = B;
        B = temp;
        System.out.println("Agora o valor de A e: " + A + "\ne o valor de B e: " + B);
        
    }

}