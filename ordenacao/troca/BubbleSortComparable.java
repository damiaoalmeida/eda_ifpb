package troca;

import java.util.Arrays;

public class BubbleSortComparable {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    // Troca os elementos
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
            n--; // Reduz o tamanho da varredura a cada iteração
        } while (trocou);
    }

    public static void main(String[] args) {
        // Teste com números
        Integer[] numeros = {5, 3, 8, 1, 4};
        bubbleSort(numeros);
        System.out.println("Ordenado: " + Arrays.toString(numeros));

        // Teste com Strings
        String[] nomes = {"Ana", "Carlos", "Bruno", "Daniel"};
        bubbleSort(nomes);
        System.out.println("Ordenado: " + Arrays.toString(nomes));
    }
}
