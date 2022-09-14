package ApostilaJoseMaria.EntradaSaida;

import java.util.Scanner;

public class es_exc3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com os dois catetos do triangulo retangulo: ");
        int c1 = ler.nextInt();
        int c2 = ler.nextInt();
        double hipotenusa;
        hipotenusa = (c1*c1) + (c2*c2);
        hipotenusa = Math.pow(hipotenusa,0.5);
        System.out.println("A hipotenusa deste triangulo retangulo e: " + hipotenusa);

    }

}
