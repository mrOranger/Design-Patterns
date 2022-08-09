package visitor;

public interface VisitorStipendio {

	public abstract double calcolaStipendio(Dirigente dirigente);
	public abstract double calcolaStipendio(Programmatore programmatore);
	public abstract double calcolaStipendio(Segretario segretario);
	
}
