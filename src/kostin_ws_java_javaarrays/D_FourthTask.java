package kostin_ws_java_javaarrays;

import java.util.Arrays;

public class D_FourthTask {
	
	/*
	 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. 
	 * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
	 */

	public int[] replaceToZero(int [] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) Math.floor(Math.random()*10);
		}
		System.out.println(Arrays.toString(ar));
		for (int i = 0; i < ar.length; i++) {
			if ((ar[i]%2) != 0) {
				ar[i] = 0;
			}
		}
//		System.out.println("\n");
		return ar;
	}
}
