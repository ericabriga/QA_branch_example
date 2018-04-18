package AccountApplication;

public class AccountManager {

	public static void main(String[] args) {
		Service service = new Service();
		
		service.addAccount("Jay","M", "123");
		service.addAccount("John","T", "123");
		service.addAccount("Max","R", "123");

		
	}

}
