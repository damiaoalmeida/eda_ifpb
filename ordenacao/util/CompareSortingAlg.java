package util;

import distribuicao.RadixSortLSD;
import insercao.InsertionSort;
import insercao.ShellSort;
import intercalacao.MergeSort;
import selecao.HeapSort;
import selecao.SelectionSort;
import troca.BubbleSort;
import troca.QuickSortHoare;
import troca.QuickSortLomuto;

public class CompareSortingAlg {
	public static void main(String[] args) {
		int [] array = RandomArrayGenerator.generateRandomArray(10000000);
//				RandomArrayGenerator.generateOrderArray(100000);
		ArrayUtil.printArray(array);

//		testBubbleSort(array.clone());
//		testSelectionSort(array.clone());
//		testInsertionSort(array.clone());
//		testShellSort(ArrayUtil.arrayCopy(array));
//		testQuickSortLomuto(array.clone());
		testQuickSortHoare(ArrayUtil.arrayCopy(array));
		testHeapSort(array.clone());
//		testRadixSortLSD(ArrayUtil.arrayCopy(array));
		testMergeSort(ArrayUtil.arrayCopy(array));
	}

	private static void testBubbleSort(int[] array) {
		long t1 = System.currentTimeMillis();
		BubbleSort.bubbleSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Bubble sort: " + (t2-t1));
	}
	
	private static void testSelectionSort(int[] array) {
		long t1 = System.currentTimeMillis();
		SelectionSort.selectionSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Selection sort: " + (t2-t1));
	}
	
	private static void testInsertionSort(int[] array) {
		long t1 = System.currentTimeMillis();
		InsertionSort.insertionSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Insertion sort: " + (t2-t1));
	}
	
	private static void testShellSort(int[] array) {
		long t1 = System.currentTimeMillis();
		ShellSort.shellSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Shell sort: " + (t2-t1));
	}

	private static void testQuickSortLomuto(int[] array) {
		long t1 = System.currentTimeMillis();
		QuickSortLomuto.quickSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Quick sort(L): " + (t2-t1));
	}

	private static void testQuickSortHoare(int[] array) {
		long t1 = System.currentTimeMillis();
		QuickSortHoare.quickSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Quick sort(H): " + (t2-t1));
	}

	private static void testHeapSort(int[] array) {
		long t1 = System.currentTimeMillis();
		(new HeapSort ()).heapSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Heap sort(L): " + (t2-t1));
	}

	private static void testRadixSortLSD(int[] array) {
		long t1 = System.currentTimeMillis();
		RadixSortLSD.radixsort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Radix sort: " + (t2-t1));
	}
	
	private static void testMergeSort(int[] array) {
		long t1 = System.currentTimeMillis();
		MergeSort.mergeSort(array);
		long t2 = System.currentTimeMillis();
		System.out.println("Merge sort: " + (t2-t1));
	}
}