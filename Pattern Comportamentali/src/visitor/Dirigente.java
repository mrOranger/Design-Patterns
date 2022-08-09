package visitor;

public class Dirigente extends Impiegato{

	public Dirigente(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}
	
	@Override
	public double calcolaStipedio(VisitorStipendio visitorStipendio) {
		return visitorStipendio.calcolaStipendio(this);
	}
	
	@Override
	public String toString() {
		return "Dirigente: " + super.toString();
	}
}
