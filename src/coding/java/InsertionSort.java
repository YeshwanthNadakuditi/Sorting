package coding.java;

class InsertionSort {

	static int[] sortingTechnique(int[] insertionSortArray) {
		for (int currentEle = 1; currentEle < insertionSortArray.length; ++currentEle) {
			int key = insertionSortArray[currentEle], loc = currentEle - 1;
			while (loc >= 0 && key < insertionSortArray[loc]) {
				insertionSortArray[loc + 1] = insertionSortArray[loc];
				loc = loc - 1;
			}
			insertionSortArray[loc + 1] = key;
		}
		return insertionSortArray;
	}

}
