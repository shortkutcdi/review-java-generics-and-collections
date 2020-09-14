package com.udem.generics;

public class Main {

	public static void main(String[] args) {

		Integer[] intArray = {1,2,3,4};
		String[] stringArray = {"un", "deux", "trois"};
		
		PrintGenericArray<Integer> printGenericArrayInt = new PrintGenericArray<>();
		printGenericArrayInt.print(intArray); // pass Integer array
		
		
		PrintGenericArray<String> printGenericArrayString = new PrintGenericArray<>();
		printGenericArrayString.print(stringArray); // pass String array

	}

}
