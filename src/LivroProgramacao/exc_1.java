package LivroProgramacao;

import java.util.Scanner;

public class exc_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Idade = 1;
        int PessoasMais50 = 0;
        double Alturas = 0;
        double Altura = 0.0;
        while (Idade > 0) {
            System.out.println("Qual sua idade? ");
            Idade = input.nextInt();
            System.out.println("Qual sua altura? ");
            Altura = input.nextDouble();
            if (Idade > 50) {
                Alturas = Alturas + Altura;
                PessoasMais50++;
                break;
            }
            break;
        }
        System.out.println("A quantidade de pessoas com mais de 50 anos foi: " + PessoasMais50);
        System.out.println("A media de suas alturas foi: " + (Alturas / PessoasMais50));
    }
}
