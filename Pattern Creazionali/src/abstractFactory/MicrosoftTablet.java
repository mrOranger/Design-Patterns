package abstractFactory;

/*
 * Classe ConcreteProduct di tipo Microsoft
 */
public class MicrosoftTablet implements Tablet{

	@Override
	public void crea() {
		System.out.println("Ho creato un Tablet Microsoft!");
	}

}
