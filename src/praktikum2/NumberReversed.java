package praktikum2;

import java.util.ArrayList;

import lib.TextIO;

public class NumberReversed {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("How many numbers you want to enter: ");
		int howmany = TextIO.getlnInt();
				
		
		for (int i = 0; i < howmany; i++) {
			System.out.format("Enter number no: %d ", i + 1);
			int number = TextIO.getInt();
					 numbers.add(number);
//					 numbers.add(0, number);
			
		}
		
//		Collections.reverse(numbers); - pöörab kohe array listi tagurpidi
		
//		for (Integer number : numbers){
//			System.out.println(number);
//		}
		
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
			
		}
		
	}

}
