package kostin_ws_java_javaarrays;

import java.util.Random;

public class H_EighthTask {

	/*
	 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент 
	 * является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
	 */
	
	private int maximum=0;
	
	public int[] eight(int min, int max, int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			// ��������� ���������� ����� � �������� ��������� � Java
			// http://allmycircuitz.blogspot.com/2013/09/java.html
			array[i] = min + (int) (Math.random() * ((max - min) + 1));
		}
		for (int i = 0; i < array.length; i++) {
			if (maximum < array[i]) {
				maximum = array[i];
				System.out.println("Maximum is: " + maximum);
				System.out.println("The element is: " + i);
			}
		}
		return array;
	}

}
