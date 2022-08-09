package visitor.bad;

public abstract class Impiegato {
	
	private String nome;
	private String cognome;
	
	public Impiegato(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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
	
	public abstract double calcolaStipedio();
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + " " + this.calcolaStipedio();
	}
}
