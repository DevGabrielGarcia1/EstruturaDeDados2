/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade6vetores;

import java.util.Scanner;

/**
 *
 * @author GabrielVM
 */
public class Atividade6Vetores {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Receber tamanho do vetor
        int vLength = 0;
        System.out.print("Digite o tamanho do vetor: ");
        vLength = input.nextInt();
        
        int vPares = 0;
        
        //Criar vetor
        Integer vetor[] = new Integer[vLength];
        
        //Resceber Valores
        for(int i = 0; i < vLength ;i++){
            do {
                System.out.print("Digite um numero inteiro positivo:["+(i+1)+" de "+vLength+"]: ");
                vetor[i] = input.nextInt();
                //Salvar quantos pares
                if(vetor[i]%2 == 0){
                   vPares++; 
                }
            }while(vetor[i] <= 0);
        }
        
        //Ordenar vetor
        vetor = shellSort(vetor);
        
        
        //Separar vetores impar e par
        Integer[] vetorPar = new Integer[vPares];
        Integer[] vetorImpar = new Integer[vetor.length-vPares];
        
        int iPar = 0;
        int iImpar = 0;
        for(Integer i : vetor){
            if(i%2 == 0){
                vetorPar[iPar] = i;
                iPar++;
            }else{
                vetorImpar[iImpar] = i;
                iImpar++;
            }
        }
        
        //Inverte vetor immpar
        vetorImpar = invertVetor(vetorImpar);
        
        //Exibe na tela
        System.out.println("Vetor Par: "+vetorToString(vetorPar, false));
        System.out.println("Vetor Impar: "+vetorToString(vetorImpar, false));
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
    
    /*
    private static void quickSort(Integer[] vetor) {
        boolean troca = true;
        
        while(troca){
            troca = false;
            
            Integer pivot = vetor[0];
            int posPivot = 0;
            int posTroca = 0;
            Integer aux;
            
            //Ordenar valores iguais ou menores a frente
            for(int i = 1; i < vetor.length; i++){
                if(vetor[i] <= pivot){
                    posTroca++;
                    aux = vetor[posTroca];
                    vetor[posTroca] = vetor[i];
                    vetor[i] = aux;
                    troca = true;
                }
            }
            
            //Colocar o pivot a frente de todos os menores ou iguais
            if(troca){
                aux = vetor[posTroca];
                vetor[posTroca] = vetor[posPivot];
                vetor[posPivot] = aux;
            }
            
        }
        
        return vetor;
    }
    */
    
}
