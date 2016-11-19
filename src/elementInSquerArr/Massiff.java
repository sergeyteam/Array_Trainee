package elementInSquerArr;

public class Massiff {
	
	/*Создать массив, каждый элемент которого равен квадрату своего номера
   Источник: http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/*/
	
	public int[] elementIsNumberInSqr(int[] arr) throws MyMassiffException{
		validate(arr);
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[temp]=i*i;
			temp++;
		}
		return arr;
	}
	
	public void validate(int [] arr) throws MyMassiffException{
		if (arr == null) {
			throw new MyMassiffException("This array haven't be NULL!!!");
		}
		if (arr.length <= 2) {
			throw new MyMassiffException("Arrays length cannot be less or equals 2");
		}
	}
}
