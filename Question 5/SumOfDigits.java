class SumOfDigits {

	public static void main(String[] args) {
		int i = 1234;
		int num = i;
		int temp = 0;
		int rem = 0;
		
		while(i != 0) {
			rem = i%10;
			temp = temp + rem;
			i= i/10;
		}
		System.out.println("Given Number: " + num);
		System.out.println("Sum of the given number is: " + temp);
	}

}