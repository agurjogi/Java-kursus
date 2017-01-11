package praktikum1;

import lib.TextIO;

public class ArtificialIntelligents {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta kaks vanust ");
		
		int age1 = TextIO.getInt();
		int age2 = TextIO.getInt();
		
		int result = Math.abs(age1 - age2);
		
		if (result < 5){
			System.out.println("sobib");
		}
		else if (result <= 10 && result > 5){
			System.out.println("porgand");
		}
		else {
			System.out.println("Punane porgand");
		}
		
//		System.out.format("%s",result1);
	}

}
