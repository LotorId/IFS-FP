/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;
import java.util.Scanner;

/**
 *
 * @author 2022000118
 */
public class vetor_ordenado {

    /**
     * @param args the command line arguments
     */
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
