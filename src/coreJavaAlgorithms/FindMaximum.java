package coreJavaAlgorithms;

/**
 * Provides utility methods for finding the maximum value in an array of integers.
 */
public class FindMaximum {
	
	/**
     * Finds and returns the maximum value in the given array of integers.
     *
     * @param numbers the array of integers to search
     * @return the maximum integer found in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
	public static int findMax(int[] numbers) {
		
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Array cannot be null or empty");
		}
		
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		return max;
	}

}
