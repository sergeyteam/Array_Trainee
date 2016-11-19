import java.util.Arrays;

public class WhoNOTLegal {

	public int[] aboutNums(int[] array) throws MYarraysException {
		validate(array);
		for (int i = 1; i < array.length; i++) {
			int a = i % 2;
			int temp = i%5;
			switch (a) {
			case 0:
				array[i] = 1;
				break;

			default:
				array[i] = temp;
				break;
			}
		}
		return array;
	}

	public void validate(int[] array) throws MYarraysException{
		if (array == null) {
			throw new MYarraysException("the array cannot be  null");
		}
		if (array.length <= 2) {
			throw new MYarraysException("the arrays length cannot be less 2");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i]<0) {
				throw new MYarraysException("The array mustn't has variety below or equals 0");
		}
		}
		
	}

	public static void main(String[] args) throws MYarraysException {

		/*
		 * Создать массив, на четных местах в котором стоят единицы, а на
		 * нечетных местах - числа, равные остатку от деления своего номера на
		 * 5.
		 */

		WhoNOTLegal who = new WhoNOTLegal();
		System.out.println(Arrays.toString(who.aboutNums(new int[100])));
		
	}

}
