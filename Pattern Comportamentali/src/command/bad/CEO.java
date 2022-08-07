package command.bad;

public class CEO extends Impiegato{

	public CEO(String name, String surname, String id) {
		super(name, surname, id);
	}
	
	public void licenzia(Filiale filiale, Impiegato imp) {
		filiale.getImpiegati().remove(imp);
	}
	
	public void assumi(Filiale filiale, Impiegato imp) {
		filiale.getImpiegati().add(imp);
	}
}
