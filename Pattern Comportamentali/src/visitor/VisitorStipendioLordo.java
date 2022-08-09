package visitor;

public class VisitorStipendioLordo implements VisitorStipendio{

	@Override
	public double calcolaStipendio(Dirigente dirigente) {
		return dirigente.getStipendio();
	}

	@Override
	public double calcolaStipendio(Programmatore programmatore) {
		return programmatore.getStipendio();
	}

	@Override
	public double calcolaStipendio(Segretario segretario) {
		return segretario.getStipendio();
	}
}
