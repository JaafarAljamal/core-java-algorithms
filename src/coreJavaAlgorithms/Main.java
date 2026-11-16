package coreJavaAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main entry point for the Core Java Algorithms application.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== Core Java Algorithms ===");
		
		int[] arr = readArrayFromConsole(scanner);
		System.out.println("Entered Array: " + Arrays.toString(arr));
						
		// Integrate FindMaximum.findMax(arr) method
		int max = FindMaximum.findMax(arr);
		System.out.println("The Maximum Value in the Array: " + max);
		
		// Integrate BubbleSort.bubbleSort(arr) method to a copy of arr
		int[] sortedArr = BubbleSort.bubbleSort(Arrays.copyOf(arr, arr.length));
		System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
		
		// Integrate BinarySearch.binarySearch(arr, target) method
		int maxIndex = BinarySearch.binarySearch(sortedArr, max);
		System.out.println("The Index of the Target in the Array: " + maxIndex);
		
		// Integrate ArrayReversal.arrayReverse(arr) method
		int[] reversedArray = ArrayReversal.arrayReverse(Arrays.copyOf(arr, arr.length));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
		
		scanner.close();
	}
	
	/**
     * Reads an array of integers from the console with input validation.
     *
     * @param scanner the Scanner object for reading input
     * @return the populated array of integers
     */
	private static int[] readArrayFromConsole(Scanner scanner) {
		
		System.out.print("Array Size = ");
		
		while (! scanner.hasNextInt()) {
			System.out.print("Invalid input. Please enter an integer.");
			scanner.next();
			System.out.print("Array Size = ");
		}
		
		int size = scanner.nextInt();
		
		while (size <= 0) {
			System.out.print("Size must be greater than zero. Array Size = ");
			scanner.nextInt();
		}
		
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("Element " + i + " = ");
			
			while (! scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter an integer.");
				scanner.next();
				System.out.print("Element " + i + " = ");
			}
			
			array[i] = scanner.nextInt();
		}
		
		return array;
	}

}
