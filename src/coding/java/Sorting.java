package coding.java;

import java.util.Arrays;

import coding.java.InsertionSort;

public class Sorting {

	public void evaluateSortingAlg(int[] arrayToSort) {
		displayInitialUnsortedArray(arrayToSort);
		if (arrayToSort.length <= 10) {
			displayFinalSortedArray(InsertionSort.sortingTechnique(arrayToSort));
		}
	}

	public void displayInitialUnsortedArray(int[] unSortedArray) {
		System.out.println("The Initial unsorted array is : " + Arrays.toString(unSortedArray));
	}

	public void displayFinalSortedArray(int[] sortedArray) {
		System.out.println("The final sorted array is : " + Arrays.toString(sortedArray));
	}
}
