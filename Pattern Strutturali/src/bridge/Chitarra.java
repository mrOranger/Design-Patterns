package bridge;

/*
 * Rappresenta la classe Concrete Implementator
 */
public class Chitarra extends Strumento{
	
	public Chitarra(Configurazione configurazione) {
		super(configurazione);
	}

	@Override
	public String suona() {
		return "Sto suonando una chitarra" + this.configurazione.getConfigurazione();
	}
	
}
