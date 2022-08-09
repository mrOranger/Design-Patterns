package visitor.bad;

public class Client {

	public static void main(String[] args) {
		
		Impiegato dirigente = new Dirigente("Mario", "Rossi", 30000);
		Programmatore programmatore = new Programmatore("Federica", "Verdi", 27000);
		Segretario segretario = new Segretario("Michele", "Bruni", 25000);
		
		System.out.println(dirigente);
		System.out.println(programmatore);
		System.out.println(segretario);
	}
}
