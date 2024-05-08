/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadedois;

import java.util.Scanner;

/**
 *
 * @author aborg
 */
public class AtividadeDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int[] primeiroVetor = new int[10];
        int[] vetorInvertido = new int [10];
        
        
        System.out.println("Digite os numeros para fazer a leitura: ");
        for(int i = 0; i < 10; i++){
            primeiroVetor[i] = scanner.nextInt();
        }
        
        //aqui vamos inverte-los
        for(int i = 0; i < 10; i++){
            vetorInvertido[i] = primeiroVetor[9-i];
        } 
        
        System.out.println("Vetor original: ");
        for(int i = 0; i < 10; i++){
            System.out.println(primeiroVetor[i]+" ");
        }
        System.out.println();
        
        System.out.println("Vetor invertido: ");
        for(int i = 0; i <10; i++){
            System.out.println(vetorInvertido[i]+" ");
        }
        System.out.println("");
        scanner.close();
    }
    
}
