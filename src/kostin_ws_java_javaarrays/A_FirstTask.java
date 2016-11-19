package kostin_ws_java_javaarrays;

public class A_FirstTask {

	private int m = 0;
	private int count;

	public int[] first(int[] args) {
		for (int i = 0; i < args.length; i++) {
			args[i] = i;
			if ((args[i] % 2) != 0) {
				m++;
			}
		}
		System.out.println(m);
		int[] ar = new int[args.length - m];
		for (int i = 0; i < args.length; i++) {
			if ((args[i] % 2) != 0) {
				ar[count] = i;
				count++;
			}
		}
		for (int i = ar.length-1; i > 0; i--) {
			System.out.print(ar[i] + ", ");
		}
		System.out.println();
		return ar;
	}
	
	
}
