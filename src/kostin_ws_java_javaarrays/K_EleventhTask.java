package kostin_ws_java_javaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class K_EleventhTask {
	/*
	 * Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив 
	 * указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого 
	 * программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: 
	 * левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, 
	 * то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
	 */
	
	final static String LEFT = "Left side is bigger: ";
	final static String RIGHT = "Right side is bigger: ";
	final static String EQUAL = "Sides are equal: ";

	private int createSizeOfTheArray() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter the even number");
		for (int i = 0; i < 1; i++) {
			num = scan.nextInt();
			if ((num % 2) == 0) {
			} else {
				System.out.println("You entered a not even number!!! Try again.");
				i--;
			}
		}
		scan.close();
		return num;
	}

	public void generateArray() {
		int size = createSizeOfTheArray();
		int arr[] = new int[size];
		int max = 5;
		int min = -5;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) Math.floor(Math.random() * (max - min) + 1);
		}
		System.out.println(Arrays.toString(arr));
		defineWhichPartIsBigger(arr);
	}

	private void defineWhichPartIsBigger(int[] arr) {
		int middle;
		int sumLeftSide = 0;
		int sumRightSide = 0;
		for (int i = 0; i < arr.length; i++) {
			middle = arr.length/2;
			if (i <= middle-1) {
				sumLeftSide += arr[i]; 
			}
			if (i >= middle) {
				sumRightSide += arr[i]; 
			}
		}
		if (sumLeftSide == sumRightSide) {
			System.out.println(EQUAL + sumLeftSide + " and " + sumRightSide);
		} else {
			if (sumLeftSide > sumRightSide) {
				System.out.println(LEFT + sumLeftSide);
			} else {
				System.out.println(RIGHT + sumRightSide);
			}
		}
	}
}
