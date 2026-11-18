package coreJavaAlgorithms;

/**
 * Utility class for sorting algorithms.
 */
public class InsertionSort {

	/**
     * Sorts an array of integers in ascending order using the insertion sort algorithm.
     *
     * <p>Time Complexity: O(n^2) in average and worst cases; O(n) in best case (already sorted)</p>
     * <p>Space Complexity: O(1)</p>
     *
     * @param numbers the array to be sorted
     * @return the sorted array
     * @throws NullPointerException if the input array is null
     */
	public static int[] insertionSort(int[] numbers) {
		if (numbers == null) {
			throw new NullPointerException("Array cannot be null.");
		}
		for (int i = 1; i < numbers.length; i++) {
			int key = numbers[i]; // 1
			int j = i - 1;
			
			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			
			numbers[j + 1] = key;
		}
		
		return numbers;
	}
}
