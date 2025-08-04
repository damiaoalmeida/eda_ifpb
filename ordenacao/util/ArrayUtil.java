package util;

public class ArrayUtil {
	// Método para exibir o array
    public static void printArray(int[] array) {
        for (Object num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] arrayCopy(int[] array) {
    	int n = array.length;
    	int[] copy = new int[n];
    	for (int i = n-1; i >=0; i--) {
    		copy[i] = array[i];
    	}
    	return copy;
    }
}