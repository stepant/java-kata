package javakata;

public class ArraysFastType {

	public static double computeAverage(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum / numbers.length;
	}

	public static int[] copyToAnotherArray(int[] numbers) {
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		return copy;
	}

	public static int findMaximum(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}

	public static int[] reverse(int[] numbers) {
		int[] temp = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			temp[i] = numbers[numbers.length - i - 1];
		}
		return temp;
	}
	
	public static int[] betterReverse(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length-i-1];
			numbers[numbers.length-i-1] = temp;
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 7, 8, 0, 1, 2, 3, 16, 99, 10, 4, 5 };

		System.out.println("Find maximum of array.");
		System.out.println("Maximum:" + ArraysFastType.findMaximum(numbers));
	}

}
