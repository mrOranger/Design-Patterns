package decorator;

/*
 * Le componenti che devono decorare una classe devono avere una classe comune
 * definita Decorator, e che definisce la composizione delle varia componenti
 * usando un riferimento alla classe madre Vehicle.
 */
public class Component implements Vehicle{
	
	private Vehicle vehicle;
	
	public Component(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void start() {
		this.vehicle.start();
	}
}
