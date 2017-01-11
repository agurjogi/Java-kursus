package praktikum1;

import lib.TextIO;

public class NimePikkus {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta nimi ");
		String nimi = TextIO.getlnString();
		
//		nimi = nimi.trim().replaceAll("(\\W, replacement)+", "");		- RegEx funktsiooni teema
				
//		int pikkus = nimi.length();
		
		System.out.format("(%s) pikkus on %d tähemärki.",nimi, nimi.replaceAll(" ", "").length());
	}

}
