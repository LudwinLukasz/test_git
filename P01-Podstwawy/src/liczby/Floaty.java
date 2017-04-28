package liczby;

public class Floaty {

	public static void main(String[] args) {
		float f = 1.0000003f;
		
		System.out.println(f);
		f += 1;
		System.out.println(f);
		f -= 1;
		System.out.println(f);

		f = 2222222222f;
		
		System.out.printf("%8f\n", f);
		f += 1000;
		System.out.printf("%8f\n", f);
		f -= 10000000;
		System.out.printf("%8f\n", f);
		
		// BigDecimal
	}
}
