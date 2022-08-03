package abstractFactory;

/*
 * Classe ConcreteProduct di tipo Apple
 */
public class IPad implements Tablet{

	@Override
	public void crea() {
		System.out.println("Ho creato un iPad!");
	}
}
