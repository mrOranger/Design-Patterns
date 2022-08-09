package visitor.bad;

public class Client {

	public static void main(String[] args) {
		
		Impiegato dirigente = new Dirigente("Mario", "Rossi");
		Programmatore programmatore = new Programmatore("Federica", "Verdi");
		Segretario segretario = new Segretario("Michele", "Bruni");
		
		System.out.println(dirigente);
		System.out.println(programmatore);
		System.out.println(segretario);
	}
}
