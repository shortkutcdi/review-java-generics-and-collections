package com.udem.arrayList_part3_with_custom_objects;

public class main {

	public static void main(String[] args) {

		Integer int1 = new Integer(2);
		Integer int2 = new Integer(2);
		
		if (int1 == int2) { // == compare references -- not the content
			System.out.println("Numbers are equal");
		} 
		else if (int1.equals(int2)) { // compare the content of objects
			System.out.println("content Numbers are equal");
			
		} 
		else {
			System.out.println("Numbers are not equal");
		}

		String str1 = new String("car");
		String str2 = new String("car");
		
		if (str1 == str2) { // == compare references -- not the content
			System.out.println("Strings are equal");
		} 
		else if(str1.equals(str2)) { // compare the content of objects
			System.out.println("Content Strings are equal");
		} 
		else {
			System.out.println("Strings are not equal");
			
		}
	}

}
