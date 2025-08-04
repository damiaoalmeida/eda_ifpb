package insercao;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            // Move elementos maiores que a chave para frente
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 5, 2};
        insertionSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
