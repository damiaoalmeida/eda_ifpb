package troca;

import util.RandomArrayGenerator;

public class QuickSortLomuto {

	//Método não recursivo
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

    // Método principal que organiza o array usando o Quick Sort
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            // Particiona o array e retorna a posição do pivô
            int pivoIndex = partition(array, inicio, fim);
            
//            printArray(array, pivoIndex);
            
            // Recursivamente ordena os subarrays
            quickSort(array, inicio, pivoIndex - 1); // Subarray à esquerda
            quickSort(array, pivoIndex + 1, fim);   // Subarray à direita
        }
    }

    // Método para particionar o array
    private static int partition(int[] array, int inicio, int fim) {
        int pivo = array[inicio]; // Escolhe o primeiro elemento como pivô
        int i = inicio;    // Índice para elementos menores que o pivô

        for (int j = inicio + 1; j <= fim; j++) {
            if (array[j] <= pivo) { // Verifica se o elemento é menor ou igual ao pivô
                i++;
                // Troca os elementos array[i] e array[j]
                swap(array, i, j);
            }
        }
        // Coloca o pivô em sua posição correta
        swap(array, i, inicio);
        return i; // Retorna o índice do pivô
    }

    // Método auxiliar para trocar elementos no array
    private static void swap(int[] array, int i, int j) {
    	if(i == j)
    		return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Método para imprimir o array
    private static void printArray(int[] array, int pivo) {
    	for (int num : array) {
    		System.out.print(num + " ");
    	}
    	if(pivo >= 0)
    		System.out.print("  Partition=" + pivo + "\n");
    	else
    		System.out.println();
    }

    // Método principal para testar o algoritmo
    public static void main(String[] args) {
//    	int [] array = RandomArrayGenerator.generateUniqueRandomArray(100);
//    	printArray(array, -1);

      int[] array = {8, 3, 1, 7, 0, 10, 2};
        System.out.println("Array original:");
        printArray(array, -1);

        quickSort(array);

        System.out.println("Array ordenado:");
        printArray(array, -1);
    }
}