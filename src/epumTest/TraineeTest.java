package epumTest;

import java.util.Arrays;

public class TraineeTest {

	public static void main(String[] args) {

		int [] ourArray = new int[]{ 8, 3, 5, 6, 5, 4, 5, 7, 7, 2 };
		int var = 5;
		int var2 = 7;
		int result[] = sort(ourArray, var, var2);
	
		System.out.println(Arrays.toString(result));
	}

	private static int[] sort(int[] ourArray, int var, int var2) {
		int counter = 0;
		for (int i = 0; i < ourArray.length; i++) {
			if (ourArray[i] == var || ourArray[i] == var2) {
				counter++;
			}
		}
		int resulto[] = new int[ourArray.length - counter];
		for (int i = 0, temp=0; i < ourArray.length; i++) {
			if (ourArray[i] != var && ourArray[i] != var2) {
				resulto[temp] = ourArray[i];
				++temp;
			}
		}
		return resulto;
	}
	
	

}
