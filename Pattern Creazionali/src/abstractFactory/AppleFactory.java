package abstractFactory;

/*
 * ConcreteFactory che restituisce un Concrete Produce di tipo Apple 
 */
public class AppleFactory implements AbstractFactory{

	@Override
	public Tablet creaTablet() {
		return new IPad();
	}

	@Override
	public Computer creaComputer() {
		return new IMac();
	}

}
