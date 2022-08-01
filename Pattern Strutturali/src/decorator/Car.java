package decorator;

/*
 * Car rappresenta la classe "foglia", ossia la classe che vogliamo comporre usando
 * delle componenti.
 */
public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Start the car");
	}
}
