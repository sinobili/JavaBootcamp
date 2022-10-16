package recapDemo;

public class main {

	public static void main(String[] args) {
		int number=20;
		int number2=25;
		int number3=32;
		int biggest=number;
		if(biggest<number2){
			biggest=number2;
		}
		if(biggest<number3) {
			biggest=number3;
		}
		
		System.out.println("biggest number is " + biggest);
}}
