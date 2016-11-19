package epumTest;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 3, 5, 6, 5, 4, 5, 7, 7, 2 };
		int a = 5;
		int[] result = sort(arr, a);
		System.out.print(Arrays.toString(result));


	}

	public static int[] sort(int arr[], int a) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				count++;
			}
		}
		int[] newarr = new int[arr.length - count];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != a) {
				newarr[j] = arr[i];
				j++;
			}
		}
		
		return newarr;
	}
	// создай клас и запихни

}
