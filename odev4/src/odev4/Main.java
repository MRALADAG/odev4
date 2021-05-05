package odev4;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1, "Engin", "Demiroğ", 1985, "487465874847"));

	}

}
