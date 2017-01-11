package praktikum2;

public class RandomNumber {

	public static int random(int min, int max) {
		// Math.random(); // [0..1)
		int diff = max - min + 1;

		return min + (int) (Math.random() * diff);
		// 1 + (int)(Math.random() * 3); // 1, 2, 3

	}

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			if (0 == i % 50) {
				System.out.println();
			}
			System.out.format("%3d", random(1, 3));
		}
	}

}
