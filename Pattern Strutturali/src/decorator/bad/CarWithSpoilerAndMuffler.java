package decorator.bad;

public class CarWithSpoilerAndMuffler extends CarWithSpoiler{

	@Override
	public void start() {
		super.start();
		System.out.println("With a new muffler");
	}
}
