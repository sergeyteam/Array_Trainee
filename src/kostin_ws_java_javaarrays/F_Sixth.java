package kostin_ws_java_javaarrays;

import java.util.Arrays;
	/*
	 * —оздайте массив из 4 случайных целых чисел из отрезка [10;99], 
	 * выведите его на экран в строку. ќпределить и вывести на экран 
	 * сообщение о том, €вл€етс€ ли массив строго возрастающей последовательностью.
	 */
public class F_Sixth {
	
	
	public int[] sixthTask() {
		int[]rand = new int[4];
		for (int i = 0; i < rand.length; i++) {
			int digit = (int)Math.floor(Math.random()*100);
			if (10 <= digit && digit <= 99) {
				rand[i] = digit;
			} else {
				i--;
			}
		}
		for (int i = 0; i < rand.length-1; i++) {
			if (rand[i] < rand[i+1]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		return rand;
	}
}