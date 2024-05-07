/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1estuturadedados2;

import java.text.DecimalFormat;


/**
 *
 * @author Gabriel
 */
public class Atividade1EstuturaDeDados2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] v1 = {'R', 'O', 'N', 'E', 'D', 'A'};
        char[] v2 = {'A', 'D', 'E', 'N', 'O', 'R'};
        char[] v3 = {'O', 'R', 'D', 'E', 'N', 'A'};
        
        OrdenarAndPrint(v1);
        OrdenarAndPrint(v2);
        OrdenarAndPrint(v3);
    }
    
    public static void OrdenarAndPrint(char[] vetor){
       
        System.out.println("Array Original: " + ArrayToString(vetor));
        
        int interacaoForWhile = 0;
        int condicoesIf = 0;
        int trocas = 0;
        
        boolean troca = true;
        
        double timeStart = System.nanoTime();
        
        while(troca == true){
            troca = false;
            interacaoForWhile++;
            
            for (int j = 0; j < vetor.length - 1; j++){
                interacaoForWhile++;
                
                if(vetor[j] > vetor[j+1]){
                    char temp;
                    temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                    troca = true;
                    
                    trocas++;
                    condicoesIf++;
                }else{
                    condicoesIf++;
                }
            }
        }
        
        double timeStop = System.nanoTime();
        
        
        System.out.println("Array Ordenado: " + ArrayToString(vetor));
        System.out.println("Interações For/While: " + interacaoForWhile);
        System.out.println("Condições IF: " + condicoesIf);
        System.out.println("Trocas Realizadas: " + trocas);
        DecimalFormat formatter = new DecimalFormat("#0.0000");
        System.out.println("Tempo de Processamento:  " + formatter.format((timeStop - timeStart)/1000000) + "ms");
        System.out.println("\n");
    }  
    
    
    public static String ArrayToString(char[] vetor){
        String text = "[ ";
        
        for (char i : vetor) {
            text = text + String.valueOf(i) + ", ";
        }
        
        return text.substring(0, text.length()-2) + " ]";
    }
    
}
