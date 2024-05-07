/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5vetores;

import java.util.Scanner;

/**
 *
 * @author GabrielVM
 */
public class Atividade5Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Criar vetor
        Integer vetor1[] = new Integer[20];
        Integer vetor2[] = new Integer[20];
        
        //Resceber Valores
        for(int i = 0; i < 20 ;i++){
            do {
                System.out.print("Digite um numero inteiro positivo para o vetor 1:["+(i+1)+" de 20]: ");
                vetor1[i] = input.nextInt();
            }while(vetor1[i] <= 0);
        }
        System.out.print("\n");
        for(int i = 0; i < 20 ;i++){
            do {
                System.out.print("Digite um numero inteiro positivo para o vetor 2:["+(i+1)+" de 20]: ");
                vetor2[i] = input.nextInt();
            }while(vetor2[i] <= 0);
        }
        
        //Vetor de diferença entre vetor 1 e 2
        Integer vetorDif[] = new Integer[20];
        for(int i = 0; i < 20 ;i++){
            vetorDif[i] = vetor1[i] - vetor2[i];
        }
        
        //Vetor de soma entre vetor 1 e 2
        Integer vetorSoma[] = new Integer[20];
        for(int i = 0; i < 20 ;i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        
        //Vetor de multiplicação entre vetor 1 e 2
        Integer vetorMult[] = new Integer[20];
        for(int i = 0; i < 20 ;i++){
            vetorMult[i] = vetor1[i] * vetor2[i];
        }
        
        //Exibe na tela
        System.out.print("\n\n");
        System.out.println("Vetor 1: "+vetorToString(vetor1, false));
        System.out.println("Vetor 2: "+vetorToString(vetor2, false));
        System.out.print("\n");
        System.out.println("Vetor Difereca: "+vetorToString(vetorDif, false));
        System.out.println("Vetor Soma: "+vetorToString(vetorSoma, false));
        System.out.println("Vetor Multiplicação: "+vetorToString(vetorMult, false));
    }
    
    public static Integer[] shellSort(Integer[] vetor) {

        int i, j ; 
        Integer value;
        int gap = 1;
        int size = vetor.length;
         
        while(gap < size){
             gap =  3*gap + 1;
        }
        
        while(gap > 1){
             gap /= 3;
             for(i = gap; i < size; i++){
                    value = vetor[i];
                    j = i - gap;
                    while(j>=0 && value <vetor[j]){
                        vetor[j + gap] = vetor[j];
                        j -= gap;
                        vetor[j + gap] = value;
                    }
                    
                    
             }
        }
        
        return vetor;
    }
    
    private static Integer[] invertVetor(Integer[] vetor){
        int length = vetor.length;
        Integer aux;
        for(int i = 0; i < vetor.length/2; i++){
            aux = vetor[i];
            vetor[i] = vetor[(length-i)-1];
            vetor[(length-i)-1] = aux;
        }
        return vetor;
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
