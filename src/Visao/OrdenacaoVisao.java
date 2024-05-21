// Desenvolvido por Cauan e Daniel
package Visao;

public class OrdenacaoVisao {
	
    // método para printar a formatação do array ordenado
    public void exibirArray(int[] vetor, String metodo) {
        System.out.println("\n=== " + metodo + " ===");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.print(vetor[i]);
            } else {
                System.out.print(vetor[i] + ", ");
            }
        }
        System.out.println();
    }

    // método para printar o tempo de execução da ordenação
    public void exibirTempoExecucao(long tempo) {
        System.out.println("Tempo de execução: " + tempo + "ms");
    }
}
