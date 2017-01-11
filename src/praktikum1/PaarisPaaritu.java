package praktikum1;

import lib.TextIO;

public class PaarisPaaritu {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta arv ");
		int arv = TextIO.getInt();
		
		boolean onPaaris = 0 == arv % 2;
				
		System.out.format("Arv %d on %s.",
			arv, onPaaris ? "paaris" : "paaritu");

				
//		if (0 == arv % 2){
//			System.out.println("Arv on Paarisarv");
//			}
//			
//		else {
//			System.out.println("Arv on Paaritu");
//			}
		}
	}
