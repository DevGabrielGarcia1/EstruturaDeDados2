/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3vetores;

import java.util.Scanner;

/**
 *
 * @author GabrielVM
 */
public class Atividade3Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        Integer vetor[] = new Integer[10];
        
        //Resceber Vetor
        for(int i= 0; i < 10 ;i++){
            do {
                System.out.print("Digite um numero inteiro positivo:["+(i+1)+" de 10]: ");
                vetor[i] = input.nextInt();
            }while(vetor[i] <= 0);
        }
        
        //Segundo vetor (elementos par dividido por 2 e impar multiplicado por 3)
        Double vetor2[] = new Double[10];
        for (int i = 0; i < vetor.length; i++) {
            if((i%2)==0){
                vetor2[i] = (double)vetor[i]/2;
            }else{
                vetor2[i] = (double)vetor[i]*3;
            }
        }
        
        
        System.out.println("Vetor 1: "+vetorToString(vetor, false));
        System.out.println("Vetor 2: "+vetorToString(vetor2, false));
    }
    
    private static  <T>String vetorToString(T[] vetor, boolean invet){
        if(!invet){
            
            String txt = "";
            for (T v : vetor) {
                if((v instanceof Double) && ((Double)v%2 == 0)){
                    txt += " " + ((Double)v).intValue() + ",";
                }
                else
                    txt += " " + v + ",";
            }
            
            txt = "["+txt.substring(1, txt.length()-1)+"]";
            return txt;
        }
        
        String txt = "";
        for (int i = vetor.length-1; i >= 0; i--) {
            if((vetor[i] instanceof Double) && ((Double)vetor[i]%2 == 0)){
                txt += " " + ((Double)vetor[i]).intValue() + ",";
            }
            else
                txt += " "+vetor[i]+",";
        }
            
        txt = "["+txt.substring(1, txt.length()-1)+"]";
        return txt;
    }
    
}
