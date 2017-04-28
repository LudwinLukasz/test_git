package zmienne;

public class ZasiegZmiennych {

	public static void main(String[] args) {
		int x = 20;
		System.out.println(x);

		//NK int x = 99;

		{
			System.out.println(x);
			int y = 77;
			System.out.println(y);
			
			//NK int x = 99;
			//NK String x = "oooo";
		}
		
		//NK System.out.println(y);
		
		if(x > 0) {
			String y = "yyyyyy";
			System.out.println(y);
		} else {
			long y = 0;
			System.out.println(y);
		}

		//NK System.out.println(y);
	}

}
