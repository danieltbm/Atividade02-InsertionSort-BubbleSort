// desenvolvido por Cauan e Daniel
package Controle;

import Modelagem.OrdenacaoModelagem;
import Visao.OrdenacaoVisao;

public class OrdenacaoControle {
    private OrdenacaoModelagem modelagem;
    private OrdenacaoVisao visao;

    // construtor
    public OrdenacaoControle(OrdenacaoModelagem modelagem, OrdenacaoVisao visao) {
        this.modelagem = modelagem;
        this.visao = visao;
    }

    // método que ordena e exibe o vetor e o tempo de execução de acordo com o método escolhido
    public void ordenarEExibir(String metodo) {
        long tempoInicial = System.currentTimeMillis();

        if (metodo.equalsIgnoreCase("Insertion Sort")) {
            modelagem.insertionSort();
        } else if (metodo.equalsIgnoreCase("Bubble Sort")) {
            modelagem.bubbleSort();
        } else {
            System.out.println("Método de ordenação não reconhecido.");
            return;
        }

        long tempoFinal = System.currentTimeMillis();
        
        // exibe o vetor ordenado e o tempo de execução
        visao.exibirArray(modelagem.getVetor(), metodo);
        visao.exibirTempoExecucao(tempoFinal - tempoInicial);
    }
}