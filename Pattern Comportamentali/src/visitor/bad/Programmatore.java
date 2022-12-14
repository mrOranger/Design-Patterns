package visitor.bad;

public class Programmatore extends Impiegato
{
	public Programmatore(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}
	
	@Override
	public double calcolaStipedioLordo() {
		return this.getStipendio();
	}

	@Override
	public double calcolaStipendioNetto() {
		return this.getStipendio()*0.55;
	}

	@Override
	public String toString() {
		return "Programmatore: " + super.toString();
	}
}
