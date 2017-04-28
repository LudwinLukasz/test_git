package liczby;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TypyLiczbowe {

	public static void main(String[] args) {
		
		// Typy proste:
		// liczby całkowite
		byte b = 120;   // 8 bitów ze znakiem, czyli od -128 do +127
		//NK byte bb = 130;
		
		short s = 1000; // 16 bitów, czyli od ok -32 tys. do +32 tys.
		
		int i = 44; // 32 bity - 2 mld +2 mld
		
		long l = 5000000000L;
		long ll = 500;
		
		// liczby "zmiennoprzecinkowe"
		// 32 bity
		float f = 3;
		float f2 = 3.14f;
		//NK float f3 = 3.14;  -- bo to jest traktowane jak double
		
		// 64 bity
		double d = 3.14;
		
		// Klasy do obslugi liczb
		// "wrappery": Byte, Short, Integer, Long, Float, Double
		Integer ii = new Integer(7);
		
		// dodatkowe
		// podstawowa klasa do liczenia pieniędzy i innych rachunków precyzyjnych
		BigDecimal big = new BigDecimal("12.99");
		big = big.multiply(new BigDecimal(2));
		System.out.println(big);
		
		BigInteger bi = new BigInteger("12345678912345678912345678901234567890");
		System.out.println(bi);
	}
}
