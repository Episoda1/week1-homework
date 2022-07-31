package week3classwork;

public class week3classwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 8, 13, 6};
		
		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);
		// loop
		 for (int i = 0; i < array.length; i++ ) {
			 System.out.println(array[i]);
		 }
		 // enhanced for loop
		for (int number : array) {
			System.out.println(number);
		}
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);
		
		int average = sum / array.length;
		System.out.println(average);
		
		for (int number : array) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		
		String[] names = { "Sam", "Sally", "Thomas", "Robert"}; 
		int sumOfLetters = 0;
		for (String name : names ) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		
		
		
		
		greet("Tom");
		System.out.println(greet2("Nick"));
		
		System.out.println(isStringLongerThanNumber("Hello", 3));
		System.out.println(doesArrayContainString(names, "Sam"));
		System.out.println(getSmallestNumber (array));
		
		double[] dubs = { 2.5, 3.6, 5.1, 1.5};
		System.out.println(averageOfdubs(dubs));
		
	}
    // Inside of Method.
	public static void greet (String name) {
		System.out.println("Hello, " + name + "!");
	}
	// outside of method.
	public static String greet2(String name) {
		return "Hello, " + name + "!";
	}
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number; 
	}
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	public static int getSmallestNumber(int[] array) {
		int smallest = array[0];
				for(int number : array) {
					if (number < smallest) {
						smallest = number;
					}
				}
				return smallest;
				
	}
	
	public static double averageOfdubs(double[] dubs) {
		double sum = 0;
		for (double number : dubs) {
			sum += number;
		}
		return sum / dubs.length;
	}
	
	
	

	
	
}
