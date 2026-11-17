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
		
		// Declare a variable to hold the max value
		int max = runBasicOperations(arr);
		
		// Declare a variable to hold the sorted array
		int[] sortedArray = runSortingAlgorithms(arr);
		
		// Call runSearchingAlgorithms() method
		runSearchingAlgorithms(sortedArray, max);
		
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
			size = scanner.nextInt();
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
	
	/**
	 * Executes and prints basic array operations (finding maximum and reversal).
	 *
	 * @param originalArray the input array to operate on
	 * @return the maximum value found in the array
	 */
	private static int runBasicOperations(int[] originalArray) {
		int max = FindMaximum.findMax(originalArray);
		System.out.println("The Maximum Value in the Array: " + max);
		
		int[] reversedArray = ArrayReversal.arrayReverse(Arrays.copyOf(originalArray, originalArray.length));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
		
		return max;
	}
	
	/**
	 * Executes sorting algorithms on defensive copies of the input array and prints the results.
	 *
	 * @param originalArray the input array to be sorted
	 * @return a sorted copy of the array
	 */
	private static int[] runSortingAlgorithms(int[] originalArray) {
		int[] bubbleSort = BubbleSort.bubbleSort(Arrays.copyOf(originalArray, originalArray.length));
		System.out.println("Sorted Array using Bubble Sort: " + Arrays.toString(bubbleSort));
		
		int[] selectionSort = SelectionSort.selectionSort(Arrays.copyOf(originalArray, originalArray.length));
		System.out.println("Sorted Array using Selection Sort: " + Arrays.toString(selectionSort));

		return selectionSort;
	}
	
	/**
	 * Searches for a target value in a sorted array using binary search and prints its index.
	 *
	 * @param sortedArray the sorted array to search within
	 * @param target      the value to search for
	 */
	private static void runSearchingAlgorithms(int[] sortedArray, int target) {
		int maxIndex = BinarySearch.binarySearch(sortedArray, target);
		System.out.println("The Index of the Target in the Array: " + maxIndex);		
	}

}
