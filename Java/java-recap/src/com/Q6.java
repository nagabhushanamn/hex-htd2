package com;

interface Operator {
	int calculate(int firstOperand, int secondOperand);
}

enum EOperator implements Operator {
	SUM {
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand + secondOperand;
		}
	},
	SUBTRACT {
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand - secondOperand;
		}
	}
}

class Operation {

	private int firstOperand;
	private int secondOperand;
	private EOperator operator;

	public Operation(int firstOperand, int secondOperand, EOperator operator) {
		super();
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		this.operator = operator;
	}

	public int calculate() {
		return operator.calculate(firstOperand, secondOperand);
	}
}

public class Q6 {

	public static void main(String[] args) {

		Operation op1 = new Operation(12, 13, EOperator.SUM);
		System.out.println(op1.calculate());

	}

}
