package br.com.simplecalc.sys;


import java.util.ArrayList;

public  class SimpleCalcDAO {
	

	private static ArrayList<NumberCalc> numbers = new ArrayList<NumberCalc>();

	public String getNumToString() {
		String str = "";
		for (NumberCalc num : numbers) {
			str += num.getValue();
		}
		System.out.println(str);
		return str;
	}
	
	public int getNumInteger() {
		String str = ""; 
		for (NumberCalc num : numbers) {
			str += num.getValue();
		}
		int res = Integer.parseInt(str);
		return res;
	}
	
	public void addNumber(NumberCalc num) {
		numbers.add(num);
		
	}
	public static void clearNumbers() {
		numbers.clear();
	}
	
	public SimpleCalcDAO() {
		
	}


	
	
	
}
