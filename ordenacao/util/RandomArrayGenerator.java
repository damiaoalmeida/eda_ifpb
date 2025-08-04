package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomArrayGenerator {
    public static void main(String[] args) {
        int arraySize = 7; // Tamanho do array
        int[] randomArray = generateRandomArray(arraySize, 0, 100);

        // Exibe os números gerados
        System.out.print("Array de números aleatórios: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }

    /**
     * Gera um array de números aleatórios no intervalo especificado.
     *
     * @param size tamanho do array
     * @param min valor mínimo (inclusivo)
     * @param max valor máximo (inclusivo)
     * @return array de números aleatórios
     */
    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    
    public static int[] generateRandomArray(int size) {
    	return generateRandomArray(size, 0, size - 1);
    }
    
    // Função para gerar um array de números aleatórios distintos
    public static int[] generateUniqueRandomArray(int size, int min, int max) {
        if (max - min + 1 < size) {
            throw new IllegalArgumentException("Intervalo muito pequeno para gerar números distintos.");
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            numbers.add(i);
        }

        // Embaralha a lista para garantir aleatoriedade
        Collections.shuffle(numbers);

        // Retorna os primeiros 'size' elementos da lista como array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = numbers.get(i);
        }

        return array;
    }
    
    public static int[] generateUniqueRandomArray(int size) {
    	return generateUniqueRandomArray(size, 0, size - 1);
    }

    public static int[] generateOrderArray(int size) {
    	int array[] = new int[size];
    	for (int i = 0; i < size; i++) {
    		array[i] = i;
    	}
    	return array;
    }
}