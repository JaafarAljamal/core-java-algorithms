package coreJavaAlgorithms;

/**
 * Utility class for sorting algorithms.
 */
public class BubbleSort {
	
	/**
     * Sorts an array of integers in ascending order using the optimized bubble sort algorithm.
     * 
     * <p>Time Complexity: O(n) best case (when already sorted), O(n^2) average and worst case</p>
     * <p>Space Complexity: O(1)</p>
     * 
     * @param numbers the array to be sorted
     * @return the sorted array
     * @throws NullPointerException if the input array is null
     */
	public static int[] bubbleSort(int[] numbers) {
		if (numbers == null) {
			throw new NullPointerException("Array cannot be null.");
		}
		for (int i = 0; i < numbers.length - 1; i++) {
			boolean swapped = false;
			
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swapped = true;
				}
			}
			
			if (!swapped) {
				break;
			}
		}
		
		return numbers;
	}

}
