package chainOfResponsibility;

public class FirstRequestHandler extends RequestHandler {

	public FirstRequestHandler(RequestHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handle(String request) {
		System.out.println("FirstRequestHandler");
		if(this.nextHandler != null) {
			this.nextHandler.handle(request);
		}
	}

}
