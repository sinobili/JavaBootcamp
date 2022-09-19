package miniProjectAsalSayi;

public class main {

	public static void main(String[] args) {
		int number = 11;
		int remainder = number % 2;
		boolean isPrimeNumber= true;
		if(number<2) {
			System.out.println("invalid number");
			return;
		}
		
		
		for(int i=2;i<number;i++) {
			remainder = number % i;
			if(remainder==0) {
				isPrimeNumber = false;
				System.out.println("it is not prime number"); 
				break;	
			}
		}
		if(isPrimeNumber) {
		System.out.println("it is prime number.");
		}
	}

}
