package randomsOneAndZero;

import java.util.Random;

/*
 Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.
 Источник: http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/ 
 */

public class OneZeroRandoms {

	Random rand = new Random();
	private static int digit;
	private static int counter;

	public int[] oneAndZero(int[] arr) throws OneZeroRandomException {
		validate(arr);
		for (int i = 0; i < arr.length; i++) {
			digit = rand.nextInt(2);
			arr[i] = digit;
			if (digit < 1) {
				counter--;
			} else {
				counter++;
			}
			if (counter < 0) {
				i--;
			}
		}
		return arr;
	}

	public void validate(int []arr) throws OneZeroRandomException{
		if (arr == null) {
			throw new OneZeroRandomException("The Array hasn't be null");
		}
		if(arr.length <= 2){
			throw new OneZeroRandomException("The Array's lenth must have minimum three elements");
		}
	}

}
