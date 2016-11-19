package kostin_ws_java_javaarrays;

public class L_twelvthTask {
	/*
	 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, 
	 * чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок 
	 * следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно 
	 * выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно 
	 * чередуются через один и пр.). Вывести полученный массив на экран.
	 */

	public int[] generateArraay(int size) {
		int[] ar = new int[size];
		int min = -10;
		int max = 10;
		int positiveCounter = 0;
		int negativeCounter = 0;
		int targetValue = 0;
		for (int i = 0; i < ar.length; i++) {
			targetValue = min + (int) Math.floor(Math.random() * ((max - min) + 1));
			if (targetValue != 0) {
				Stop1: if (targetValue < 0) {
					ar[i] = targetValue;
					negativeCounter++;
					if (negativeCounter <= ar.length / 2) {
						continue;
					} else {
						negativeCounter--;
						i--;
						break Stop1;
					}
				}
				Stop2: if (targetValue > 0) {
					ar[i] = targetValue;
					positiveCounter++;
					if (positiveCounter <= ar.length / 2) {
						continue;
					} else {
						positiveCounter--;
						i--;
						break Stop2;
					}
				}
			} else {
				i--;
			}
		}
		System.out.println("������������� �����: " + positiveCounter);
		System.out.println("������������� �����: " + negativeCounter);
		return ar;
	}
}
