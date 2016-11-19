package kostin_ws_java_javaarrays;

public class G_SeventhTask {
	/*
	 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
	 * Напоминаем, что первый и второй члены последовательности равны единицам,
	 * а каждый следующий — сумме двух предыдущих.
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, ....
	 */

	private int counter = 0;

	public int[] fibonacci() {
		int[]fab = new int[25];
		for (int i = 3; i < fab.length; i++) {
			fab[0] = 0;
			fab[1] = 1;
			fab[2] = fab[0] + fab[1];
			fab[i] = fab[i-2] + fab[i-1];
		}
		return fab;
	}
}
