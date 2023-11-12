package avaliacoes.provaII;

import java.util.Scanner;

public class q1q {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char frase[] = new char[44];
        char fraseNova[] = new char[44];
        char caracter = ' ';
        int cont = 0;
        while (caracter != '#' && cont < 44){
            System.out.println("Entre com o " + cont + " elemento do vetor");
            caracter = scan.next().charAt(0);
            if (caracter != '#'){
                frase[cont] = caracter;
                cont++;
            }
        }

        System.out.println("VETOR PREENCHIDO");
        for (int i = 0; i < cont; i++){
            System.out.print(frase[i] + " ");
        }

        int i = 0;
        int qtd = 0;
        int indice = 0;

        while (i < cont){
            if (frase[i] != '_'){
                fraseNova[indice] = frase[i];
                indice++;
                qtd = 0;
            } else {
                if (qtd == 0 && indice != 0){
                    fraseNova[indice] = frase[i];
                    indice++;
                    qtd++;
                }
            }
            i++;
        }

        if (fraseNova[indice-1] == '_'){
            indice--;
        }

        System.out.println("VETOR RESULTANTE");
        for (i = 0; i < indice;i++){
            System.out.print(fraseNova[i] + " ");
        }


    }
}
