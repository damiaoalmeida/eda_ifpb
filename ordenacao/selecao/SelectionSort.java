package selecao;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento na parte não ordenada
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca o menor elemento com o primeiro da parte não ordenada
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array antes da ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(array);

        System.out.println("Array após a ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
