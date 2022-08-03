package abstractFactory;

/*
 * Classe ConcreteProduct di tipo Microsoft
 */
public class MicrosoftComputer implements Computer{

	@Override
	public void crea() {
		System.out.println("Ho creato un computer Microsoft!");
	}

}
