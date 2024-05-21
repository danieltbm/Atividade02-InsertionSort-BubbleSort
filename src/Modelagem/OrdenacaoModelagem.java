// desenvolvido por Cauan e Daniel
package Modelagem;

public class OrdenacaoModelagem {
    private int[] vetor;

    public OrdenacaoModelagem(int[] vetor) {
        this.vetor = vetor;
    }
    
    // método do algoritmo insertion sort
    public void insertionSort() {
        int i;
        for (int j = 1; j < vetor.length; j++) {
            int key = vetor[j];

            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

    // método do algoritmo bubble sort
    public void bubbleSort() {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public int[] getVetor() {
        return vetor;
    }
}
