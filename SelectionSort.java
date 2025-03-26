package Beginners;

public class SelectionSort {
	public static void main(String[] args) {
			int[] unSortedArray = {10, 1, 6, 26, 14, 2, 12, 20, 4, 24};
			
			
			// Call the selection sort method
			selectionSort(unSortedArray);
			
			// Print the sorted array
			System.out.println("Sorted array:");
			for(int num : unSortedArray) {
				System.out.print(num + "");
			}
	}

	private static void selectionSort(int[] unSortedArray) {
		int n = unSortedArray.length;
		
		for (int i = 0; i < n -1; i++) {
			int minIndex = i;
			for(int j = i + 1; j< n; j++) {
				if(unSortedArray[j] < unSortedArray[minIndex]) {
					minIndex = j;
					
				}
				
			}
			int temp = unSortedArray[minIndex];
			unSortedArray[minIndex] = unSortedArray[i];
			unSortedArray[i] = temp;
			
		
			
		}
		
	
	}
	
	
}
