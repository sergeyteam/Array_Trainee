package elementInSquerArr;

import java.util.Arrays;

public class ControlMassiff {
	
	/*Создать массив, каждый элемент которого равен квадрату своего номера
	   Источник: http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/*/

	public static void main(String[] args) throws MyMassiffException {
		
		Massiff mas = new Massiff();
		System.out.println(Arrays.toString(mas.elementIsNumberInSqr(new int[100])));

	}

}
