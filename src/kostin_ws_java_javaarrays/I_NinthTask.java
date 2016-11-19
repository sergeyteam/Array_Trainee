package kostin_ws_java_javaarrays;

import java.util.Arrays;

public class I_NinthTask {
	
	/*
	 * Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив 
	 * из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива должен 
	 * равняться отношению элемента из первого массива с i-ым индексом к элементу из второго 
	 * массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), 
	 * затем вывести количество целых элементов в третьем массиве.
	 */

	private int counter = 0;

	public double[] even(int size) {
		int min = 1;
		int max = 9;
		int[]arr1 = new int[size];
		int[]arr2 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = min + (int)(Math.random()*((max - min) + 1));
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = min + (int)(Math.random()*((max - min) + 1));
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int el1;
		int el2;
		double[]proportion = new double[size];
		for (int i = 0; i < proportion.length; i++) {
			el1 = arr1[i];
			el2 = arr2[i];
			proportion[i] = (double)el1/el2;
		}
		return proportion;
	}
}
