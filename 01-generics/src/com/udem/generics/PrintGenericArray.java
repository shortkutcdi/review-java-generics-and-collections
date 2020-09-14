package com.udem.generics;

public class PrintGenericArray<T> {

	public void print(T[] arr) {
		for (T value : arr) {
			System.out.print(value + " ");
		}
		System.out.println("\n-----------------");
	}
}
