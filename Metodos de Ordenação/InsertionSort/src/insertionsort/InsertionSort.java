/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

import java.util.Random;

/**
 *
 * @author GabrielVM
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vetor = getVetor();
        System.out.print("Vetor original: ");
        printVetor(vetor);
        System.out.println();

        InsertionSort(vetor);

        System.out.print("Vetor ordenado com Selection Sort: ");
        printVetor(vetor);
        System.out.println();

    }

    public static void InsertionSort(int[] vetor) {

        int j;
        for (int i = 1; i < vetor.length; i++) {
            int x = vetor[i];

            for (j = i - 1; j >= 0 && x < vetor[j]; j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = x;
        }
        
    }
    

    private static int[] getVetor() {

        int minimo = 5;
        int maximo = 1000;

        Random rand = new Random(System.currentTimeMillis());

        //Gera entre 1 e 10 vetores.
        int numVetores = rand.nextInt((10 - 1) + 1) + 1;
        int[] vetor = null;

        for (int i = 0; i < numVetores; i++) {

            //Cada vetor vai ter entre <minimo> e o <maximo> de tamanho.
            vetor = new int[rand.nextInt((maximo - minimo) + 1) + minimo];

            for (int j = 0; j < vetor.length; j++) {

                //Gera números aleatórios entre 0 e 1000.
                int value = rand.nextInt((1000 - 0) + 1) + 0;
                vetor[j] = (char) value;
            }

        }

        return vetor;
    }

    private static void printVetor(int[] vetor) {

        String txt = "[";
        StringBuilder sb = new StringBuilder(vetor.length * 7);

        for (int v : vetor) {
            sb.append(v).append(", ");
        }

        txt += sb.substring(0, sb.length() - 2) + "]";
        System.out.println(txt);
    }
    
}
