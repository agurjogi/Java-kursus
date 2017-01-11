package praktikum1;


import lib.TextIO;

public class Hargnemine {
	
	public static void main(String[] args) {
		
	
	System.out.println("Sisesta üks arv");
	int arv = TextIO.getlnInt();
	
//	if (arv > 3) {
//	    System.out.println("Sisestatud arv on suurem kui kolm");
//	}
//	else {
//	    System.out.println("Sisestatud arv ei ole suurem kui kolm");
//	}
//	}
	
	if (3 < arv){
		System.out.println("Sisestatud arv on suurem kui kolm");
	}
	else if (3 > arv){
		System.out.println("Sisestatud arv ei ole suurem kui kolm");
	}
	else if (3 == arv){
		System.out.println("Arv on kolm");
	}
	}
}

