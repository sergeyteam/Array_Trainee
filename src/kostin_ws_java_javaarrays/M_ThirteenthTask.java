package kostin_ws_java_javaarrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class M_ThirteenthTask {

	/*
	 * Пользователь вводит с клавиатуры натуральное число большее 3, которое
	 * сохраняется в переменную n. Если пользователь ввёл не подходящее число,
	 * то программа должна просить пользователя повторить ввод. Создать массив
	 * из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
	 * Создать второй массив только из чётных элементов первого массива, если
	 * они там есть, и вывести его на экран.
	 */
	
	private static int generateNumber() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter a number that should be above than number 3");
		int size = 0;
		for (int i = 0; i < 1; i++) {
			size = myScan.nextInt();
			if (size > 3) {
				System.out.println(size);
			} else {
				System.out.println("You pasted wrong number! Please try again.");
				i--;
			}
		}
		myScan.close();
		return size;
	}

	public static int[] getArray() {
		int size = generateNumber();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(size);
		}
		System.out.println(Arrays.toString(createNewArray(arr)));
		return arr;
	}

	private static int[] createNewArray(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2) == 0 && arr[i] != 0) {
				counter++;
			}
		}
		int newArray[] = new int[counter];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if ((arr[i] % 2) == 0 && arr[i] != 0) {
				newArray[j] = arr[i];
				j++;
			}
		}
		return newArray;
	}

}
