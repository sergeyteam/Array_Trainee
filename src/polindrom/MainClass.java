package polindrom;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) throws PolindromException {

		Polindrom pol = new Polindrom();
		System.out.println(Arrays.toString(pol.isPolindrom(new int[9])));
		
	}
}
