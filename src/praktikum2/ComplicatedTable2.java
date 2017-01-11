package praktikum2;

public class ComplicatedTable2 {
	
	public static void main(String[] args) {
		
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				int number = (col + row) % 10;
				System.out.format("%2d", number);
			}
			System.out.println();
		}
			
	}

}
