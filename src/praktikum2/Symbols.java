package praktikum2;

public class Symbols {
	
	/**
	 * Inserts a String that contains given count of given string
	 * @param c
	 * @param count
	 * @return
	 */
	
	public static String symbols(char c, int count){
		String symbols = "";
		
		for (int i = 0; i < count; i++) {
			symbols = symbols + c;
			// symbols.append(c);
		}
		
		return symbols;
		// return symbols.toString();
		// return String.format("%" + count + "S", "").replace(' ',c);
	}

	public static void main(String[] args) {
		System.out.println(symbols('a', 3));
		System.out.println(symbols('b', 8));
		System.out.println(symbols('=', 80));
	}
}

