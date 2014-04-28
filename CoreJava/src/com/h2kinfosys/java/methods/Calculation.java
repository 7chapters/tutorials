package com.h2kinfosys.java.methods;

public class Calculation {
	int firstValue;
	int secondValue;
	
	public int getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}
	
	public Calculation(int a , int b) {
		this.firstValue = a;
		this.secondValue = b;
	}
	
	public void justCallMe(){
		System.out.println("Just call me");
	}
	
	public int addMe(){
		return firstValue + secondValue;
	}
	
	public void subMe(String message) {
		System.out.println( firstValue-secondValue);
	}
	
	/*public int subMe(String message) {
		System.out.println( a-b);
		return 10;
	}*/
	
	public String subMe(String message , String name) {
		System.out.println( firstValue-secondValue);
		return "";
	}
	
	public static void main(String[] args) {
		Calculation add = new Calculation(10, 20);
//		add.add();
		int calulatedVale = add.addMe();
		int finalValue = calulatedVale + 10;
		
		System.out.println( finalValue);
		
		Calculation sub = new Calculation(10, 5);
		sub.firstValue = 12;
		
	}

}
