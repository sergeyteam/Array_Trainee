package kostin_trainee;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	
	static int y = 1;
	public static int[] genAr() {
		Scanner scan = new Scanner(System.in);
		int size = 0;
		int []array = null;
		for (int i = 0; i < 1; i++) {
			System.out.println("Enter an odd number, please.");
			size = scan.nextInt();
			if ((size % 2) != 0) {
				array = new int[size];
				for (int j = 0; j < array.length; j++) {
					if (j < array.length/2) {
						array[j] = y;
						y++;
					} else {
						array[j] = y;
						y--;
					}
					
				}
			} else {
				System.out.println("You entered wrong number. Try again!");
				i--;
			}
		}
		return array;
	}

	
}
