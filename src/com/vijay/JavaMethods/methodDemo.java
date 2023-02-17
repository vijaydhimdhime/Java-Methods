package com.vijay.JavaMethods;

public class methodDemo {
	int add(int a, int b) {
		int x = a + b;
		//System.out.println("Additoin of two numbers : " + x);
		return x;
		
	}

	public static void main(String[] args) {
//		methodDemo md = new methodDemo();
//		int result=md.add(25, 10);
//		System.out.println(result);
		int num1 = 50;
		int num2 = 50;
		methodDemo d = new methodDemo();
		int result = d.add(num1, num2);
		System.out.println(result);
	}
}
