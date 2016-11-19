package kostin_ws_java_javaarrays;

import java.util.Arrays;

public class J_Tenth {
	/*
	 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
	 * Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
	 * Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего
	 */

	public void generateArray(int size) {
		int[] arr = new int[size];
		int min = -1;
		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) Math.floor(Math.random() * ((max - min) + 1));
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		defineElementIsMoreOften(arr);
	}

	private void defineElementIsMoreOften(int[] arr) {
		int zeroCounter = 0;
		int minusCounter = 0;
		int plusCounter = 0;
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case -1:
				minusCounter++;
				break;
			case 0:
				zeroCounter++;
				break;
			case 1:
				plusCounter++;
				break;
			default:
				break;
			}
		}
		showConclusion(plusCounter, minusCounter, zeroCounter);
	}

	private void showConclusion(int plusCounter, int minusCounter, int zeroCounter) {
		if (zeroCounter > plusCounter && zeroCounter > minusCounter) {
			System.out.println(
					"Element Zero meets more times than other elements in the array - " + zeroCounter + " times");
		}
		if (plusCounter > minusCounter && plusCounter > zeroCounter) {
			System.out
					.println("Element 1 meets more times than other elements in the array - " + plusCounter + " times");
		}
		if (minusCounter > plusCounter && minusCounter > zeroCounter) {
			System.out.println(
					"Element -1 meets more times than other elements in the array - " + minusCounter + " times");
		}
		if (zeroCounter == plusCounter || zeroCounter == minusCounter|| plusCounter == minusCounter) {
			System.out.println("There are no major or minor numbers of the array. Some digits are same ");
		}

	}
}
