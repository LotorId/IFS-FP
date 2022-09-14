package Provas.prova;
import java.util.Scanner;
public class q2q {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd;
        int num;
        int cont=0;
        int repetido;
        int v1[] = new int[100];
        int v2[] = new int[100];
        boolean achou;

        do{
            System.out.println("Entre com o tamnho do vetor: ");
            qtd = ler.nextInt();
        }while (qtd <= 0 | qtd > 100);

        for (int i = 0; i < qtd; i++) {
            System.out.print("Entre com o vetor na posicao: ");
            num = ler.nextInt();
            achou = true;
            cont = 0;
            for (int j=0; j < i; j++) {
                if (v1[j] == num) {
                    v2[j] = v1[j];
                    achou = false;
                    cont++;
                }
            }
            if (achou) {
                v1[i] = num;
            }
        }
        for (int i = 0; i < qtd; i++) {
            System.out.print(v2[i] + " | ");
        }


    }
}
