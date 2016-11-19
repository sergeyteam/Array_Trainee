package incrementArray;

import java.util.Arrays;

public class RUN_IncrementArray {

	public static void main(String[] args) {
		
		IncrementArrayClass inc = new IncrementArrayClass();
		int ar [] = {3,9};
		System.out.println(Arrays.toString(inc.incrementArray(ar)));
	}

}
