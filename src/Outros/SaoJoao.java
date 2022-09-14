package Outros;

import java.util.Scanner;

public class SaoJoao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contMasc = 0, contFemi = 0, contXoteMasc = 0, contFemiAjuLag = 0, festivalNoites = 0, contHorasA = 0, contHorasB = 0, contHorasC = 0, somaNoitesIta = 0;
        double mediaNoitesIta = 0.00, pctXoteMasc = 0.00, pctFeniAjuLag = 0.00, pctHorasA = 0.00, pctHorasB = 0.00, pctHorasC = 0.00;
        String ritmo = "", sexo = "", cidadeFesteira = "", horasDanca = "";
        for (int x = 0; x <= 9; x++) {
            System.out.println(" Qual o ritmo preferido? ");
            System.out.println(" [A]- Arrasta Pé ");
            System.out.println("[B]- Baiao ");
            System.out.println(" [X]- Xote ");
            ritmo = ler.next();

            System.out.println(" Quantas noites você pretende ir para o festival  de 1 a 5 ? ");
            festivalNoites = ler.nextInt();

            System.out.println(" Por qunatas horas você pretende dançar? ");
            System.out.println("[A]- Durante até 1 hora ");
            System.out.println("[B]-  Entre 1 hora a 3 horas ");
            System.out.println("[C]- Acima de 3 horas ");
            horasDanca = ler.next();
            if (horasDanca.toUpperCase().equals("A")) {
                contHorasA++;
            }
            if (horasDanca.toUpperCase().equals("B")) {
                contHorasB++;
            }
            if (horasDanca.toUpperCase().equals("C")) {
                contHorasC++;
            }

            System.out.println(" Em qual cidade pretende aproveitar a festa? ");
            System.out.println("[AJU]- Aracaju ");
            System.out.println("[LAG]- Lagarto ");
            System.out.println("[ITA]- Itaporanga ");
            System.out.println("[EST]- Estancia ");
            cidadeFesteira = ler.next();

            System.out.println(" Informe o seu sexo: ");
            System.out.println(" [M]- Masculino ");
            System.out.println(" [F]- Feminino ");
            sexo = ler.next();
            if (sexo.toUpperCase().equals("M")) {
                contMasc++;
                if (ritmo.toUpperCase().equals("X")) {
                    contXoteMasc++;
                }
            }

            if (sexo.toUpperCase().equals("F")) {
                contFemi++;
                if (cidadeFesteira.toUpperCase().equals("AJU") || cidadeFesteira.toUpperCase().equals("LAG")) {
                    contFemiAjuLag++;
                }
            }

            if (cidadeFesteira.toUpperCase().equals("ITA")) {
                somaNoitesIta = somaNoitesIta + festivalNoites;
            }

        }
        mediaNoitesIta = (somaNoitesIta / 10.0 ); //Coloquei um ponto depois do 10 porque so tinha int pra entrar num double
        pctXoteMasc = (contXoteMasc * 100.0) / contMasc;
        pctFeniAjuLag = (contFemiAjuLag * 100.0) / contFemi;
        pctHorasA = (contHorasA * 100.0) / 10;
        pctHorasB = (contHorasB * 100.0) / 10;
        pctHorasC = (contHorasC * 100.0) / 10;

        System.out.println(" O percentual de alunos do sexo masculino que preferem o ritmo Xote " + pctXoteMasc + "%");
        System.out.println(" O percentual dos alunos do sexo feminino que preferem as cidades Aracaju (AJU) e Lagarto (LAG) " + pctFeniAjuLag + "%");
        System.out.println(" A média do número de noites que pretendem curtir dos que preferem a cidade de Itaporanga (ITA) " + mediaNoitesIta);
        System.out.println(" O percentual de pessoas pretendem dancar durante 1 hora é de: " + pctHorasA + "%");
        System.out.println(" O percentual de pessoas prentendem dancar entre 1 hora a  3 horas: " + pctHorasB + "%");
        System.out.println(" O percentual de pessoas pretendem dancar durante mais de 3 horas: " + pctHorasC + "%");
        System.out.println(somaNoitesIta);
    }
}