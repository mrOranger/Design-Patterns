package visitor;

public class Programmatore extends Impiegato
{
	public Programmatore(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
	}
	
	@Override
	public double calcolaStipedio(VisitorStipendio visitorStipendio) {
		return visitorStipendio.calcolaStipendio(this);
	}

	@Override
	public String toString() {
		return "Programmatore: " + super.toString();
	}

}
