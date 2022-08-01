package decorator;

/*
 * Vehicle rappresenta l'interfaccia comune, NECESSARIA per realizzare questo pattern.
 * In quanto deve essere necessario mantenere un riferimento comune all'interno di un 
 * contenitore.
 */
public interface Vehicle {
	public abstract void start();
}
