package etapa1;

import java.util.Arrays;

public class Permutacao {
    public static void main(String[] args) {
        int[] elementos = {1, 2, 3};
        gerarPermutacoes(elementos, 0);
    }

    public static void gerarPermutacoes(int[] array, int indice) {
        if (indice == array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }

        for (int i = indice; i < array.length; i++) {
            trocar(array, indice, i);                      // troca atual
            gerarPermutacoes(array, indice + 1);           // chamada recursiva
            trocar(array, indice, i);                      // desfaz a troca (backtracking)
        }
    }

    private static void trocar(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

