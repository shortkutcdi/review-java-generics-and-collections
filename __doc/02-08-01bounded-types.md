# bounded types

Print sum of numbers in an array

````java
	// Array of Integer, Array of Float, Array of Double
	
	public class PrintSum<T> {

		public void print(T[] arr) {
			// logic to print sum
		}
	}
	
	
	// Bounded type
	
	public class PrintSum<T extends Number> {

		public void print(T[] arr) {
			// logic to print sum
		}
	}
````
					Number
					|
	-------------------------------------------------------------------					
	|		  |	   |	 	|		 |	  |	
	Byte		Short	Integer		Long		Float	Double			
