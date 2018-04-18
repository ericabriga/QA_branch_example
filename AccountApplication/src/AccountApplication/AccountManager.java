package AccountApplication;

//import java.util.HashMap;
//import org.json.*;
import com.google.gson.*;




public class AccountManager {

	public static void main(String[] args) {
		
		Service services = new Service();
		//Account Jay = new Account("jay","m","123");
		Account jay = new Account("Jay","M","123");
		//service.addAccount();
		services.addAccount(new Account("John","T", "456"));
		services.addAccount(new Account("Max","R", "789"));

		System.out.println(services.getAccount(jay.getAccountNumber()));
		
		Gson gson = new Gson();
		String json = gson.toJson(services.listAccount);
		System.out.println(json);
	}

	
}
