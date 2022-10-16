package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		for (int sayi: sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			//System.out.println("sayı mevcuttur." +aranacak);
			mesajVer("Sayı mevcuttur." +aranacak);
		}else {
			//System.out.println("sayi mevcut değildir." +aranacak);
			mesajVer("Sayı mevcut değildir." +aranacak);
		}
		
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
