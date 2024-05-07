/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author 5155822
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
            ShellSort(vetor, vetor.length);
        }

        System.out.println("Números de vetores gerados: " + numVetores);
    }

    public static void ShellSort(char[] vetor, int size) {

        System.out.println("Array Original: " + ArrayToString(vetor));

        int interacaoForWhile = 0;
        int trocas = 0;
        double timeStart = System.nanoTime();

        int i, j ; 
        char value;
        int gap = 1;
         
        while(gap < size){
             gap =  3*gap + 1;
        }
        
        while(gap > 1){
            interacaoForWhile++;
             gap /= 3;
             for(i = gap; i < size; i++){
                 interacaoForWhile++;
                    value = vetor[i];
                    j = i - gap;
                    while(j>=0 && value <vetor[j]){
                        interacaoForWhile++;
                        vetor[j + gap] = vetor[j];
                        trocas++;
                        j -= gap;
                        vetor[j + gap] = value;
                    }
                    
                    
             }
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

    
    

