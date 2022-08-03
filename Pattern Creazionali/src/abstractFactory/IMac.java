package abstractFactory;

/*
 * Classe ConcreteProduct di tipo Apple
 */
public class IMac implements Computer{

	@Override
	public void crea() {
		System.out.println("Ho creato un iMac!");
	}

}
