package AccountApplication;

import java.util.HashMap;

public class Service {
	
	HashMap<String,Account> listAccount = new HashMap <String,Account> ();
	
	public boolean addAccount (Account account) {
		if (account != null) {
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
		} else {
			return null;
		}
		
		
	}
	
}

