package _02_gotta_catchem_all;

public class ExceptionMethods {

	public double divide(double a, double b) throws IllegalArgumentException {

		if (b == 0) {
			throw new IllegalArgumentException();
		}
		double solution = a / b;
		return solution;
	}

	public String reverseString(String word) throws IllegalStateException {
		String reversedWord = "";
		char c;
		char temp;

		for (int i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			temp = word.charAt(word.length() - i - 1);
			c = temp;
			temp = word.charAt(i);
			reversedWord += c;
		}
		if (word.equals("")) {
			throw new IllegalStateException();
		}
		
		System.out.println(reversedWord);
		return reversedWord;
	}

}
