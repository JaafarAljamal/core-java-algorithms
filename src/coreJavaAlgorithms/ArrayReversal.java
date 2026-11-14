package coreJavaAlgorithms;

/**
 * Utility class for array manipulation algorithms.
 */
public class ArrayReversal {

	/**
	 * Reverses the elements of an integer array in-place.
	 * 
	 * <p>Time Complexity: O(n)</p>
	 * <p>Space Complexity: O(1)</p>
	 * 
	 * @param array the array to be reversed
	 * @return the reversed array
	 */
	public static int[] arrayReverse(int[] array) {

		// Validate input to prevent null pointer exceptions
		if (array == null) {
			throw new NullPointerException("Array cannot be null.");
		}
		
		int temp;
		
		// Iterate up to the middle of the array for in-place swapping
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			
			// Swap the current element with its symmetric counterpart from the end
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		return array;
	}
}
