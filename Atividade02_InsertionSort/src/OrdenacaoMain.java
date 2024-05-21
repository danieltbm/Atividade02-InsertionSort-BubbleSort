// desenvolvido por Cauan e Daniel
import Modelagem.OrdenacaoModelagem;
import Visao.OrdenacaoVisao;
import Controle.OrdenacaoControle;

import java.util.Scanner;

public class OrdenacaoMain {
    public static void main(String[] args) {
        int quantidade = 10;

        // criação do array
        int[] vetor = new int[quantidade];
        vetor[0] = 30;
        vetor[1] = 20;
        vetor[2] = 10;
        vetor[3] = 4;
        vetor[4] = 60;
        vetor[5] = 22;
        vetor[6] = 41;
        vetor[7] = 31;
        vetor[8] = 45;
        vetor[9] = 26;
        
        // instância das classes MVC
        OrdenacaoModelagem modelagem = new OrdenacaoModelagem(vetor);
        OrdenacaoVisao visao = new OrdenacaoVisao();
        OrdenacaoControle controle = new OrdenacaoControle(modelagem, visao);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de ordenação:");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.print("Digite sua escolha (1 ou 2): ");
        
        int escolha = scanner.nextInt();
        String metodo;
        
        // escolha do usuário
        switch (escolha) {
            case 1:
                metodo = "Insertion Sort";
                break;
            case 2:
                metodo = "Bubble Sort";
                break;
            default:
                System.out.println("Escolha inválida. Usando Insertion Sort por padrão.");
                metodo = "Insertion Sort";
                break;
        }
        
        // chamada para ordenar e exibir de acordo com o método escolhido
        controle.ordenarEExibir(metodo);
    }
}