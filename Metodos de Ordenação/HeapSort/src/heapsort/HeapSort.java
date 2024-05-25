/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapsort;

import java.util.Random;

/**
 *
 * @author GabrielVM
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vetor = getVetor();
        System.out.print("Vetor original: ");
        printVetor(vetor);
        System.out.println();

        heapSort(vetor);

        System.out.print("Vetor ordenado com Heap Sort: ");
        printVetor(vetor);
        System.out.println();

    }

    public static void heapSort(int[] vetor) {
        int size = vetor.length;

        //Prepara o vetor no padrão max heap
        buildHeap(vetor, size);

        //Ordena o vetor de forma decrescente
        for (int i = size - 1; i > 0; i--) {
            // Coloca o maior valor da raiz da arvore no final do array, e o ultimo (menor) como primerio
            inverter(vetor, 0, i);

            //Diminui o tamanho da arvore
            size--;

            // Reorganiza a arvore novamente
            heap(vetor, 0, size);
        }
    }

    private static void buildHeap(int[] vetor, int size) {
        // Começa no pai do último nó
        int start = (size - 2) / 2;

        while (start >= 0) {
            //Reorganiza o heap a partir do nó pai
            heap(vetor, start, size);
            start--;
        }
    }

    private static void heap(int[] vetor, int start, int size) {
        int pai = start;

        //Verifica se possui nós
        while (pai * 2 + 1 < size) {
            //Nó esquerdo
            int filho = pai * 2 + 1;

            //Verifica se o nó direito existe e tem valor maior que o esquerdo
            if (filho + 1 < size && vetor[filho] < vetor[filho + 1]) {
                filho++;
            }

            //Verifica se o valor do pai é menor que do nó
            if (filho < size && vetor[pai] < vetor[filho]) {
                // Troca o valor do pai com o valor do nó
                inverter(vetor, pai, filho);

                //Passa para o próximo indice da arvore
                pai = filho;
            } else {
                return;
            }
        }
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
