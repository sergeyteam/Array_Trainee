package incrementArray;

public class IncrementArrayClass {
	
	public int[] incrementArray(int[] arr) {
		int derivedAr[] = arr.clone();
		for (int i = arr.length-1;; i--) {
			if (i < 0) {
				derivedAr = new int [arr.length + 1];
				derivedAr[0] = 1;
				break;
			}
			if (arr[i] + 1 == 10) {
				derivedAr[i] = 0;
				
			} else {
				derivedAr[i] = ++arr[i];
				break;
			}
		}
		return derivedAr;
	}

}
