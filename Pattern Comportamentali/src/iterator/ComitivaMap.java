package iterator;

import java.util.HashMap;
import java.util.Map;

public class ComitivaMap implements Aggregate<Persona>{
	
	private Map<String, Persona> persone;
	
	public ComitivaMap() {
		this.persone = new HashMap<>();
	}
	
	public Map<String, Persona> getPersone() {
		return this.persone;
	}
	
	public void addPersona(Persona persona) {
		this.persone.put(persona.getId(), persona);
	}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		for(var persona : this.persone.entrySet()) {
			stringBuilder.append("id. " + persona.getKey() + " " + persona.getValue().toString() + '\n');
		}
		return stringBuilder.toString();
	}

	@Override
	public Iteratore<Persona> getIterator() {
		return new IteratoreMap<String, Persona>(this.persone);
	}
}
