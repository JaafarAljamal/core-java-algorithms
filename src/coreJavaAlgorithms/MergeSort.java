package coreJavaAlgorithms;

import java.util.Arrays;

/**
 * Utility class for sorting algorithms using Divide and Conquer.
 */
public class MergeSort {

	/**
     * Sorts an array of integers in ascending order using the merge sort algorithm.
     *
     * <p>Time Complexity: O(n log n) in all cases (best, average, and worst)</p>
     * <p>Space Complexity: O(n) due to auxiliary arrays created during splitting and merging</p>
     *
     * @param numbers the array to be sorted
     * @return a new sorted array
     * @throws NullPointerException if the input array is null
     */
	public static int[] mergeSort(int[] numbers) {
		
		if (numbers == null) {
			throw new NullPointerException("Array cannot be null.");
		}
		
		if (numbers.length <= 1) {
			return Arrays.copyOf(numbers, numbers.length);
		}
		
		int mid = numbers.length / 2;
		int[] left = Arrays.copyOfRange(numbers, 0, mid);
		int[] right = Arrays.copyOfRange(numbers, mid, numbers.length);
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		
		return merge(left, right);
	}
	
	/**
     * Merges two sorted arrays into a single sorted array.
     */
	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}
		
		while (i < left.length) {
			result[k++] = left[i++];
		}
		
		while (j < right.length) {
			result[k++] = right[j++];
		}
		
		return result;
	}
	
}
