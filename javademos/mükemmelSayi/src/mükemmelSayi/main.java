package mükemmelSayi;

public class main {

	public static void main(String[] args) {
		int number= 28;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				total=total+i;
			}	
		}
		if (total==number) {
		System.out.println(number + " Mükemmel sayıdır");}
		else {System.out.println("Mükemmel Sayı değildir");}
	}

}
