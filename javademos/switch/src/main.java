
public class main {

	public static void main(String[] args) {
		char grade='A';
		
		switch (grade) {
		case'A':
			System.out.println("Perfect:Passed");
			break;
		case'B':
			System.out.println("Good:Passed");
			break;
		case'C':
			System.out.println("Passed");
			break;
		case'D':
			System.out.println("Low Passed");
			break;
		case'F':
			System.out.println("Faillure");
			break;
		default:
			System.out.println("Invalid grade.");
		}
			
	}

}
