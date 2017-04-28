package liczby;

public class PrzekrecenieLicznika {

	public static void main(String[] args) {
		System.out.println(4 * 1000000);
		System.out.println(4 * 1000000000);
		// Ariane 5
		
		int x = Integer.MAX_VALUE;
		
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		System.out.println("Maksymalna dodatnia" + x);
		System.out.println(Integer.toString(x, 2));

		x++;
		System.out.println("Minimalna ujemna " + x);
		System.out.println(Integer.toString(x, 2));
		
		System.out.println();
		
		int y = 257;
		
		System.out.println((byte) y); // rzutowanie
		y = 255;
		System.out.println((byte) y);

		y = 1027;
		System.out.println((byte) y);
		y = 1000;
		System.out.println((byte) y);
}

}
