package iterator;

import java.util.ArrayList;
import java.util.List;

public class ComitivaList implements Aggregate<Persona>{
	
	private List<Persona> persone;
	
	public ComitivaList() {
		this.persone = new ArrayList<>();
	}
	
	public void addPersona(Persona persona) {
		this.persone.add(persona);
	}
	
	public List<Persona> getPersone() {
		return this.persone;
	}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		for(var persona : this.persone) {
			stringBuilder.append(persona.toString() + '\n');
		}
		return stringBuilder.toString();
	}

	@Override
	public Iteratore<Persona> getIterator() {
		return new IteratoreList<Persona>(persone);
	}
}
