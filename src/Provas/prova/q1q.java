package Provas.prova;
import java.util.Scanner;
public class q1q {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vi[] = new int[20];
        int vr[] = new int[20];
        int num;
        int a;
        int cont=0;

        do {
            System.out.println("entre com no maxino 20 números (0/sair): ");
            num = ler.nextInt();
            if (num != 0) {
                vr[cont] = num;
                cont++;
            }

        }while (num !=0);
        for (int i =0; i < cont; i++) {
            for (int j=0; j < cont; j++) {
                if (vr[i] < vr[j]) {
                    a = vr[i];
                    vr[i] = vr[j];
                    vr[j] = a;
                }
            }
        }
        for (int p=0; p < cont; p++) {
            System.out.print(vr[p] + " | ");
        }

    }
}
