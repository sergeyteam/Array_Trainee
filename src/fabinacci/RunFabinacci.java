package fabinacci;

import java.util.Arrays;

public class RunFabinacci {
	
	/* Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. 
	   Напоминаем, что первый и второй члены последовательности равны единицам, 
	   а каждый следующий — сумме двух предыдущих.
	*/

	public static void main(String[] args) {
		
		Fabinacci f = new Fabinacci();
		System.out.println(Arrays.toString(f.fabinacci(20)));
		;
	}

}
