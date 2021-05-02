package kahvedDukkani;

import java.sql.Date;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1,"ferhat", "arkan",new Date(1999,1,1) , "12345678"));
	}

}
