package command;

public class Assumi implements Command{

	private Filiale filiale;
	
	public Assumi(Filiale filiale) {
		this.filiale = filiale;
	}

	@Override
	public void esegui(Impiegato imp) {
		this.filiale.getImpiegati().add(imp);
	}

}
