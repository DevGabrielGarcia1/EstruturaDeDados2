/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quick.sort;

import java.util.Random;

/**
 *
 * @author GabrielVM
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vetor = getVetor();
        System.out.print("Vetor original: ");
        printVetor(vetor);
        System.out.println();

        quickSort(vetor);

        System.out.print("Vetor ordenado com Quick Sort: ");
        printVetor(vetor);
        System.out.println();

    }

    public static void quickSort(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            //Retorna a subdivisão do vetor
            int pivo = particionar(vetor, inicio, fim);
            //Passa a ordenação no subvetor da esquerda
            quickSort(vetor, inicio, pivo - 1);
            //Passa a ordenação no subvetor da direita
            quickSort(vetor, pivo + 1, fim);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        
        //Ponteiro do ultimo valor menor ou iguail ao pivo
        int i = inicio;

        for (int val = inicio; val < fim; val++) {
            //Se o valor for maior ou igual ao pivo
            if (vetor[val] <= pivo) {
                if(vetor[i] > vetor[val])
                    inverter(vetor, i, val);
                i++;
            }
        }
        
        //Troca o pivo com a ultima posição do ponteiro
        inverter(vetor, i, fim);
        return i;
    }

    private static void inverter(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
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
