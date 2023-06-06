package chainOfResponsibility;

public abstract class RequestHandler {
	
	protected RequestHandler nextHandler;
	
	public RequestHandler (RequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void handle(String request);
}
