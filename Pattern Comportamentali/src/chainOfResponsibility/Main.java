package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		

		RequestHandler thirdRequestHandler = new FirstRequestHandler(null);
		RequestHandler secondRequestHandler = new SecondRequestHandler(thirdRequestHandler);
		RequestHandler firstRequestHandler = new FirstRequestHandler(secondRequestHandler);
		firstRequestHandler.handle("Richista");

	}

}
