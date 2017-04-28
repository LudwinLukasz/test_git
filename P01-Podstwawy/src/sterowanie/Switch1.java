package sterowanie;

public class Switch1 {

	public static void main(String[] args) {
		
		int num = 4;
		
		switch(num) {
		case 1 :
			System.out.println("poniedziałek"); break;
		case 2 :
			System.out.println("wtorek"); break;
		case 3 :
			System.out.println("środa"); break;
		case 4 :
			System.out.println("czwartek"); break;
		case 5 :
			System.out.println("piątek"); break;
		case 6 :
			System.out.println("sobota"); break;
		case 7 :
			System.out.println("niedziela"); break;
		default :
			System.out.println("niepoprawny numer dnia tygodnia");
		}

		

	}

}
