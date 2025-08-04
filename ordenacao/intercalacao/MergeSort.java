package intercalacao;

public class MergeSort {
	
	public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);		
	}

    // Função principal do Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // Divide a lista em duas partes
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Mescla as partes ordenadas
            merge(array, left, middle, right);
        }
    }

    // Função para mesclar duas sublistas
    public static void merge(int[] array, int left, int middle, int right) {
        //Calculando o tamanho dos arrays
    	int n1 = middle - left + 1;
        int n2 = right - middle;

        // Cria arrays temporários
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copia os elementos para os arrays temporários
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Índices iniciais dos arrays
        int i = 0, j = 0;
        int k = left;

        // Mescla as sublistas
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de leftArray
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de rightArray
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Teste do algoritmo
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array original:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");
        printArray(array);
    }

    // Função auxiliar para imprimir o array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
