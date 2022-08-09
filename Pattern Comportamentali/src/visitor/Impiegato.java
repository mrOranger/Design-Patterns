package visitor;

public abstract class Impiegato {
	
	private String nome;
	private String cognome;
	private double stipendio;
	
	public Impiegato(String nome, String cognome, double stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.setStipendio(stipendio);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public abstract double calcolaStipedio(VisitorStipendio visitorStipendio);
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome;
	}
}
