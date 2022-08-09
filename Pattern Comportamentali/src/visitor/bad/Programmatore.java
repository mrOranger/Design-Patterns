package visitor.bad;

public class Programmatore extends Impiegato
{
	public Programmatore(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public double calcolaStipedio() {
		return 25000d;
	}
	
	@Override
	public String toString() {
		return "Programmatore: " + super.toString();
	}
}
