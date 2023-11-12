package atividades.sala;
import java.util.Scanner;

public class e4e {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = entrada.nextInt();
        System.out.println("sua opinião em relação ao filme, segundo as seguintes notas:\n" +
                "A- Ótimo" +
                "B- Bom" +
                "C- Regular" +
                "D- Ruim" +
                "E- Péssimo");
        String resposta = entrada.next();
        int contador = 0;
        int quantA = 0;
        int quantB = 0;
        int quantC = 0;
        int quantD = 0;
        int quantE = 0;
        int somaidade = 0;
        int mediapessimo = 0;
        int maioridadeotimo = idade;
        int menoridaderuim = idade;
        double percentual = 0;

        for (int i = 0; i < 4; i++) {
            contador++;
        }
        if (idade > 12 && idade < 90 && contador!=0) {
            somaidade += idade;
            idade = entrada.nextInt();
            resposta = entrada.next();
        }else{
            System.out.println("Idade inválida");
        }
            if (resposta.equals("A")) {
                quantA++;
                percentual = ((double) quantA / (double) contador) * 100;
                if (idade>maioridadeotimo){
                    maioridadeotimo=idade;
                }
            }else {
                System.out.println("Resposta inválida");
            }
            if (resposta.equals("B")) {
                quantB++;
                percentual = ((double) quantB / (double) contador) * 100;
            }else {
                System.out.println("Resposta inválida");
            }
            if (resposta.equals("C")) {
                quantC++;
                percentual = ((double) quantC / (double) contador) * 100;
            }else {
                System.out.println("Resposta inválida");
            }
            if (resposta.equals("D")) {
                quantD++;
                percentual = ((double) quantD / (double) contador) * 100;
                if (idade>menoridaderuim){
                    menoridaderuim=idade;
                }
            }else {
                System.out.println("Resposta inválida");
            }
            if (resposta.equals("E")) {
                quantE++;
                percentual = ((double) quantE / (double) contador) * 100;
                mediapessimo = quantE/contador;
            }else {
                System.out.println("Resposta inválida");
            }
        double mediaidadepublico = (double) somaidade/(double)contador;
        System.out.println("A quantidade de cada tipo de resposta: \n A: "+quantA+" \nB: "+quantB+" \nC: "+quantC+" \nD: "+quantD+" \nE: "+quantE);
        System.out.println("O percentual de cada tipo de resposta: \n A: "+percentual+" \nB: "+percentual+" \nC: "+percentual+" \nD: "+percentual+" \nE: "+percentual);
        System.out.println("A média de idade do público: "+mediaidadepublico);
        System.out.println("A média de idade das pessoas que responderam péssimo: " +mediapessimo);
        System.out.println("A maior idade que respondeu Ótimo: " +maioridadeotimo);
        System.out.println("A menor idade que respondeu Ruim: " +menoridaderuim);
    }
}
