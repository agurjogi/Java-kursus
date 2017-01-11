package praktikum2;

public class Xplus {
	
	public static void main(String[] args) {
		
		int size = Input.userInput("Insert positive odd number: ", num -> 1 == num % 2);

		String line = Symbols.symbols('-', size * 2 + 3);
		line = line + " " + line;
		// line = String.format("%1$s %1$s", line);
		System.out.println(line);

		for (int row = 0; row < size; row++) {
			System.out.print("|");
			for (int col = 0; col < size; col++) {
				System.out.format("%2s", col == row || row + col == size - 1 ? 'X' : '.');

			}
			// System.out.println();
			// }
			//
			// for (int row = 0; row < size; row++) {

			System.out.print(" | |");
			for (int col = 0; col < size; col++) {
				System.out.format("%2s", row == size / 2 || col == size / 2 ? 'X' : '.');
			}

			System.out.println(" |");
		}
		System.out.println(line);
	}

}



// otsi välja, miks üla- ja alajoon 2 sümbolit liiga pikk on

//public class Xplus {
//
//	public static void main(String[] args) {
//
//		int size = Input.userInput("Insert a positive odd number: ", num -> 1 == num % 2);
//		
//		String line = Symbols.symbols('-', size * 2 + 3);
//		line = line + " " + line;
//		// line = String.format("%1$s %1$s", line);
//		System.out.println(line);
//		
//		for (int row = 0; row < size; row++) {
//			System.out.print("|");
//			for (int col = 0; col < size; col++) {
//				System.out.format("%2s", row == col || row + col == size - 1 ? 'X' : ' ');
//			}
//			
//			System.out.print(" | |");
//
//			for (int col = 0; col < size; col++) {
//				int middle = size / 2;
//				System.out.format("%2s", row == middle || col == middle ? 'X' : ' ');
//			}
//			System.out.println(" |");
//		}
//		
//		System.out.println(line);
//	}
//}