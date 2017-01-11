package praktikum2;

public class MethodSample {
	
	public static int declareSampleMethod(int number) {
		System.out.println("hello " + number);
		
		return number;
	}

	public static int summa(int a, int b) {
	    int s = a + b;
	    return s;
	}
	
	public static int mituAad(String tekst) {
	    int mitu = 0;
	    for (int i = 0; i < tekst.length(); i++) {
	        // charAt annab ühe tähe indeksi põhjal
	        if ('a' == tekst.charAt(i)) {
	            mitu++;
	        }
	    }
	    return mitu;

	    // teine võimalik implementatsioon vaid ühel real,
	    // mis kasutab regulaaravalidst:
	    // return tekst.replaceAll("[^aA]", "").length();
	}

	public static void main(String[] args) {
	
		int summa = summa(2, 3);
		System.out.println(mituAad("Mati"));
		System.out.println(summa(summa(summa, 1), mituAad("Toomas Kaasik")));
		
	}
	
}
