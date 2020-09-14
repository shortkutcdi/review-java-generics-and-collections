package com.udem.bounded_types;

public class Main {

	public static void main(String[] args) {
		Integer[] integerArray = {10, 5, 20, 9};
		
		PrintSum<Integer> psInteger = new PrintSum<Integer>();
		psInteger.print(integerArray);
		
		Double[] doubleArray = {10.5, 5.5, 20.2, 9.0};
		
		PrintSum<Double> psDouble = new PrintSum<>();
		psDouble.print(doubleArray);
		
		String stringArray[] = {"str1", "str2", "str3", "str4"};
		// PrintSum<String> psString = new PrintSum<>(); // Bound mismatch (String is not (extends) Type of Number)

	}

}
