package javakata;

public class FizzBuzz {
	
	public static String getFizzBuzz(int number) {
		if(number % 15 == 0) return "fizzbuzz";
		else if(number % 3 == 0) return "fizz";
		else if(number % 5 == 0) return "buzz";
		return Integer.toString(number);
	}
		
	public static void main(String[] args) {
		System.out.println("Running FizzBuzz...");

	}

}
