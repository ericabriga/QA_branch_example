package AccountApplication;

import java.util.HashMap;

public class Service {
	//static int count =1;
	HashMap<String,Account> listAccount = new HashMap <String,Account> ();
	
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
/*public void addAccount(String firstName, String lastName, String accountNumber) {
		
		Account account = new Account(firstName, lastName, accountNumber);
		listAccount.put(count, account);
		count++;
		
	}
	
	public void getAccount(Account account) {
		account.toString();
	}
	
	public void showMap() {
        Set<Entry<Integer, Account>> hashSet=listAccount.entrySet();
        for(Entry entry:hashSet ) {
            System.out.println(entry.getKey()+ ", " + entry.getValue());
        }
	}
	
	public void showEntry(int num) {
        Set<Entry<Integer, Account>> hashSet=listAccount.entrySet();
        for(Entry entry:hashSet ) {
        	int key = (Integer) entry.getKey();
        	if(key==num) {
        		System.out.println(entry.getKey()+ ", " + entry.getValue());
        	}
        }
	}*/
}

