package troca;

public class BubbleSort {

    // Método para ordenar um array usando Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        // Loop para repetir o processo de ordenação
        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            // Comparação dos elementos adjacentes
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca dos elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Indica que houve troca nesta passagem
                    trocou = true;
                }
//                printArray(array);
            }

            // Se nenhuma troca foi feita, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    }

    // Método para exibir o array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
//        int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
    	int [] array = {35, 80, 30, 81, 40};

        System.out.println("Array original:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
