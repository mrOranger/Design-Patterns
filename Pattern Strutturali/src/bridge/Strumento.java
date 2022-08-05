package bridge;

/*
 * Classe che rappresenta la classe Implementator
 */
public abstract class Strumento {
	
	protected Configurazione configurazione;
	
	public Strumento(Configurazione configurazione) {
		this.configurazione = configurazione;
	}
	
	public Configurazione getConfigurazione() {
		return configurazione;
	}
	
	public void setConfigurazione(Configurazione configurazione) {
		this.configurazione = configurazione;
	}
	
	public abstract String suona();
}
