package liczby;

public class ZagadkiPlusPlus {

	public static void main(String[] args) {
		int a, x, y, z;

		a = 1; a = a++ + ++a; // 4
		
		System.out.println(a);
		
		x = 1; x += x;
		System.out.println(x); // 2
		
		y = 1; y += 1 + y++;
		
		// y = y + (1 + y++)
		// y = 1 + (1 + 1)
		
		System.out.println(y); // 3
		
		z = 1; z += 1 + z++ + ++z;
		
		// z = z + (1 + z++ + ++z)
		// z = 1 + (1 + 1   +   3)
		System.out.println(z); // 6
	}
}
