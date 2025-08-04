package troca;

public class QuickSortHoare {
	
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
	}

    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = partition(array, inicio, fim);
            quickSort(array, inicio, partitionIndex);
            quickSort(array, partitionIndex + 1, fim);
        }
    }

    private static int partition(int[] array, int inicio, int fim) {
        int pivot = array[inicio]; // Escolhe o pivô como o último elemento
        int e = inicio - 1;
        int d = fim + 1;

        while (true) {
            do {
                e++;
            } while (array[e] < pivot);

            do {
                d--;
            } while (array[d] > pivot);

            if (e >= d) {
                return d; // Retorna o índice de partição
            }

            // Troca os elementos em 'e' e 'd'
            int temp = array[e];
            array[e] = array[d];
            array[d] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {110, 80, 30, 90, 40, 50, 70, 91};
//    	int[] array = {4,5};
        quickSort(array, 0, array.length - 1);

        System.out.println("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
