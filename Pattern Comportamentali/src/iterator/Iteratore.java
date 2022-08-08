package iterator;

public interface Iteratore<T> {
	
	public abstract T getFirst();
	public abstract T getNext();
	public abstract boolean hasNext();
	
}
