package randomsOneAndZero;

import java.util.Arrays;

public class MainOneZero {

	public static void main(String[] args) throws OneZeroRandomException {
		
		OneZeroRandoms oz = new OneZeroRandoms();
		System.out.println(Arrays.toString(oz.oneAndZero(new int[10])));

	}

}
