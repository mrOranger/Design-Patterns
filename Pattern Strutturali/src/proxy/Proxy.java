package proxy;

public class Proxy implements Log {
	
	private Log output;
	
	public Proxy(Log output) {
		this.output = output;
	}

	@Override
	public void log(String message) {
		this.output.log(message);
	}

}
