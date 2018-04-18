package AccountApplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	Service service = new Service();
	
	Account jay = new Account("Jay","m","123");
	
	@Test
	public void addAccountTest() {
		
		Account bay = new Account("Bay","m","231");
		assertEquals(true, service.addAccount(bay));
		assertEquals(false, service.addAccount(bay));
	}
	
	@Test
	public void getAccountTest() {
		assertEquals(null ,service.getAccount(jay.getAccountNumber()));
		service.addAccount(jay);
		assertEquals(jay ,service.getAccount(jay.getAccountNumber()));
		//assertEquals(,service.getAccount(jay.getAccountNumber()));
	}

	
	@Test
	public void toJsonTest() {
		String output = "{\"456\":{\"firstName\":\"John\",\"lastName\":\"T\",\"accountNumber\":\"456\"},\"789\":{\"firstName\":\"Max\",\"lastName\":\"R\",\"accountNumber\":\"789\"}}";
		
		service.addAccount(new Account("John","T", "456"));
		service.addAccount(new Account("Max","R", "789"));
		
		assertEquals(output , service.toJSon());
	}

}
