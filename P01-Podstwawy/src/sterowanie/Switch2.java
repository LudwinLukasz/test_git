package sterowanie;

public class Switch2 {
	
	static String dzienTygodnia(int num) {
		switch(num) {
		case 1 : return "poniedziałek";
		case 2 : return "wtorek";
		case 3 : return "środa";
		case 4 : return "czwartek";
		case 5 : return "piątek";
		case 6 : return "sobota";
		case 7 : return "niedziela";
		default: return "nieznany";
		}
	}
	
	public static void main(String[] args) {
		int num = 4;
		
		System.out.println(dzienTygodnia(num));
		
		// Od Javy 7 mozna robić switch na Stringach
		String s = "ala";
		switch(s) {
			case "ala" : System.out.println("lubi koty"); break;
			case "ola" : System.out.println("lubi psy"); break;
		}
	}

}
