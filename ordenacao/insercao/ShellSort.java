package insercao;

public class ShellSort {
    public static void shellSort(int[] array) {
        int n = array.length;
        // Inicializa o gap como metade do tamanho do array
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Aplica uma variação do Insertion Sort para o gap atual
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                // Move elementos maiores para frente
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
    }
    
    

    public static void main(String[] args) {
        int[] array = {8, 5, 3, 2, 6};
        shellSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}