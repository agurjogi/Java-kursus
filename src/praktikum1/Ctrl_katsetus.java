package praktikum1;

import lib.TextIO;

/**
 * Minu esimene
 * Java doc
 *
 *@author Agur
 */

public class Ctrl_katsetus {
	
	public static void main(String[] args) {
		
		
//		String tekst = "Mingi tekst ehk string";
		
		System.out.println("Sisesta mingi nimi");
		String nimi = TextIO.getlnString();
		
		int arv = 3 * nimi.length();
		
		// Ctrl + one
		System.out.println(2000.2);
		System.out.println(true);
		
		System.out.println('b');
		System.out.println(nimi.length());
		System.out.println(arv);
		
	}

}
