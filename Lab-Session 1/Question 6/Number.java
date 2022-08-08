public class Number {
	
	//The signed shift n>>31 converts every negative number into -1
	
	//When we do a n>>31, if it is a negative number then it will return 0
	
	// Formula - [ 1 + (n>>31) – (-n>>31) ]
	//	     [ 1 +  (-1)   -   (0)    ] = 0
	
	
	public static void main(String[] args) {
		int i = 123654654;
		System.out.println("Number is: " + i);
		if ((1 + (i >> 31) - (-i>>31)) == 0) {
			System.out.println("Given Number is 'Negative'");
		} else {
			System.out.println("Given Number is 'Positive'");
		}
	}
}