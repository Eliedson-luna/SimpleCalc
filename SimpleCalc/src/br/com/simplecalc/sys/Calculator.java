package br.com.simplecalc.sys;

public class Calculator {

	private int n1;
	private int n2;
	private Operator op;
	
	
	public Calculator(int n1, int n2, Operator op) {
		this.n1 = n1;
		this.n2 = n2;
		this.op = op;
	}
	
	public int result() {
		int res = 0;
		if(op == Operator.SOMA) {
			res = n1 + n2;
		} else if (op == Operator.SUBTRACAO) {
			res = n1 - n2;
		} else if (op == Operator.MULTIPLICACAO) {
			res = n1 * n2;
		} else if (op == Operator.DIVISAO) {
			res = n1 / n2;
		}
		
		
		return res;
	}
	
	
}
