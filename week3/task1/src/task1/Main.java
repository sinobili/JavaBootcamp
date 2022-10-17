package task1;

public class Main {

	public static void main(String[] args) {
		//CreditManager creditManager = new CreditManager();
		//creditManager.calculate();
		//creditManager.save();
		
		/*
		 * Customer customer = new Customer(); customer.id = 1; customer.city =
		 * "Istanbul";
		 */
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
	}

}
