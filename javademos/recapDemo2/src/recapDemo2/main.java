package recapDemo2;

public class main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,3.5,5.8};
		double total=0;
		double max=myList[0];
		for (double number:myList) {
			if(max<number) {
				max=number;
			}
			total = total+number;
			System.out.println(number);
		}
		System.out.println("total = " + total);
		System.out.println("biggest number is " + max);
	}

}
