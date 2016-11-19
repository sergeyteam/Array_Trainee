package fabinacci;

public class Fabinacci {

	/* Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. 
	   Напоминаем, что первый и второй члены последовательности равны единицам, 
	   а каждый следующий — сумме двух предыдущих.
	   1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946
	*/
	
	public int[] fabinacci(int num) {
		int [] fabin = new int [num];
		fabin [0] = 1;
		fabin [1] = 1;
		fabin [2] = fabin[0] + fabin[1];
		for (int i = 3; i < fabin.length; i++) {
			fabin[i] = fabin[i-1] + fabin[i-2];
		}
		return fabin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*
function fib(n) {
	  var a = 1,
	    b = 1;
	  for (var i = 3; i <= n; i++) {
	    var c = a + b;
	    a = b;
	    b = c;
	  }
	  return b;
	}
*/