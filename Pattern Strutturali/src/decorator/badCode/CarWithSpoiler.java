package decorator.badCode;

public class CarWithSpoiler extends Car{
	
	@Override
	public void start() {
		super.start();
		System.out.println("With a new spoiler");
	}
}
