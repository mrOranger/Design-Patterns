package chainOfResponsibility;

public class SecondRequestHandler extends RequestHandler {

	public SecondRequestHandler(RequestHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handle(String request) {
		System.out.println("SecondRequestHandler");
		if(this.nextHandler != null) {
			this.nextHandler.handle(request);
		}
	}
}
