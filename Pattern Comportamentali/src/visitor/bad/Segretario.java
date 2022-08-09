package visitor.bad;

public class Segretario extends Impiegato{

	public Segretario(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public double calcolaStipedio() {
		return 22000d;
	}
	
	@Override
	public String toString() {
		return "Segretario: " + super.toString();
	}
}
