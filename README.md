# OrdinaryToBinary
This converts ordinary base-10 numbers to binary numbers. 

package main;

public class ConvertingBin {

	
	public static void main(String[] args) {

		binaryText(559);
		
		
	}
	
	
	public static void binaryText(int inputNum) {

		System.out.println("Input # is: " + inputNum);
		
		System.out.println("Time to convert!");

		int count=1;
		
		//a second copy of inputNum
		
		int targetNum = inputNum;
		
		//dividing # into chunks in order to see if it fits into any binary place holders
		
		while (inputNum / 2 >=1) {
			
			//this does that dividing thing
			
			System.out.println("Input # is now: " + inputNum);
			
			inputNum=inputNum/2;
			
			count++;
			
		}
		
		
		System.out.println("Count is now: " + count);
		
		int [] binary = new int[count];
		
		
		
		for (int i=0; i< count; i++) {
			binary[count-i-1] = (int) Math.pow(2, i);
			//this creates the original binary slots
		}

		
		//divided part taken into play and generating binary #
		int[] values = new int[count];
		
		
	
		
		for (int i=0; i< count; i++) {
			if (targetNum/ binary[i] >= 1) {
				values[i] = 1;
				
				
				targetNum = targetNum % binary[i];
			} else {
				values[i]=0;
			}
		} // end of for loop
		
		System.out.println("This is the binary array");
		for (int i=0; i<binary.length; i++) {
			System.out.print("["+binary[i] + "]");
			}
		
		System.out.println("  ");
		
		System.out.println("This is the values array");
		
		for (int i=0; i<values.length; i++) {
		System.out.print("["+values[i] + "]");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
