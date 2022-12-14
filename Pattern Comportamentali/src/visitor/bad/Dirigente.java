package visitor.bad;

public class Dirigente extends Impiegato{

	public Dirigente(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}

	@Override
	public double calcolaStipedioLordo() {
		return this.getStipendio();
	}

	@Override
	public double calcolaStipendioNetto() {
		return this.getStipendio()*0.6;
	}
	
	@Override
	public String toString() {
		return "Dirigente: " + super.toString();
	}
}
