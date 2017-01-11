package praktikum1;

import lib.TextIO;

public class Diagonaal {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta tabeli küljepikkus ");
		int max = TextIO.getInt();
		
		for (int row = 0; row < max; row++) {
		    for (int cell = 0; cell < max; cell++) {
		    	if (cell == row) {
		    		int symb = 1;
		    		System.out.format(" %d ",symb);
		    	}
		    	else {
		    		int symb = 0;
		    		System.out.format(" %d ",symb);
		    	}
		    }
		    System.out.println("");
		}
	}

}
