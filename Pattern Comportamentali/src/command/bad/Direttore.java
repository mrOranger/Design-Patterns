package command.bad;

public class Direttore extends Impiegato{
	
	private Filiale filiale;
	
	public Direttore(String name, String surname, String id, Filiale filiale) {
		super(name, surname, id);
		this.filiale = filiale;
	}
	
	public void licenzia(Impiegato imp) {
		this.filiale.getImpiegati().remove(imp);
	}
}
