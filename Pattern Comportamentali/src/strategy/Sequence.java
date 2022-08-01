package strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Sequence rappresenta la classe Context che contiene
 * un riferimento ad una classe ConcreteStrategy usando l'interfaccia Strategy,
 * quindi richiama il metodo definito in questa.
 */
public class Sequence<T> {
	
	private List<T> list;
	private Printable printStrategy;
	
	public Sequence(Printable printStrategy) {
		this.list = new ArrayList<>();
		this.printStrategy = printStrategy;
	}
	
	public void setStrategy(Printable printStrategy) {
		this.printStrategy = printStrategy;
	}
	
	public void add(T elem) {
		this.list.add(elem);
	}
	
	public void add(Collection<T> elems) {
		this.list.addAll(elems);
	}
	
	public List<T> getList(){
		return this.list;
	}
	
	public void setList(List<T> list) {
		this.list = list;
	}
	
	public void print() {
		this.printStrategy.print(this);
	}
}
