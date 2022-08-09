package visitor;

public class Segretario extends Impiegato{

	public Segretario(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}
	
	@Override
	public double calcolaStipedio(VisitorStipendio visitorStipendio) {
		return visitorStipendio.calcolaStipendio(this);
	}

	@Override
	public String toString() {
		return "Segretario: " + super.toString();
	}
}
