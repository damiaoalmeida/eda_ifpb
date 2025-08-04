package selecao;

public class HeapSort {
    public void heapSort(int[] array) {
        int n = array.length;

        // Construir Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrair elementos do heap
        for (int i = n - 1; i > 0; i--) {
            // Mover a raiz para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Chamar heapify para reorganizar o heap
            heapify(array, i, 0);
        }
    }

    // Função para reorganizar o heap
    void heapify(int[] array, int n, int i) {
        int largest = i; // Inicializar o maior como raiz
        int left = 2 * i + 1; // Filho esquerdo
        int right = 2 * i + 2; // Filho direito

        // Se o filho esquerdo for maior que a raiz
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Se o filho direito for maior que o maior até agora
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Se o maior não for a raiz
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursivamente aplicar ao subheap afetado
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        HeapSort sorter = new HeapSort();
        System.out.println("Array antes da ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        sorter.heapSort(array);

        System.out.println("Array após a ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

