/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */

public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}
	
	public static String main(String str) {
		return "Overloaded main method was passed \"" + str + "\".";
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public static boolean isDivisibleBy7(int num) {
		return num % 7 == 0;
	}

	public static int findMin(int num1, int num2, int num3) {
		return (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static double average(int[] arr) {
		double total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total / arr.length;
	}
	
	public static void toLowerCase(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].toLowerCase();
		}
	}
	
	public static String[] toLowerCaseCopy(String[] arr) {
		String[] copy = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i].toLowerCase();
		}
		return copy;
	}
	
	public static void removeDuplicates(int[] arr) {
		for(int lookAtInd = 0; lookAtInd < arr.length; lookAtInd++) {
			int lookAtNum = arr[lookAtInd];
			for(int i = lookAtInd + 1; i < arr.length; i ++) {
				if(arr[i] == lookAtNum) {
					arr[i] = 0;
					arr[lookAtInd] = 0;
				}
			}
		}
	}
}
