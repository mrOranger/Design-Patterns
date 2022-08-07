package command;

import java.util.ArrayList;
import java.util.List;

public class Filiale {
	
	private List<Impiegato> impiegati;
	private String name;
	
	public Filiale(String name) {
		this.impiegati = new ArrayList<>();
		this.name = name;
	}

	public List<Impiegato> getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(List<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addImpiegato(Impiegato impiegato) {
		this.impiegati.add(impiegato);
	}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Filiale: " + this.name + '\n');
		stringBuilder.append("Impiegati registrati: " + '\n');
		for(var impiegato : this.impiegati) {
			stringBuilder.append('\t' + impiegato.toString() + '\n');
		}
		return stringBuilder.toString();
	}
}
