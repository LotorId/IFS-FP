package atividades.sala;

import java.util.Scanner;

public class e2e {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Variaveis
        String sexo = "M";
        int idade; int quantidadeLivros; int genero; int quantidadeHomens = 0; int quantidadeMulheres = 0; int quantidadeHomensNaoLivros = 0;
        int maior = 0;
        int comedia = 0; int romance = 0; int suspense = 0; int terror = 0; int nenhum = 0;

        double idadeMulheres = 0;
        int sair = 1;

        //Codigo
        System.out.println("Pesquisa de campo para editora: \n");

        while (sair != 0) {
            System.out.println("Qual seu sexo? (M - masculino | F - feminino)");
            sexo = entrada.next().toUpperCase();
            System.out.println(sexo);

            if (sexo.equals("M") || sexo.equals("F")) {

                if (sexo.equals("M")) {
                    quantidadeHomens++;
                } else {
                    quantidadeMulheres++;
                }

                do {
                    System.out.println("Qual sua idade? ");
                    idade = entrada.nextInt();
                } while (idade < 0 || idade > 100);

                System.out.println("Qual a quantidade de livros que voce leu em 2021? ");
                quantidadeLivros = entrada.nextInt();

                //Idade das mulheres
                if (sexo.equals("F")) {
                    idadeMulheres = idadeMulheres + idade;
                }

                //Maior quantidade de livros lidos
                if (quantidadeLivros > maior){
                    maior = quantidadeLivros;
                }

                //Homens que nao leram livros
                if (sexo.equals("M") && quantidadeLivros == 0){
                    quantidadeHomensNaoLivros++;
                }

                //Genero
                do {
                    System.out.println("Qual genero mais lido?" +
                            "\n1 - Comedia" +
                            "\n2 - Romance" +
                            "\n3 - Suspense" +
                            "\n4 - Terror" +
                            "\n5 - Nenhuma das categorias");
                    genero = entrada.nextInt();
                } while (genero < 0 || genero > 5);

                switch (genero) {
                    case 1: {
                        comedia++;
                        break;
                    } case 2: {
                        romance++;
                        break;
                    } case 3: {
                        suspense++;
                        break;
                    } case 4: {
                        terror++;
                        break;
                    } case 5: {
                        nenhum++;
                        break;
                    }
                }
            } else {
                sair = 0;
            }
        }
        System.out.println("A quantidade de mulheres entrevistadas foi: " + quantidadeMulheres);
        System.out.println("A quantidade de homens entrevistados foi: " + quantidadeHomens);

        if ((comedia > romance) && (comedia > suspense) && (comedia > terror) && (comedia > nenhum)) {
            System.out.println("O genero mais lido foi comédia");
        } else if ((romance > comedia) && (romance > suspense) && (romance > terror) && (romance > nenhum)) {
            System.out.println("O genero mais lido foi romance");
        } else if ((suspense > comedia) && (suspense > romance) && (suspense > terror) && (suspense > nenhum)) {
            System.out.println("O genero mais lido foi suspense");
        } else if ((terror > comedia) && (terror > romance) && (terror > suspense) && (terror > nenhum)) {
            System.out.println("O genero mais lido foi terror");
        } else {
            System.out.println("O genero mais lido não estava nas alternativas");
        }

        System.out.println("O percentual de homens que não leram livros foi: " + (quantidadeHomensNaoLivros * 100 / quantidadeHomens) + "%");
        System.out.println("A maior quantidade de livros lidos por uma pessoa: " + maior);
        System.out.println("A media da idade das mulheres foi: " + (idadeMulheres / quantidadeMulheres));
        System.out.println("O percentual de livros de comedia lido foi de: " + (comedia * 100 / (quantidadeHomens + quantidadeMulheres)) + "%");
        System.out.println("O percentual de livros de romance lido foi de: " + (romance * 100 / (quantidadeHomens + quantidadeMulheres)) + "%");
        System.out.println("O percentual de livros de suspense lido foi de: " + (suspense * 100 / (quantidadeHomens + quantidadeMulheres)) + "%");
        System.out.println("O percentual de livros de terror lido foi de: " + (terror * 100 / (quantidadeHomens + quantidadeMulheres)) + "%");
        System.out.println("O percentual de livros de nao listados lido foi de: " + (nenhum * 100 / (quantidadeHomens + quantidadeMulheres)) + "%");

    }
}
