package AccountApplication;

import java.util.HashMap;

public class Service {
	//static int count =1;
	static HashMap<String,Account> listAccount = new HashMap <String,Account> ();
	
	public boolean addAccount (Account account) {
		Account exists = listAccount.get(account.getAccountNumber()); 
		if (exists != null) {
			return false;
		} else {
			listAccount.put(account.getAccountNumber(), account);
			return true;
		}
	}

	
	public Account getAccount (String number) {
		
		Account account = listAccount.get(number);
		if (account != null) {
			return account;
			//return account.getFirstName() + " " + account.getLastName() + " " + account.getAccountNumber();
		} else {
			return null;
		}
		
		
	}
}