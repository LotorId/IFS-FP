package ApostilaJoseMaria.EntradaSaida;

import java.util.Scanner;

public class es_exc8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a hora de entrada" );
        byte hi = ler.nextByte();
        System.out.println("Entre com o minuto de entrada" );
        byte mi = ler.nextByte();
        System.out.println("Entre com a hora de saida: " );
        byte hf = ler.nextByte();
        System.out.println("Entre com o minuto de saida" );
        byte mf = ler.nextByte();
        int tempo = ((hf * 60) + mf) - ((hi * 60) + mi);
        int hp = tempo / 60;
        int mp = tempo % 60;
        System.out.println("O tempo de permanencia do cliente foi de : " + hp + ":" + mp);
        
    }

}