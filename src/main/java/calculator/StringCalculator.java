package calculator;

import java.util.Scanner;

public class StringCalculator {
	
	public String typeInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}
	
	public String[] stringToArray(String input) {
		return input.split(" ");
	}
	
	public int toInt(String sInt) {
		return Integer.parseInt(sInt);
	}
	
	public double calculate(String[] inputArray) {
		Operator op;
		double result = 0;
		double pre = 0;
		pre = toInt(inputArray[0]);
		
		for(int i=1; i<inputArray.length-1; i+=2) {
			op = Operator.getOperator(inputArray[i]);
			pre = op.calculate(pre, (double) toInt(inputArray[i+1]));
		}
		result = pre;
		return result;
	}
	
}
