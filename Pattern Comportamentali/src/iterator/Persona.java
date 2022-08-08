package iterator;

public class Persona {
	
	private String nome;
	private String cognome;
	private String id;
	
	public Persona(String nome, String cognome, String id) {
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + " id." + this.id;
	}
}
