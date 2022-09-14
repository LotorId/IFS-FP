package ApostilaJoseMaria.EntradaSaida;

import java.util.Scanner;
public class es_exc5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o valor de compra do produto: ");
        double valorCompra = ler.nextDouble();
        System.out.println("Entre com o percentual de lucro: ");
        double porcentagem = ler.nextDouble();
        porcentagem = porcentagem / 100;
        double valorVenda = (valorCompra * porcentagem) + valorCompra;
        System.out.println("O valor de venda do produto e: " + valorVenda);
        
    }

}