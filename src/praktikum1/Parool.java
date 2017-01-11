package praktikum1;

import lib.TextIO;

public class Parool {
	
	public static void main(String[] args) {
		
		String pass = "Vanakala";
		System.out.println("Sisesta parool ");
		String pasw = TextIO.getlnString();
		
		if (pasw.equals(pass)){
			System.out.println("Õige parool");
		}
		else {
			System.out.println("Vale parool");
		}
	}

}
