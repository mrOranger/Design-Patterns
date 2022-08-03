package abstractFactory;

/*
 * Interfaccia Factory che definisce il comportamento di tutte le altre factory
 * presenti nel progetto e che restituisce un AbstractProduct.
 */
public interface AbstractFactory {
	public abstract Tablet creaTablet();
	public abstract Computer creaComputer();
}
