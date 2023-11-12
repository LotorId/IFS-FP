import java.util.Scanner;

public class provaq2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int v[] = new int[100];
        int vr[] = new int[100];
        int vf[] = new int[100];
        int indice = 0;
        int num, i, j;
        int cont = 0;
        int qntd = 0;
        int contrep = 0;
        int contgeral = 0;
        int indice2 = 1;
        boolean teste;

        System.out.println("OBS: Entre com no márximo 100 valores!");
        do {
            System.out.print("Entre com o valor desejado ( p/ sair digite '0'): ");
            num =ler.nextInt();
            if(num != 0 ){
                v[cont] = num;
                cont++; 
                qntd++;
            }
        } while (num != 0 && qntd <=100);

        //verificando a quantidade de repetições do número qua aparece mais vezes
        
        for(i=0; i < cont ;i++){
            for(j=0; j < cont ; j++){
                if(v[i]==v[j]){
                    contrep++;
                }
            }
            if(contrep > contgeral){
                contgeral = contrep;
            }
            contrep=0;
        }
        
        contrep = 0;
        
        //verificando se tem números com o mesmo número de repetições

        for(i=0; i < cont ;i++){
            for(j=0; j < cont ; j++){
                if(v[i]==v[j]){
                    contrep++;
                }
            }
            if(contrep == contgeral){
                vr[indice] = v[i];
                indice++;
            }
            contrep = 0;
        }

        //gerando um novo vetor sem números repetidos

        vf[0] = vr[0];

        for(i=1; i < indice ; i++){
            teste = false;
            for(j=0; j < i; j++){
                if(vr[i] == vr[j]){
                    teste = true;
                    break;
                }
            }

            if(!teste){
                vf[indice2] = vr[j];
                indice2++;
            }
        }

        //imprimindo o resultado

        System.out.println(" O(s) número(s) que mais se repete(m) é(são):");
        for(i=0; i < indice2; i++){
            System.out.print(" | " + vf[i] + " | ");
        }
        ler.close();
    }
    
}
