package iterator;

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
		
		
		System.out.println("Itero sulla lista");
		var iteratoreList = comitivaList.getIterator();
		while(iteratoreList.hasNext()) {
			System.out.println(iteratoreList.getNext());
		}
		
		System.out.println("Itero sulla mappa");
		
		var iteratoreMap = comitivaMap.getIterator();
		while(iteratoreMap.hasNext()) {
			System.out.println(iteratoreMap.getNext());
		}
	}
	
}
