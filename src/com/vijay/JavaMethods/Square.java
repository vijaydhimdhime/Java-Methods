package com.vijay.JavaMethods;

public class Square {
	static int square(int num) {
		int result = num * num;
		return result;
	}

	public static void main(String[] args) {
		//int num = 10;
		//Square s = new Square();
		int num=25;
		int result = square(num);
		System.out.println("Square of " +num+ " = " + result);
	}

}
