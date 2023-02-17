package com.vijay.JavaMethods;

public class ParameterizedMethods {
	// void display(int a){
	// System.out.println("one paramter method....");
	// }
	// void display(int a, int b){
	// System.out.println("2 paramter method....");
	// }
	// void display(int a, int b, int c){
	// System.out.println("three paramter method....");
	// }
	// void display(int a, int b, int c, int d){
	// System.out.println("4 paramter method....");
	// }
	// public static void main(String[] args) {
	// ParameterizedMethods p = new ParameterizedMethods();
	// p.display(1);
	// p.display(1,1);
	// p.display(1,1,1,1);
	// p.display(1,1,1);
	// }

	static void display(int a) {
		System.out.println("one paramter method....");
	}

	static void display(int a, int b) {
		System.out.println("2 paramter method....");
	}

	static void display(int a, int b, int c) {
		System.out.println("three paramter method....");
	}

	static void display(int a, int b, int c, int d) {
		System.out.println("4 paramter method....");
	}

	public static void main(String[] args) {
		// ParameterizedMethods p = new ParameterizedMethods();
		display(1);
		display(1, 1);
		display(1, 1, 1, 1);
		display(1, 1, 1);
	}

}
