package atividades.sala;

import java.util.Scanner;

public class e3e {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = 0; int B = 0; int C = 0; int D = 0; int E = 0; int maior = 0; int menor = 91;
        double mediaIdade = 0; double mediaIdadePessimo = 0;

        for (int i = 1; i <= 200; i++) {
            int idade = 0;

            int j = 0;
            while (j == 0) {
                System.out.println("Qual sua idade (idade nao pode ser menor que 12 e maior que 90 anos): \n");
                idade = entrada.nextInt();
                if (idade >= 12 && idade <= 90) {
                    j++;
                    mediaIdade = mediaIdade + idade;
                }
            }

            int o = 0;
            while (o == 0) {
                System.out.println("sua opinião em relação ao filme, segundo as seguintes notas:\n" +
                        "\nA- Ótimo" +
                        "\nB- Bom" +
                        "\nC- Regular" +
                        "\nD- Ruim" +
                        "\nE- Péssimo");
                String resposta = entrada.next().toUpperCase();
                if (resposta.equals("A")){
                    A++;
                    o++;
                    if (idade > maior){
                        maior = idade;
                    }
                }
                if (resposta.equals("B")){
                    B++;
                    o++;
                }
                if (resposta.equals("C")){
                    C++;
                    o++;
                }
                if (resposta.equals("D")){
                    D++;
                    o++;
                    if (idade < menor) {
                        menor = idade;
                    }
                }
                if (resposta.equals("E")){
                    E++;
                    o++;
                    mediaIdadePessimo = mediaIdadePessimo + idade;
                }
            }

        }

        System.out.println("A quantidade de A - Ótimo foi: " + A);
        System.out.println("A quantidade de B - Bom foi: " + B);
        System.out.println("A quantidade de C - Regular foi: " + C);
        System.out.println("A quantidade de D - Ruim foi: " + D);
        System.out.println("A quantidade de E - Pessimo foi: " + E);

        System.out.println("");

        System.out.println("O percentual de A - Ótimo foi: " + (A * 100.0 / 200) + "%");
        System.out.println("O percentual de B - Bom foi: " + (B * 100.0 / 200) + "%");
        System.out.println("O percentual de C - Regular foi: " + (C * 100.0 / 200) + "%");
        System.out.println("O percentual de D - Ruim foi: " + (D * 100.0 / 200) + "%");
        System.out.println("O percentual de E - Pessimo foi: " + (E * 100.0 / 200) + "%");

        System.out.println("");

        System.out.println("A media das idades do público é: " + (mediaIdade / 200.0));
        System.out.println("A media das idades do público que escolheu pessimo e: " + (mediaIdadePessimo / E));
        System.out.println("A menor idade que respondeu Ruim: " + menor);

    }
}
