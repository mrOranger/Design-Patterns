package strategy;


/*
 * L'interfaccia che definisce la logica della classe Strategy,
 * con il relativo metodo che esegue qualcosa all'interno di Sequence.
 */
public interface Printable {
	public abstract void print(Sequence<?> list);
}
