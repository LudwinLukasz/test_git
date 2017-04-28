package liczby;

public class LiteralyLiczbowe {

	public static void main(String[] args) {
		int x;
		
		x = 26; // traktowane jako int
		System.out.println(x);
		
		x = 026;  // system ósemkowym
		System.out.println(x);
		
		x = 0xFF;
		System.out.println(x);
		
		x = 0b00000101;
		System.out.println(x);

		int y = 0b10000101;
		System.out.println(y);

		byte b = (byte) 0b10000101;
		System.out.println(b);
		
		double d = 3.14;
		
		//NK float f = 3.14;
		
		float f2 = 3.14f;
	}

}
