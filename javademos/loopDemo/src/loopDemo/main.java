package loopDemo;

public class main {

	public static void main(String[] args) {
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("loop is over.");
		
		int i=2;
		
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("Loop of while is over.");
		
		int j=2;
		do {System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do while over.");

	}

}
