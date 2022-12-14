package visitor.bad;

public class Segretario extends Impiegato{

	public Segretario(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}
	
	@Override
	public double calcolaStipedioLordo() {
		return this.getStipendio();
	}

	@Override
	public double calcolaStipendioNetto() {
		return this.getStipendio()*0.5;
	}
	
	@Override
	public String toString() {
		return "Segretario: " + super.toString();
	}
}
