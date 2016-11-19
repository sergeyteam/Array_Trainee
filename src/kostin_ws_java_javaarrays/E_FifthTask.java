package kostin_ws_java_javaarrays;

import java.util.Arrays;

public class E_FifthTask {

	/*
	 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
	 * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
	 * арифметическое элементов каждого массива и сообщите, для какого из
	 * массивов это значение оказалось больше (либо сообщите, что их средние
	 * арифметические равны).
	 */

	public double twoArrays(int m) {
		double theMost = 0;
		double average1 = 0;
		double sum1 = 0;
		double average2 = 0;
		double sum2 = 0;
		double[] ar1 = new double[m];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = Math.floor(Math.random() * 5);
			sum1 += ar1[i];
			average1 = sum1 / ar1.length;
		}
		System.out.println(Arrays.toString(ar1));
		System.out.println(average1);

		double[] ar2 = new double[m];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = Math.floor(Math.random() * 5);
			sum2 += ar2[i];
			average2 = sum2 / ar2.length;
		}
		System.out.println(Arrays.toString(ar2));
		System.out.println(average2);
		if (average1 > average2) {
			theMost = average1;
		} else {
			theMost = average2;
		}
		return theMost;
	}
}
