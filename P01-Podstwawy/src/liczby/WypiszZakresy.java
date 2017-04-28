package liczby;

public class WypiszZakresy {

	public static void main(String[] args) {
		System.out.println("byte " + Byte.MIN_VALUE + " do " + Byte.MAX_VALUE);
		System.out.println("short " + Short.MIN_VALUE + " do " + Short.MAX_VALUE);
		System.out.println("int " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE);
		System.out.println("long " + Long.MIN_VALUE + " do " + Long.MAX_VALUE);

		System.out.println("char " + (int)Character.MIN_VALUE + " do " + (int) Character.MAX_VALUE);
	}
}
