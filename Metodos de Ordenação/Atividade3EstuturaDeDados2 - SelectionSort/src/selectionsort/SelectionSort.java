/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author 5155822
 */
public class SelectionSort {

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
            OrdenarAndPrint(vetor);
        }

        System.out.println("Números de vetores gerados: " + numVetores);
    }

    public static void OrdenarAndPrint(char[] vetor) {

        System.out.println("Array Original: " + ArrayToString(vetor));
        
        int interacaoForWhile = 0;
        int trocas = 0;
        double timeStart = System.nanoTime();
        
        
        int min = 0;
        for (int i = 0; i < vetor.length; i++) {
            interacaoForWhile++;
            min = i;

            for (int j = i + 1; j <= vetor.length-1; j++) {
                interacaoForWhile++;
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
                
            char temp = vetor[min];
            vetor[min] = vetor[i];
            vetor[i]  = temp;
            trocas++;
        }

        double timeStop = System.nanoTime();
        
        System.out.println("Array Ordenado: " + ArrayToString(vetor));
        System.out.println("Interações For/While: " + interacaoForWhile);
        System.out.println("Trocas Realizadas: " + trocas);
        DecimalFormat formatter = new DecimalFormat("#0.0000");
        System.out.println("Tempo de Processamento:  " + formatter.format((timeStop - timeStart)/1000000) + "ms");
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
