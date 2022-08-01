package decorator;

public class Client {
	public static void main(String[] args) {
		// Stampiamo un veicolo con uno spoiler ed una gomma nuova
		Vehicle vehicle1 = new Spoiler(new Tire(new Car()));
		vehicle1.start();
		
		// Stampiamo un veicolo con uno spoiler, due gomme, ed una marmitta nuova
		Vehicle vehicle2 = new Spoiler(new Tire(new Tire(new Muffler(new Car()))));
		vehicle2.start();
	}
}
