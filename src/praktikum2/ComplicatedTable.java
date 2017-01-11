package praktikum2;

import lib.TextIO;

public class ComplicatedTable {
	
	public static void main(String[] args) {
		
		int x = MethodSample.declareSampleMethod(3); // See on näide kuidas välja kutsuda ise tehtud meetodit
		
		System.out.println("Sisesta tabeli küljepikkus ");
		int max = TextIO.getInt();
		
		for (int row = 0; row < max; row++) {
		    for (int cell = 0; cell < max; cell++) {
//		    	if (cell <= row) {
		    		int symb = (cell + row) % 10;
		    		System.out.format(" %d ",symb);
//		    	}
//		    	else {
//		    		int symb = 0;
//		    		System.out.format(" %d ",symb);
//		    	}
		    }
		    System.out.println("");
		}
	}

}
