package _02_gotta_catchem_all;

public class ExceptionMethods {

	public double divide(double a, double b) throws IllegalArgumentException {
		
		if (b==0) {
			throw new IllegalArgumentException();
		}
		double solution = a / b;
		return solution;
	}
	
	public String reverseString(String word) throws IllegalStateException{
		String reversedWord = "";
		if (word.equals("")) {
			throw new IllegalStateException();
		}
		for (int i = 0; i < word.length(); i++) {
			
		}
		return reversedWord;
	}

}
