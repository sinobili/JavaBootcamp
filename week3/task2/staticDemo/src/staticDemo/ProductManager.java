package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if(validator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("ürün bilgileri geçersiz");
		}
		
		//System.out.println("eklendi");
	}
}
