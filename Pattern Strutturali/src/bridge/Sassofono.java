package bridge;

/*
 * Rappresenta la Concrete Implementator
 */
public class Sassofono extends Strumento{

	public Sassofono(Configurazione configurazione) {
		super(configurazione);
	}

	@Override
	public String suona() {
		return "Sto suonando un sassofono" +  this.configurazione.getConfigurazione();
	}

}
