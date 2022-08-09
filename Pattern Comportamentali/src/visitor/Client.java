package visitor;

public class Client {

	public static void main(String[] args) {
		
		Impiegato dirigente = new Dirigente("Mario", "Rossi", 30000);
		Programmatore programmatore = new Programmatore("Federica", "Verdi", 27000);
		Segretario segretario = new Segretario("Michele", "Bruni", 25000);
		
		System.out.println(dirigente + 
				" l. " + dirigente.calcolaStipedio(new VisitorStipendioLordo()) + 
				" n." + dirigente.calcolaStipedio(new VisitorStipendioNetto()));
		System.out.println(programmatore +
				" l. " + programmatore.calcolaStipedio(new VisitorStipendioLordo()) + 
				" n. " + programmatore.calcolaStipedio(new VisitorStipendioNetto()));
		System.out.println(segretario + 
				" l. " + programmatore.calcolaStipedio(new VisitorStipendioLordo()) +
				" n. " + programmatore.calcolaStipedio(new VisitorStipendioNetto()));
	}
}
