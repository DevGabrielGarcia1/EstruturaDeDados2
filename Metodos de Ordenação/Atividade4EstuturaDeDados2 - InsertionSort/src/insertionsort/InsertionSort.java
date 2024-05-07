/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author 5157590
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int minimo = 5;
        int maximo = 100;

        Random rand = new Random(System.currentTimeMillis());

        //Gera entre 1 e 10 vetores.
        int numVetores = rand.nextInt((10 - 1) + 1) + 1;
        char[] vetor;

        for (int i = 0; i < numVetores; i++) {

            //Cada vetor vai ter entre <minimo> e o <maximo> de tamanho.
            vetor = new char[rand.nextInt((maximo - minimo) + 1) + minimo];

            for (int j = 0; j < vetor.length; j++) {

                //Gera letras aleaótiras entre 'A' e 'Z', seguindo a tabela ASCII2.
                int value = rand.nextInt((90 - 65) + 1) + 65;
                vetor[j] = (char) value;
            }

            System.out.println("Vetor " + (i + 1) + ":");
            System.out.println("Tamanho do vetor: " + vetor.length);
            InsertionSort(vetor);
        }

        System.out.println("Números de vetores gerados: " + numVetores);
    }

    public static void InsertionSort(char[] vetor) {

        System.out.println("Array Original: " + ArrayToString(vetor));

        int interacaoForWhile = 0;
        int trocas = 0;
        double timeStart = System.nanoTime();

        int j;
        for (int i = 1; i < vetor.length; i++) {
            interacaoForWhile++;
            char x = vetor[i];

            for (j = i - 1; j >= 0 && x < vetor[j]; j--) {
                interacaoForWhile++;
                vetor[j + 1] = vetor[j];
                trocas++;
            }
            vetor[j + 1] = x;
            trocas++;
        }

        double timeStop = System.nanoTime();

        System.out.println("Array Ordenado: " + ArrayToString(vetor));
        System.out.println("Interações For/While: " + interacaoForWhile);
        System.out.println("Trocas Realizadas: " + trocas);
        DecimalFormat formatter = new DecimalFormat("#0.0000");
        System.out.println("Tempo de Processamento:  " + formatter.format((timeStop - timeStart) / 1000000) + "ms");
        System.out.println("\n");
    }

    public static String ArrayToString(char[] vetor) {
        String text = "[ ";

        for (char i : vetor) {
            text = text + String.valueOf(i) + ", ";
        }

        return text.substring(0, text.length() - 2) + " ]";
    }

}
