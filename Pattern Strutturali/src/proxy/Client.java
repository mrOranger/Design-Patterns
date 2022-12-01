package proxy;

public class Client {
	
	public static void main(String[] args) {
		Log logger = new Proxy(new InfoLog());
		logger.log("Questo è un messaggio di info");
		
		logger = new Proxy(new WarningLog());
		logger.log("Questo è un messaggio di warning");
		
		logger = new Proxy(new ErrorLog());
		logger.log("Questo è un messaggio di errore");
	}

}
