package atividades.sala;
import java.util.Scanner;

public class e5e {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        char v[] = new char[50];
        char vr[] = new char[50];
        char caracter = ' ';
        int cont = 0;
        while(caracter != '#'){
            System.out.print("Entre com o um caracter(p/ sair digite #): ");
            caracter = leitura.next().charAt(0);
            if(caracter != '#'){
                v[cont] = caracter;
                cont++;
            }
        }
        System.out.println("VETOR PREENCHIDO: ");
        for(int j = 0; j < cont;j++){
            System.out.print(v[j] + " | ");
        }
        System.out.println("\n \n");
        int i = 0;
        int qtd = 0;
        int indice = 0;
        while(i <= cont){
            if(v[i] != '_'){
                vr[indice] = v[i];
                indice++;
                qtd = 0;
            }else{
                if(qtd == 0 && indice != 0){
                    vr[indice] = v[i];
                    indice++;
                    qtd++;
                }
            }
            i++;
        }
        System.out.println(indice);

        if(vr[indice-2] == '_'){
            indice--;
        }

        System.out.println("VETOR RESULTANTE: ");
        for(i = 0; i < indice-1;i++){
            System.out.print(vr[i] + " | ");
        }

    }
}
