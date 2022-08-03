package abstractFactory;

/*
 * ConcreteFactory che restituisce un Concrete Produce di tipo Microsoft 
 */
public class MicrosoftFactory implements AbstractFactory{

	@Override
	public Tablet creaTablet() {
		return new MicrosoftTablet();
	}

	@Override
	public Computer creaComputer() {
		return new MicrosoftComputer();
	}

}
