package coreJavaAlgorithms;

/**
 * Utility class for searching algorithms.
 */
public class BinarySearch {

	/**
    * Searches for a target value in a sorted integer array using the binary search algorithm.
    * 
    * <p>Time Complexity: O(log n)</p>
    * <p>Space Complexity: O(1)</p>
    * 
    * @param numbers the sorted array to be searched
    * @param target the value to search for
    * @return the index of the target if found, or -1 if not found
    * @throws NullPointerException if the input array is null
    */
	public static int binarySearch(int[] numbers, int target) {
		
		if (numbers == null) {
			throw new NullPointerException("Array cannot be null.");
		}
		
		int left = 0;
		int right = numbers.length -1;
		
		while (right >= left) {
			int mid = (right - left) / 2 + left;
			if (target < numbers[mid]) {
				right = mid - 1;
			} else if (target > numbers[mid]) {
				left = mid + 1;
			} else return mid;
		}
		
		return -1;
	}
}
