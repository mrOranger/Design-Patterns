package visitor.bad;

public class Dirigente extends Impiegato{

	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public double calcolaStipedio() {
		return 30000d;
	}
	
	@Override
	public String toString() {
		return "Dirigente: " + super.toString();
	}
}
