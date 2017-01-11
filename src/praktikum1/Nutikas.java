package praktikum1;

import lib.Fox;
import lib.Taring;

public class Nutikas {
	
	public static String turnFoxHorizontally(String foxline) {
		char[] line = foxline.toCharArray();
		String ret = "";

		for (int i = line.length - 1; i >= 0; i--) {
			char c;
			c = line[i];
			switch(c) {
				case '(' : c = ')';  break;
				case ')' : c = '(';  break;
				case '/' : c = '\\'; break;
				case '\\': c = '/';  break;
			}
			ret += c;
		}

		return ret;
	}

	public static String turnFoxVertically(String foxline) {
		char[] line = foxline.toCharArray();
		String ret = "";

		for (int i = 0; i < line.length; i++) {
			char c;
			c = line[i];
			switch(c) {
				case 'V' : c = 'A';  break;
				case '_' : c = '-';  break;
				case '/' : c = '\\'; break;
				case '\\': c = '/';  break;
			}
			ret += c;
		}

		return ret;
}
	
	public static void main(String[] args) {
		
		String taring[][] = {
				{
					"+-------+",
					"|       |",
					"|   *   |",
					"|       |",
					"+-------+"
				},
				{
					"+-------+",
					"|       |",
					"| *   * |",
					"|       |",
					"+-------+"
				},
				{
					"+-------+",
					"| *     |",
					"|   *   |",
					"|     * |",
					"+-------+"
				},
				{
					"+-------+",
					"| *   * |",
					"|       |",
					"| *   * |",
					"+-------+"
				},
				{
					"+-------+",
					"| *   * |",
					"|   *   |",
					"| *   * |",
					"+-------+"
				},
				{
					"+-------+",
					"| *   * |",
					"| *   * |",
					"| *   * |",
					"+-------+"
				}
			};
			int s;
			int t1 = (int)(Math.random() * taring.length);
			
			for (s = 0; s < taring[t1].length; s++) {
				System.out.println(taring[t1][s]);
			}
		
		String fox[] = {
				" /\\           ",
				"(~(           ",
				" ) )     /\\_/\\",
				"( _-----_(@ @)",
				"  (       \\ / ",
				"  /|/--\\|\\ V  ",
				"  \" \"   \" \"   "
			};
			
			
			for (int i = 0; i < fox.length; i++) {
				for (int j = 0; j < 1; j++) {
					System.out.print(fox[i]);
					System.out.print(" ");
				}
				
				
				System.out.print(" ");
				
				for (s = 0; s < taring[t1].length; s++) {
					System.out.println(taring[t1][s]);
				}

				
				System.out.print(turnFoxHorizontally(fox[i]));
				System.out.println();
				
				
			}

			
			
	}
}
