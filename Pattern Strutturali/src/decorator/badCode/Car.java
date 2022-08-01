package decorator.badCode;

public class Car implements Vehicle{
	
	@Override
	public void start() {
		System.out.println("Start a vehicle");
	}

}
