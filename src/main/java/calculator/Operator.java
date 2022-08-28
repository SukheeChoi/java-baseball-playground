package calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
	ADD("+", (i, j) -> i + j),
	SUBTRACT("-", (i, j) -> i - j),
	MULTIPLY("*", (i, j) -> i * j),
	DIVIDE("/", (i, j) -> i / j);
	
	private String operator;
	private BiFunction<Double, Double, Double> expression;
	
	Operator(String operator) {
		this.operator = operator;
	}

	Operator(String operator, BiFunction<Double, Double, Double> expression) {
		this.operator = operator;
		this.expression = expression;
	}
	
	public static Operator getOperator(String operator) {
		return Arrays.stream(values())
				.filter(o -> o.operator.equals(operator))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("연산자로 적합하지 않습니다."));
	}
	
	public double calculate(double i, double j) {
		return expression.apply(i, j);
	}
	
}
