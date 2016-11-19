package kostin_ws_java_javaarrays;

import java.util.Arrays;

public class B_SecondTask {

	/*
	 * Создайте массив из всех нечётных чисел от 1 до 99, 
	 * выведите его на экран в строку, а затем этот же массив 
	 * выведите на экран тоже в строку, но в обратном порядке
	 * (99 97 95 93 � 7 5 3 1).
	 */

	int count = 0;
	int elementCount = 0;
	int elBackCount = 0;
	
	public int[] justOdd(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			mass[i] = i;
			if ((mass[i]%2) != 0) {
				count++;
			}
		}
		int[] arg = new int [mass.length - count];
		System.out.println(arg.length);
		for (int i = 0; i < mass.length; i++) {
			if ((mass[i]%2) != 0) {
				arg[elementCount] = i;
				elementCount++;
			}
		}
		
		int[]arg2 = new int[arg.length];
		for (int i = 0; i < arg.length; i++) {
			System.arraycopy(arg, 0, arg2, 0, arg.length);
		}
		System.out.print("[" );
		for (int i = arg2.length-1; i > 0; i--) {
			arg2[elBackCount] = i;
			elBackCount++;
			System.out.print(arg2[i] + ", ");
		}
		System.out.print("]" );
		
		System.out.println();
		return arg;
	}

}
