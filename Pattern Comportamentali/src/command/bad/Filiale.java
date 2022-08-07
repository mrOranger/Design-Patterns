package command.bad;

import java.util.ArrayList;
import java.util.Collection;

public class Filiale {
	
	private Collection<Impiegato> impiegati;
	private String name;
	
	public Filiale(String name) {
		this.impiegati = new ArrayList<>();
		this.name = name;
	}

	public Collection<Impiegato> getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(Collection<Impiegato> impiegati) {
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
