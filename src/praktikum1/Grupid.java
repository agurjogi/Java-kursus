package praktikum1;

import lib.TextIO;

public class Grupid {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta inimeste arv ");
		double inimesed = TextIO.getInt();
				
		System.out.println("Sisesta soovitud grupi suurus ");
		double grupp = TextIO.getInt();
				
		double gruppe = inimesed / grupp;
		double jaak = inimesed % grupp;
		
//		System.out.println(inimesed + " inimest saab jaotada " + (int) gruppe + " gruppi. Ja üle jääb " + jaak + " inimest.");
		
		System.out.format("%.2f inimest saab jagada %.0f gruppi ja üle jääb %.0f inimest",inimesed, gruppe, jaak);
	}

}
