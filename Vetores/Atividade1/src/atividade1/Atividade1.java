/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author 5155822
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10];
        
        for(int i= 0; i < 10 ;i++){
            System.out.print("Digite um numero:["+(i+1)+" de 10]: ");
            vetor[i] = input.nextInt();
        }
        
        System.out.println("Vetor no sentido original: "+vetorToString(vetor, false));
        System.out.println("Vetor no invertido: "+vetorToString(vetor, true));
    }
    
    private static String vetorToString(int[] vetor, boolean invet){
        if(!invet){
            
            String txt = "";
            for (int i = 0; i < vetor.length; i++) {
                txt += " "+vetor[i]+",";
            }
            
            txt = "["+txt.substring(1, txt.length()-1)+"]";
            return txt;
        }
        
        String txt = "";
        for (int i = vetor.length-1; i >= 0; i--) {
            txt += " "+vetor[i]+",";
        }
            
        txt = "["+txt.substring(1, txt.length()-1)+"]";
        return txt;
    }
    
}
