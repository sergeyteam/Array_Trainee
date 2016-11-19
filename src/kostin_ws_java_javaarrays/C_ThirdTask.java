package kostin_ws_java_javaarrays;

public class C_ThirdTask {

	/*
	 * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. 
	 * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
	 */
	
	int evenCount = 0;
	int sum;
	public int[] fifteenRandom() {
		int m = 15;
		int[] mass = new int[m];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int)Math.floor(Math.random()*10);
			System.out.print(mass[i] + ", ");
		}
		System.out.println("\n");
		for (int i = 0; i < mass.length; i++) {
			if (((mass[i]%2) == 0)&&(mass[i]!=0)) {
				System.out.print(mass[i] + ", ");
				evenCount++;
			}
		}
		
		System.out.println("\n" + evenCount + "����� ������ �����");
		
		return mass;
	}
}
