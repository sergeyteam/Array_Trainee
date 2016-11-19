package polindrom;

import java.util.Arrays;

/*Создать массив, который одинаково читается как слева направо, так и справа налево.
 Источник: http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/
 */
public class Polindrom {
	static int y;

	public int[] isPolindrom(int[]arr) throws PolindromException {
		validate(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i< arr.length/2) {
				arr[i] = y;
				y++;
			} else {
				arr[i] = y;
				y--;
			}
		}
		return arr;
	}

	public void validate(int[] arr) throws PolindromException {
		if (arr==null) {
			throw new PolindromException("The array hasn't be null");
		}
		if (arr.length <= 2) {
			throw new PolindromException("The array must have lenth above two elements");
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr.length%2) == 0) {
				throw new PolindromException("The array must have lenth that is not even multiplicity");
			}
		}
	}

}