package command;

public class Licenzia implements Command{
	
	private Filiale filiale;
	
	public Licenzia(Filiale filiale) {
		this.filiale = filiale;
	}

	@Override
	public void esegui(Impiegato imp) {
		this.filiale.getImpiegati().remove(imp);
	}

}
