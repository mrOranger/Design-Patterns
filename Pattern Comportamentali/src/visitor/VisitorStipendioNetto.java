package visitor;

public class VisitorStipendioNetto implements VisitorStipendio{

	@Override
	public double calcolaStipendio(Dirigente dirigente) {
		return dirigente.getStipendio()*0.6;
	}

	@Override
	public double calcolaStipendio(Programmatore programmatore) {
		return programmatore.getStipendio()*0.55;
	}

	@Override
	public double calcolaStipendio(Segretario segretario) {
		return segretario.getStipendio()*0.5;
	}
}
