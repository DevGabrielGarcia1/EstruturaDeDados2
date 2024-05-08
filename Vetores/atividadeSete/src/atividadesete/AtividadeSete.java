/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadesete;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author aborg
 */
public class AtividadeSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random random = new Random();
        int n = random.nextInt(10)+1;
        int[] vetor1 = gerandoVetor(n);
        int[] vetor2 = gerandoVetor(n);
        
        System.out.println("Vetor 1: "+ Arrays.toString(vetor1));
        System.out.println("Vetor 2: "+ Arrays.toString(vetor2));
        
        System.out.println("Os vetores possuem conteudo igual?: "+ conteudoIgual(vetor1, vetor2));
    }
    
    public static int[] gerandoVetor(int n ){
        Random random = new Random();
        int[] vetor = new int[n];
        for(int i = 0; i < 10; i++){
            vetor[i] = random.nextInt(10);
        }
        return vetor;
    }
    
    public static boolean conteudoIgual(int[] vetor1, int[] vetor2){
        if(vetor1.length != vetor2.length){
            return false;
        }
        for(int i =0;i< vetor1.length-1;i++){
            if(vetor1[i] != vetor2[i]){
                return false;
            }
        }
        return true;
    }
    
    
}
