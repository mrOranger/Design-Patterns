package iterator.bad;

public class Client {
	
	public static void main(String[] args) {
		
		var comitivaList = new ComitivaList();
		var comitivaMap = new ComitivaMap();
		
		comitivaList.addPersona(new Persona("A", "B", "1"));
		comitivaList.addPersona(new Persona("B", "C", "2"));
		comitivaList.addPersona(new Persona("C", "D", "3"));
		comitivaList.addPersona(new Persona("D", "E", "4"));
		
		comitivaMap.addPersona(new Persona("A", "B", "1"));
		comitivaMap.addPersona(new Persona("B", "C", "2"));
		comitivaMap.addPersona(new Persona("C", "D", "3"));
		comitivaMap.addPersona(new Persona("D", "E", "4"));
		
		/*
		 * Non esiste un metodo di accesso uniforme alle strutture dati
		 * violando il princio dell'incapsulamento.
		 */
		for(var persona : comitivaList.getPersone()) {
			System.out.println(persona);
		}
		
		for(var persona : comitivaMap.getPersone().entrySet()) {
			System.out.println(persona);
		}
	}
}
