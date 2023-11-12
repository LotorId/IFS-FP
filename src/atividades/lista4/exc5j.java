package lista4;

import java.util.Scanner;

public class exc5j {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo; int m = 0; int f = 0;

        do {
            System.out.println("Ola pessoa, entre com o seu sexo (para sair digite 'sair' para finalizar): ");
            System.out.println("f para feminino e m para masculino");
            sexo = scan.next();

            if (sexo.equals("m") || sexo.equals("M")) {
                m++;
            }

            if (sexo.equals("f") || sexo.equals("F")) {
                f++;
            }

            System.out.println("obrigado pela resposta : )");
        } while (!sexo.equals("sair"));

        System.out.println("De " + (f+m) + " respostas:");
        System.out.println(m + " sao do sexo Masculino");
        System.out.println(f + " sao do sexo Feminino");
    } // End
}
