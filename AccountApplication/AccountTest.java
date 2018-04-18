package AccountApplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	
	Service service = new Service();
	
	Account jay = new Account("Jay","m","123");
	//service.addAccount(Jay);
	
	@Test
	public void addAccountTest() {
		assertEquals(true,service.addAccount(jay));
		assertEquals(false,service.addAccount(jay));
	}
	
	@Test
	public void getAccountTest() {
		assertEquals(null ,service.getAccount(jay.getAccountNumber()));
		service.addAccount(jay);
		assertEquals(jay ,service.getAccount(jay.getAccountNumber()));
		//assertEquals(,service.getAccount(jay.getAccountNumber()));
	}


}
