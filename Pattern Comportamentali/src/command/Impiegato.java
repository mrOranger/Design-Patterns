package command;

public class Impiegato {
	
	private String name;
	private String surname;
	private String id;
	
	public Impiegato(String name, String surname, String id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Impiegato: " + this.name + " " + this.surname + " id." + this.id;
	}
}
