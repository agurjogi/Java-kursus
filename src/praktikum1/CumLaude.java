package praktikum1;

import lib.TextIO;

public class CumLaude {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta kaalutud keskmine hinne ");
		Double aver = TextIO.getDouble();
		
		System.out.println("Sisesta lõputöö hinne ");
		int mark = TextIO.getlnInt();
		
		if (aver > 4.5 && mark == 5){
			System.out.println("Cum Laude");
		}
		else{
			System.out.println("Ei saa!");
		}
	}

}
