package coreJavaAlgorithms;

/**
 * Utility class for sorting algorithms.
 */
public class SelectionSort {

	/**
     * Sorts an array of integers in ascending order using the selection sort algorithm.
     *
     * <p>Time Complexity: O(n^2) in best, average, and worst cases</p>
     * <p>Space Complexity: O(1)</p>
     *
     * @param numbers the array to be sorted
     * @return the sorted array
     * @throws NullPointerException if the input array is null
     */
	public static int[] selectionSort(int[] numbers) {
		
		if (numbers == null) {
			throw new NullPointerException("Array cannot be null.");
		}
		
		for (int i = 0; i < numbers.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[minIndex]) {
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
		}
		
		return numbers;
	}
}
